# ??
n,m=map(int,input().split())

# ??????60??360?????1??6??
b=m*6

# ??????12???360?????1???30??
# 12????????0?11????????
a=n%12*30

# ???2??????????1?????
# ????????????
a+=m/2

# ????????????
print(min(abs(a-b),360-abs(a-b)))