from functools import reduce
import math

def main():
    # ????2????????
    # '101' ? '5'
    # ??????'0b'????int()????
    # binary = int('0b'+'101',0)

    # 2????????bit????
    # 101(0x5) ? 2
    # cnt_bit = bin(5).count('1')
    
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
    N,T = (int(_) for _ in input().split())
    t = list(int(_) for _ in input().split())
    sum = T
    for i in range(1,N):
        if(t[i]-t[i-1] > T):
            sum += T
        else:
            sum += t[i]-t[i-1]
    print(sum)
if __name__ == '__main__':
    main()