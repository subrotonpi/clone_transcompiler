def import _solve
class WorldCup :
    def __init__ ( self ) :
        sc = _solve
        T = sc.__next__ ( )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s" % ( i , self.solve_case ( ) ) )
    def solve_case ( self ) :
        self.N = sc.__next__ ( )
        self.req = [ sc.__next__ ( ) for _ in range ( 1 , N ) ]
        self.cost = [ [ ] for _ in range ( self.N - 1 , - 1 , - 1 ) ]
        self.memo = [ [ ] for _ in range ( self.N + 1 , self.N ) ]
        for i in range ( self.N - 1 , - 1 , - 1 ) :
            self.cost.append ( [ ] )
            self.memo [ i ] = [ ]
            for arr in self.memo [ i ] :
                [ arr [ i ] ] = - 1
            for j in range ( self.cost [ i ] ) :
                self.cost [ i ].append ( sc.__next__ ( ) )
        return self.solve ( 0 , 0 , 0 )
    def solve ( self , index , level , count ) :
        if level >= self.N :
            return count >= self.N - self.req [ index ]
        if self.memo [ level ] [ count ] [ index ] == - 1 :
            skip = self.solve ( index * 2 , level + 1 , count ) + self.solve ( index * 2 + 1 , level + 1 , count )
            choose = self.solve ( index * 2 , level + 1 , count + 1 ) + self.solve ( index * 2 + 1 , level + 1 , count + 1 ) + self.cost [ level ] [ index ]
            self.memo [ level ] [ count ] [ index ] = min ( skip , choose )
        return self.memo [ level ] [ count ] [ index ]
