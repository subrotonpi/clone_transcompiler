def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        print ( n / 10 + n % 10 )
