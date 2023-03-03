def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        num = sc.read ( ) * 2
        length = [ sc.read ( ) for i in range ( num ) ]
        length = [ length [ i ] for i in range ( num ) ]
        ans = 0
        for i in range ( num , 2 ) :
            ans += length [ i ]
        print ( ans )
