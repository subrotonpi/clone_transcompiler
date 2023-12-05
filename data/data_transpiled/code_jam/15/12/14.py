def import _scanner
class B ( int ) :
    def __init__ ( self ) :
        self.B = int
        self.N = long ( self.N )
    def solve ( self ) :
        self.N = long ( self.N )
        self.M = [ long ( self.N ) for i in range ( 1 , self.B + 1 ) ]
        print ( "Case #%d: %s" % ( self.case , self.solve ( ) ) )
    def solve ( self ) :
        if self.N <= self.B :
            return self.N
        time = self.get_haircuttime ( )
        customers = self.num_customers ( time )
        for i in range ( self.B , 0 , - 1 ) :
            if time % self.M [ i ] == 0 :
                if customers == self.N :
                    return i
                customers -= 1
        raise Exception
    def get_haircuttime ( self ) :
        min = 0
        max = 100_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_000_@@