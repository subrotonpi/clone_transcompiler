def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
        a = self.sc.a [ 0 ]
        b = self.sc.b [ 0 ]
        c = self.sc.c [ 0 ]
        print ( chr ( a - ord ( 'a' ) + ord ( 'A' ) ) , chr ( b - ord ( 'a' ) + ord ( 'A' ) ) , chr ( c - ord ( 'a' ) + ord ( 'A' ) ) )
