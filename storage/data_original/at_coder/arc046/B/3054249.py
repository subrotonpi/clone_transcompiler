N=int(input())
A,B=map(int,input().split())
if A==B:
    if N%(A+1) != 0:
        print("Takahashi") 
    else:
        print("Aoki")
else:
    if A>B:
        print("Takahashi") 
    else:
        if N<=A:
            print("Takahashi") 
        else:
            print("Aoki")