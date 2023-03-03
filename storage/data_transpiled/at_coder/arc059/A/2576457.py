def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        res = sys.maxint
        for t in range ( - 100 , 100 + 1 ) :
            s = 0
            for i in range ( N ) :
                s += sum ( a [ i ] - t )
            res = min ( s , res )
        print ( res )
