def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        self.k = len ( _main ( ) )
        if len ( _main ( ) ) < k :
            print ( 0 )
            return
        words = _main ( ) [ - k + 1 : ]
        words.sort ( )
        output = len ( words )
        for i in range ( 1 , len ( words ) ) :
            if words [ i - 1 ] == words [ i ] :
                output -= 1
        print ( output )
