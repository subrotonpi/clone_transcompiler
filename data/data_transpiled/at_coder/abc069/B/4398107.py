def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        s = self.sc.value
        length = len ( s )
        print ( "%s%s" % ( s [ 0 ] , length - 2 , s [ length - 1 ] ) )
