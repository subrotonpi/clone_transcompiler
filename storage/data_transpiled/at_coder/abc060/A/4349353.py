def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = self.sc.readline ( )
        b = a.split ( )
        print ( ( b [ 0 ] [ - 1 ] == b [ 0 ] [ 0 ] ) and b [ 1 ] [ - 1 ] == b [ 1 ] [ 0 ] )
