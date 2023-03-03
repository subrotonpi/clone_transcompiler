def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        a = int ( sc.readline ( ) )
        b = a * 2
        trate = 0
        print ( b )
        sys.stdout.flush ( )
        sc.close ( )
