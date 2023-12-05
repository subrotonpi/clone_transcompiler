def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a1 = _main ( )
        self.a2 = _main ( )
        self.a3 = _main ( )
        cost = abs ( max ( max ( a1 , a2 ) , a3 ) - min ( min ( a1 , a2 ) , a3 ) )
        self.cost = cost
