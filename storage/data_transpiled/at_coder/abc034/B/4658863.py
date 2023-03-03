def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        print ( ( a % 2 == 0 ) and a - 1 or a + 1 )
