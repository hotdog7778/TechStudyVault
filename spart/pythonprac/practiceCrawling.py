import requests
from bs4 import BeautifulSoup

URL = "https://movie.daum.net/ranking/reservation"
headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
data = requests.get(URL, headers=headers)
soup = BeautifulSoup(data.text, 'html.parser')

# print(soup) # 페이지의 HTML이 출력된다.

title = soup.select_one('#mainContent > div > div.box_ranking > ol > li:nth-child(1) > div > div.thumb_cont > strong > a') 
                        # 위에 URL 들어가서 예매율 1등 영화 제목 우클릭 > 검사 > 드래그되어있는 곳 우클릭 > 복사 > selector복사 한 값을 넣었습니다.

print(title) # <a class="link_txt" data-tiara-layer="moviename" href="/moviedb/main?movieId=160244">범죄도시3</a>
print(title.text) # 범죄도시 3
print(title['class']) # ['link_txt']