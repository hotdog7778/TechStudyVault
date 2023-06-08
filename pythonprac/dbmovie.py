from pymongo import MongoClient
client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta 

# 내 몽고DB 에서 영화 "슈가: 로드 투 디데이"의 평점 가져오기
movie = db.movies.find_one({'title':'슈가: 로드 투 디데이'})
# print(movie) # {'_id': ObjectId('6481c4d56e01ed539bffcdd7'), 'title': '스즈메의 문단속', 'rank': '16', 'rate': '7.3'}
# print(movie['rate']) # 7.3


# "슈가: 로드 투 디데이"와 평점이 같은 영화의 제목들 가져오기
target_rate = movie['rate']

# 내가 만든 똥
# all_movies = list(db.movies.find({},{'_id':False}))
# for a in all_movies:
#     if a['rate'] == target_rate:
#         print(a['title'])

# 강의에서 한거
# all_movies = list(db.movies.find({'rate':target_rate},{'_id':False}))
# for a in all_movies:
#     print(a['title'])

# "슈가: 로드 투 디데이" 평점을 0으로 만들기
db.movies.update_one({'title':'슈가: 로드 투 디데이'},{'$set':{'rate':0}})
print(movie) # 확인