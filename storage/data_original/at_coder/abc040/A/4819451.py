n, x = map(int, input().split())
print(n-x if (x > n/2) else x-1)