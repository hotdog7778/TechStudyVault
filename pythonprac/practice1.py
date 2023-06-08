# 변수
a = 2
b = 3
print(a+b)

# 자료형 list
c = ['사과','배','감']
print(c[0]) # 사과
print(c[1]) # 배

# 자료형 딕셔너리
d = { 'name':'영수', 'age':24 }
print(d)
print(d['name'])
print(d['age'])

# 함수
def hey(): # 함수를 선언하다.
    print('헤이!') # 파이썬에서는 ' : ' 이후에는 tab을 해줘야 한다.

hey() # 헤이!

##########

def sum(a,b,c):
    return a+b+c

result = sum(1,2,3)

print(result) # 6