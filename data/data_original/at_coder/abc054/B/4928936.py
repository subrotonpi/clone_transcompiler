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
    N,M = (int(_) for _ in input().split())
    A =[]
    B =[]
    for i in range(N):
        A.append(list(_ for _ in input()))
    for i in range(M):
        B.append(list(_ for _ in input()))

    for i in range(N-M+1):
        for j in range(N-M+1):
            # check
            flag = True
            for k in range(M):
                for l in range(M):
                    if A[i+k][j+l] != B[k][l]:
                        flag = False
                        break
            if(flag):
                ans = 'Yes'
                print(ans)
                exit()
            else:
                ans = 'No'


    print(ans)

if __name__ == '__main__':
    main()