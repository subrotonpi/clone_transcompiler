def main ( ) :
    import sys
    from time import sleep
    from math import sqrt
    from math import log
    from math import log
    N = int ( ceil ( sqrt ( 10 ) ) )
    ans = ""
    while N != 0 :
        if N % 2 :
            N -= 1
            N /= ( - 2 )
            ans = "1" + ans
        else :
            ans = "0" + ans
            N /= - 2
    if ans == "" :
        ans = "0"
    print ( ans )
