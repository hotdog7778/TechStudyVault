from flask import Flask, render_template, request, jsonify
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

@app.route('/')
def home():
    return render_template('index.html')

@app.route("/mars", methods=["POST"])
def mars_post():
    # sample_receive = request.form['sample_give']
    # print(sample_receive)
    
    name_receive = request.form['name_give'] # fetch로 부터 이름 데이터를 받자
    address_receive = request.form['address_give'] # 주소 데이터를 받자
    size_receive = request.form['size_give'] # 평수 데이터를 받자
    
    doc = {
        'name':name_receive,
        'address':address_receive,
        'size':size_receive
    }
    db.mars.insert_one(doc)

    return jsonify({'msg':'저장완료!'})

@app.route("/mars", methods=["GET"])
def mars_get():
    
    # 데이터를 전부 가져오자
    mars_data = list(db.mars.find({},{'_id':False}))
    return jsonify({'result':mars_data}) # 이제 이걸 프론트엔드로(index.html) 전달하자


if __name__ == '__main__':
    app.run('0.0.0.0', port=5001, debug=True)