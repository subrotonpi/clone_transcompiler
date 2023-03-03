def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.L = sys.maxint
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.N
        self.L = sc.L
        self.a = [ ]
        self.knot = [ ]
        for i in range ( 1 , N + 1 ) :
            self.a.append ( sc.randint ( 0 , N ) )
        for i in range ( 1 , N - 1 ) :
            self.knot.append ( self.a [ i ] + self.a [ i + 1 ] )
        self.max = None
        pos = - 1
        for i in range ( 1 , N ) :
            if self.knot [ i ] > self.max :
                self.max = self.knot [ i ]
                pos = i
        if self.max < self.L :
            print ( "Impossible" )
        else :
            print ( "Possible" )
            for i in range ( 1 , pos ) :
                print ( i )
            for i in range ( N - 1 , pos + 1 , - 1 ) :
                print ( i )
            print ( pos )
