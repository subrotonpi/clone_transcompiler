K = int(input())

a = K//50
b = K %50
Ans = [100+a-b]*b + [49+a-b]*(50-b)
print(50)
print(*Ans)