def import _solve_possible
class B ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for t in range ( 1 , T + 1 ) :
            self.N = int ( self.N )
            self.P = int ( self.P )
            print ( "Case #%d: %d %d" % ( t , self.solve_possible ( 1 << self.N , self.P ) - 1 , self.solve_possible ( 1 << self.N , self.P ) - 1 ) )
    def solve_possible ( self , n , p ) :
        if p == n : return n
        if p <= n / 2 : return 1
        return self.solve_possible ( n / 2 , p - n / 2 ) * 2 + 1
    def solve_possible ( self , n , p ) :
        if p == n : return n
        if p >= n / 2 : return n - 1
        c = solve_possible ( n / 2 , p )
        return c + c - 1
