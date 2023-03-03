def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.set = set ( )
        N = sc.count ( )
        for s in sc :
            c = s [ 0 ]
            self.set.add ( c )
        print ( "Three" if len ( self.set ) == 3 else "Four" )
