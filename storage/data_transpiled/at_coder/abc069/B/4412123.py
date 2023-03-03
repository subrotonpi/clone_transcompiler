def import _Scanner
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
    def main ( self ) :
        s = _Scanner ( )
        print ( "%s%s" % ( s [ 0 ] , ( len ( s ) - 2 ) , s [ - 1 ] ) )
