def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        r = [ [ sc.choice ( [ '-' , '' ] ) for i in range ( n ) ] for _ in range ( 2 ) ]
        b = [ [ sc.choice ( [ '-' , '' ] ) for i in range ( n ) ] for _ in range ( 2 ) ]
        buse = [ False for _ in range ( n ) ]
    def __init__ ( self ) :
        self.n = n
        self.r = r
        self.b = b
        self.buse = [ ]
    def __call__ ( self , * args ) :
        return self.n
