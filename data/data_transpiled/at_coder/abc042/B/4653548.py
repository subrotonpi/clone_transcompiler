def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        L = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( N ) ]
        a = [ sc.readline ( ).strip ( ) for i in a ]
        a = [ sc.readline ( ).strip ( ) for i in a ]
        for s in a :
            sys.stdout.write ( s )
        sys.stdout.write ( "\n" )
