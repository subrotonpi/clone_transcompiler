def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        l = sc.readline ( ).strip ( )
        ar = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        ar = [ s for s in ar if s ]
        print ( ' '.join ( ar ) )
