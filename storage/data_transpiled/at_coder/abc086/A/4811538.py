def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        print ( 'Even' if sc.count ( ) * sc.count ( ) % 2 == 0 else 'Odd' )
