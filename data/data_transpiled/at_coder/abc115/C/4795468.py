def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.kind = None
        self.point = None
    def main ( self ) :
        with open ( self.path ) as f :
            N , K = self.shape
            heights = [ f.read ( ) for i in range ( N ) ]
            heights = [ h for h in heights if h ]
            min = float ( 'inf' )
            for i in range ( 0 , N + K - 1 ) :
                diff = heights [ i + K - 1 ] - heights [ i ]
                min = min ( diff , min )
            print ( min )
    class Pair ( object ) :
        def __init__ ( self , kind , point ) :
            self.kind = kind
            self.point = point
