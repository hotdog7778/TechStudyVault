from flask import Flask, render_template, request, jsonify
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta 

import requests
from bs4 import BeautifulSoup

@app.route('/')
def home():
    return render_template('index.html')

@app.route("/movie", methods=["POST"])
def movie_post():
    # URL과 코멘트를 받아야 한다.
    # sample_receive = request.form['sample_give']
    # print(sample_receive)
    url_receive = request.form['url_give']
    comment_receive = request.form['comment_give']
    star_receive = request.form['star_give']

    # 받아온 URL을 기반으로 크롤링을 해야한다.
    headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get(url_receive,headers=headers)
    soup = BeautifulSoup(data.text, 'html.parser')    
    
    ogtitle = soup.select_one('meta[property="og:title"]')['content']
    ogimage = soup.select_one('meta[property="og:image"]')['content']
    ogdesc = soup.select_one('meta[property="og:description"]')['content']
    
    # 크롤링 해온 og~~~ 들을 DB에 넣어줘야 한다.
    doc = {
        'title':ogtitle,
        'desc':ogdesc,
        'image':ogimage,
        #'url':url_receive,
        'star':star_receive,
        'comment':comment_receive
    }

    db.movies.insert_one(doc)
    
    # return jsonify({'msg':'POST 연결 완료!'})
    return jsonify({'msg':'저장 완료!'})

@app.route("/movie", methods=["GET"])
def movie_get():

    # db에서 이미지,코멘트,설명을 가져와서 프론트로 전달해주자.
    all_movies = list(db.movies.find({},{'_id':False}))
    return jsonify({'result':all_movies})
    # return jsonify({'msg':'GET 연결 완료!'})

if __name__ == '__main__':
    app.run('0.0.0.0', port=5001, debug=True)