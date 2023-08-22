from flask import Flask, render_template, request, jsonify
app = Flask(__name__)

from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

@app.route('/')
def home():
    return render_template('index.html')

@app.route("/bucket", methods=["POST"])
def bucket_post():
    # sample_receive = request.form['sample_give']
    bucket_receive = request.form['bucket_give']
    doc = {
        'bucket':bucket_receive
    }
    db.bucket.insert_one(doc)
    # print(sample_receive)
    return jsonify({'msg': '저장 완료!'})
    
@app.route("/bucket", methods=["GET"])
def bucket_get():

    all_buckets = list(db.bucket.find({},{'_id':False}))

    return jsonify({'result': all_buckets})

if __name__ == '__main__':
    app.run('0.0.0.0', port=5001, debug=True)