n = int(input())
h = list(map(int,input().split(" ")))
 
 
dp = [float('inf')]*(n+10)
 
dp[0] = 0
dp[1] = min(dp[1],dp[1-1]+abs(h[1]-h[1-1]))
for i in range(2,n):
    dp[i] = min(dp[i],dp[i-1]+abs(h[i]-h[i-1]),dp[i-2]+abs(h[i]-h[i-2]))
 
print(dp[n-1])