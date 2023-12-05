def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    A = sys.stdin.read ( )
    B = sys.stdin.read ( )
    C = sys.stdin.read ( )
    X = sys.stdin.read ( )
    cnt = 0
    for i in range ( 0 , A ) :
        for j in range ( 0 , B ) :
            for k in range ( 0 , C ) :
                if i * 500 + j * 100 + k * 50 == X :
                    cnt += 1
    print ( cnt )
