def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        self.k = len ( _main ( ) )
        ts = [ ]
        for i in range ( 1 , k + 1 ) :
            for j in range ( len ( _main ( ) ) - i + 1 ) :
                ts.append ( _main ( ) [ j : j + i ] )
        ts = sorted ( ts )
        print ( ts [ k - 1 ] )
