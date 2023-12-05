def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        print ( sc.read ( 1 ) + ( 1 if sc.readline ( ) == '+' else - 1 ) * sc.readline ( ) )
