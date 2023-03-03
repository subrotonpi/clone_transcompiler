def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        n , k = sc.readline ( ).split ( )
        ar = [ ]
        for i in range ( n ) :
            ar.append ( _sys.stdin.read ( ) )
        print ( int ( math.ceil ( float ( n - 1 ) / float ( k - 1 ) ) ) )
