import numpy as np

def main():
  mod = 10 ** 9 + 7

  n = int(input())
  nums = [-1]
  for _ in range(n):
      tmp = int(input())
      if nums[-1] != tmp:
          nums.append(tmp)
  #print(nums)

  m = len(nums)

  dp = [1 for _ in range(m)] # i?????????????i+1???????????????????
  colors = [0 for _ in range(max(nums) + 1)] #?????????i?????????

  for i in range(1, m):
    dp[i] = (dp[i - 1] + colors[nums[i]]) % mod #i????????????????????????i - 1????????????i???????????????
    colors[nums[i]] = dp[i]
    #print(dp, colors)


  print(dp[-1])
  

if __name__ == '__main__':
  main()