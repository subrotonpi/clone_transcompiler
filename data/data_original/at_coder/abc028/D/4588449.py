n,k = map(int,input().split())

ans = 0

#k???????
ans += (1/n)*(1/n)*(1/n)

#k?2?????
ans += 3*(1/n)*(1/n)*((n-1)/n)

#k?1??k???????1??k???????1?????
ans += 6*(1/n)*((k-1)/n)*((n-k)/n)

print(ans)