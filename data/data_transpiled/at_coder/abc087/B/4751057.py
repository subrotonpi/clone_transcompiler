def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    A = sys.stdin.read ( )
    B = sys.stdin.read ( )
    C = sys.stdin.read ( )
    X = sys.stdin.read ( )
    res = 0
    for a in range ( 0 , A ) :
        for b in range ( 0 , B ) :
            c = ( X - a * 500 - b * 100 ) / 50
            if c >= 0 and c <= C :
                res += 1
    print ( res )
