def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        a , b , c = self.sc.split ( )
        print ( b [ 0 ] == a [ - 1 ] and c [ 0 ] == b [ - 1 ] and 'YES' or 'NO' )
