s = input()
len_s = len(s)
ans=0
def dfs(x,len_x,i=0):
        global ans
        if i < len_x:
                dfs(x,len_x,i=i+1)
                x=x[:i+1] + "+" + x[i+1:]
                dfs(x,len_x + 1,i=i+2)
                ans+=sum([int(k) for k in x.split("+")])
dfs(s,len_s-1)
print(ans+int(s))