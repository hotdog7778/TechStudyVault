## 메타데이터를 이용해서 데이터 가져오는 기능 구현 연습

import requests
from bs4 import BeautifulSoup

URL = 'https://movie.daum.net/moviedb/main?movieId=161806'
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(URL,headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

# 여기에 코딩을 해서 meta tag를 먼저 가져와보겠습니다.
# 어느 사이트이던 공통된요소인 메타태그를 크롤링 해오는 일을 하는것입니다.
ogtitle = soup.select_one('meta[property="og:title"]')
print(ogtitle) # <meta content="스즈메의 문단속" property="og:title"/>

ogtitle = soup.select_one('meta[property="og:title"]')['content']
print(ogtitle) # 스즈메의 문단속

print("####################")

ogtitle = soup.select_one('meta[property="og:title"]')['content']
ogimage = soup.select_one('meta[property="og:image"]')['content']
ogdesc = soup.select_one('meta[property="og:description"]')['content']
print(ogtitle,ogimage,ogdesc)