def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = sc.readline ( ).strip ( )
        B = sc.readline ( ).strip ( )
        nCr = [ [ 0 ] * ( N + 1 ) ] * ( N + 1 )
        nCr [ 0 ] [ 0 ] = 0
        for row in range ( 1 , N + 1 ) :
            nCr [ row ] [ 0 ] = 1
            for col in range ( 1 , row - 1 ) :
                nCr [ row ] [ col ] = nCr [ row - 1 ] [ col - 1 ] + nCr [ row - 1 ] [ col ]
            nCr [ row ] [ row ] = 1
        v = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        v = [ v [ i ] for i in v if i != 0 ]
        sum1 = 0
        for i in v [ N - 1 ] [ N - A - 1 : ] :
            sum1 += v [ i ]
        ans1 = sum1 / ( float ( A ) )
        cnt1 = cnt2 = 0
        for i in v [ N - 1 ] [ N - A - 1 : ] :
            if i > v [ N - A - 1 ] :
                cnt1 += 1
            if i == v [ N - A - 1 ] :
                cnt2 += 1
        ans2 = 0
        if v [ N - A ] < v [ N - 1 ] :
            ans2 = nCr [ cnt2 ] [ A - cnt1 ]
        else :
            for i in range ( A , min ( B , cnt2 ) + 1 ) :
                ans2 += nCr [ cnt2 ] [ i ]
        print ( ans1 )
        print ( ans2 )
