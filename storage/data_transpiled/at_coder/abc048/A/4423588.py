def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        s = s.split ( )
        for c in s :
            sys.stdout.write ( c [ 0 ] )
        sys.stdout.write ( "\n" )
