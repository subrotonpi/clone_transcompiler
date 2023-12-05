def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        sum = 0
        for i in range ( 3 ) :
            s = sc.read ( )
            e = sc.read ( )
            sum += s * e / 10
        print ( sum )
