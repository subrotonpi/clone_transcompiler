def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.read ( )
            A = [ sc.read ( ) for i in range ( 1 , N + 1 ) ]
    ans = 0
    for i in range ( 1 , N + 1 ) :
        if A [ i ] % 2 == 1 :
            ans += A [ i ] / 2
            A [ i ] = 1
        elif A [ i ] % 2 == 0 and A [ i ] >= 2 :
            ans += ( A [ i ] - 2 ) / 2
            A [ i ] = 2
    for i in range ( 1 , N + 1 ) :
        if A [ i ] == 0 : continue
        if A [ i ] == 1 :
            if A [ i - 1 ] == 1 :
                ans += 1
                A [ i - 1 ] = 0
                A [ i ] = 0
        elif A [ i ] == 2 :
            if A [ i - 1 ] == 0 :
                ans += 1
                A [ i ] = 0
                A [ i ] = 1
            else :
                ans += 1
                A [ i - 1 ] = 0
                A [ i ] = 1
    print ( ans )
