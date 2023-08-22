import requests # requests 라이브러리 설치 필요

r = requests.get('http://spartacodingclub.shop/sparta_api/seoulair') # 미세먼지 API
rjson = r.json()

# print(rjson['RealtimeCityAir']['row'])
rows = rjson['RealtimeCityAir']['row']

for a in rows:
    gu_name = a['MSRSTE_NM']
    gu_mies = a['IDEX_MVL']
    print(gu_name,gu_mies)