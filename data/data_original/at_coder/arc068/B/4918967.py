from functools import reduce
import math

def main():
    # N! ????
    # f = math.factorial(N)
    
    # ????
    # 4 // 3
    # ????
    #-(-4 // 3)
    
    # ????:??????(100?)
    # 1e10

    # ????:??????(-100?)
    # -1e10
    
    # 1?????????
    # ??:2
    # a = input().rstrip()
    # ??:a='2'
    
    # ??????????????????????
    # ??:2 4 5 7
    # a, b, c, d = (int(_) for _ in input().split())  
    # ??:a=2 b=4 c=5 d =7
    
    # 1??????????????????
    # ??:2 4 5 7
    # a = list(int(_) for _ in input().split())
    # ??:a = [2, 4, 5, 7]    

    # 1??????????????????
    # ??:2457
    # a = list(int(_) for _ in input())
    # ??:a = [2, 4, 5, 7]    
    N = int(input().rstrip())
    A = list(int(_) for _ in input().split())
    dict = {}
    for a in A:
        if a in dict:
            dict[a] += 1
        else:
            dict[a] =1
    sum = 0
    for v in dict.values():
        if v >=2:
           sum += v -1
    if sum%2 == 0:
        ans = len(dict)
    else:
        ans = len(dict) - 1
    print(ans)
    
if __name__ == '__main__':
    main()