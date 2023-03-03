def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        set ( sc.readline ( ).split ( ) )
        print ( ( len ( set ( ) ) == 3 ) and "Three" or "Four" )
