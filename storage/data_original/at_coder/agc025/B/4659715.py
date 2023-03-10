p=998244353
def getinv(n):
  inv = [0]*(n+1)
  #????????????i=1???1?????????
  inv[1] = 1
  for i in range(2,n+1):
    #???????????????????????mod p??????????
    inv[i] = (-(p//i)*inv[p%i])%p
  return inv

def getCmb(n):
  #?????
  inv = getinv(n)
  #0 <= r <= n ????nCr????
  nCr = [0]*(n+1)
  #r=0????r-1?????????????
  nCr[0] = 1
  for i in range(1,n+1):
    #i???????inv[i]????mod p????
    nCr[i] = (nCr[i-1]*(n-i+1)*inv[i])%p
  return nCr

def solve(n,a,b,k):
  nCr = getCmb(n)
  ans=0
  for i in range(n+1):
    #????????????????????a*i+b*j==k???????????
    j = (k-a*i)//b
    #?????????????j??????
    if a*i + b*j == k and 0<=j<=n:
      ans+= (nCr[i]*nCr[j])%p
      ans%= p
  return ans

n,a,b,k=map(int,input().split())
print(solve(n,a,b,k))