def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        k = sc.tell ( )
        for i in range ( k ) :
            if s [ i ] != '1' :
                print ( s [ i ] )
                return
        print ( 1 )
