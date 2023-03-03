def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        for i in range ( len ( s ) ) :
            for j in range ( len ( s ) ) :
                if s [ i ] == s [ j ] and i != j :
                    print ( 'no' )
                    return
        print ( 'yes' )
