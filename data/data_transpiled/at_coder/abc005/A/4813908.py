def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        a = int ( sc.next ( ) )
        b = int ( sc.next ( ) )
        c = 0
        c = b / a
        print ( c )
        sys.stdout.flush ( )
        sc.close ( )
