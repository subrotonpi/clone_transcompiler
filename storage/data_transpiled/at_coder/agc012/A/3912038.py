def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    a_ = [ sys.stdin.readline ( ) for i in range ( 3 * N ) ]
    a_.sort ( )
    ans = 0
    if N % 2 == 0 :
        for i in range ( N , 3 * N ) :
            if i % 2 == 0 :
                ans += a_ [ i ]
            else :
                pass
    else :
        for i in range ( N , 3 * N ) :
            if i % 2 != 0 :
                ans += a_ [ i ]
            else :
                pass
    print ( ans )
