def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.lists = [ [ ] for i in range ( 1 , n + 1 ) ]
        self.costs = [ ]
        self.costs = [ ]
        self.q = len ( sys.argv )
        self.k = len ( sys.argv )
        self.set_cost ( 0 , k )
        lines = [ ]
        for i in range ( self.q ) :
            x = self.x
            y = self.y
            lines.append ( costs [ x ] + costs [ y ] + "\n" )
        print ( lines , end = "" )
    def set_cost ( self , total , idx ) :
        if self.costs [ idx ] == - 1 :
            self.costs [ idx ] = total
            for r in self.lists [ idx ] :
                set_cost ( total + r.cost , r.point )
