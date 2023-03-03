def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        cnt = [ 0 ] * ( 200000 )
        for i in range ( N ) :
            if a [ i ] != 0 :
                cnt [ a [ i ] - 1 ] += 1
            cnt [ a [ i ] ] += 1
            cnt [ a [ i ] + 1 ] += 1
        res = 0
        for i in cnt :
            res = max ( res , i )
        print ( res )
