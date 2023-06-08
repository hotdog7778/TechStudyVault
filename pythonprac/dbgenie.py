########################## DB 연결 정보 ##########################
from pymongo import MongoClient
#client = MongoClient('mongodb+srv://sparta:test@cluster0.zlnt7r2.mongodb.net/?retryWrites=true&w=majority')
db = client.dbsparta 

########################## 크롤링 ##########################
import requests
from bs4 import BeautifulSoup

# Q1. 지니뮤직의 1~50위 곡을 스크래핑 해보세요.
# Q2. 순위 / 곡 제목 / 가수를 스크래핑 하면 됩니다.
URL = "https://www.genie.co.kr/chart/top200?ditc=M&rtm=N&ymd=20230101"
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(URL, headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

trs = soup.select('#body-content > div.newest-list > div > table > tbody > tr')                         
#print(title.text.strip()) # Ditto
for tr in trs:
    # 순위 number
    # 곡제목 title ellipsis
    # 가수명 artist ellipsis

    rank = tr.select_one('.number').text[0:2].strip()
    song = tr.select_one('.title').text.strip()
    singer = tr.select_one('.artist').text
    print(rank,song,singer)

########################## DB로 insert ##########################

    doc = {
        'rank':rank,
        'song':song,
        'singer':singer
    }
    db.genieTop50.insert_one(doc)