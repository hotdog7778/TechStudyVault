# pymongo 라이브러리로 몽고DB에 붙는 방법
from pymongo import MongoClient
#client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
#client = MongoClient('mongodb+srv://<user>:<pass>@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta

# 데이터를 insert 하자.
doc = {
    'name':'영희',
    'age':30
}
db.users.insert_one(doc)

# 데이터를 전부 가져오자
all_users = list(db.users.find({},{'_id':False}))
for a in all_users:
    print(a)

# 데이터를 하나만 가져오자
user = db.users.find_one({})
user = db.users.find_one({},{'_id':False})
print(user)

# 데이터를 수정 해보자
db.users.update_one({'name':'영수'},{'$set':{'age':19}}) # 영수의 age를 19로 바꾸기

# 데이터를 삭제 해보자
db.users.delete_one({'name':'영수'})