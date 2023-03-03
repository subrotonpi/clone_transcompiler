def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        plus = 200 * ( n / 15 )
        print ( n * 800 - plus )
