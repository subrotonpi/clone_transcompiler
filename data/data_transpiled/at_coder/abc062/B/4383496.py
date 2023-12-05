def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __call__ ( self , * args ) :
        h , w = self.sc.split ( ':' )
        s = [ ]
        for i in range ( h ) :
            s.append ( _main ( i ) )
        s = [ ]
        for i in range ( w + 2 ) :
            s.append ( '#' * ( h - i ) )
        print ( s )
        for i in range ( h ) :
            print ( '#' * ( w - i ) )
        print ( s )
