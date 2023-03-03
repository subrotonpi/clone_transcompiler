def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.a , self.b = int ( self.a ) - 1 , int ( self.b ) - 1
        self.M = int ( self.M )
        self.E = [ [ ] for i in range ( self.N ) ]
    def __init__ ( self ) :
        self.E = [ [ ] for i in range ( self.M ) ]
    def __init__ ( self ) :
        self.cost = [ ]
        self.count = [ ]
        self.visited = [ ]
        self.cost.append ( self.INF )
        q = [ self.a ]
        self.cost.append ( self.cost )
        self.count.append ( 1 )
        self.visited.append ( True )
        while not self.q.empty ( ) :
            st = self.q.pop ( )
            for adj in self.E [ st ] :
                if self.cost [ st ] + 1 <= self.cost [ adj ] :
                    self.cost [ adj ] = self.cost [ st ] + 1
                    self.count [ adj ] += self.count [ st ]
                    if not self.visited :
                        self.q.append ( adj )
                    self.visited.append ( True )
        print ( self.count [ b ] % MODP )
