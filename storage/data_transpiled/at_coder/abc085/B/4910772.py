def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = sorted ( sc.readline ( ).strip ( ).split ( ' ' ) )
        print ( len ( a ) )
