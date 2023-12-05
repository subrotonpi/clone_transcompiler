def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = _main ( )
        self.x = _main ( )
    def __repr__ ( self ) :
        return '%s(%s)' % ( self.n , self.x )
    def index ( self ) :
        for i in range ( 5 ) :
            for j in range ( 5 ) :
                self.x [ index ( i ) ] = _main ( ) [ i ] [ j ]
        return '%s(%s)' % ( self.x [ index ( ) ] , self.x [ index ( ) ] )
    print ( '%s(%s)' % ( ', '.join ( str ( x ) for x in range ( 5 ) ) ) )
