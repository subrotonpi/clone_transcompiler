def main ( ) :
    import sys
    from random import randint
    from math import pow
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    p = int ( sys.stdin.readline ( ) )
    even = odd = 0
    for i in range ( n ) :
        a = pow ( a , 2 )
        if a % 2 == 0 :
            even += 1
        else :
            odd += 1
    if p == 0 :
        if odd == 0 :
            print ( long ( pow ( 2 , n ) ) )
        else :
            print ( long ( pow ( 2 , n - 1 ) ) )
    else :
        if odd == 0 :
            print ( 0 )
        else :
            print ( long ( pow ( 2 , n - 1 ) ) )
