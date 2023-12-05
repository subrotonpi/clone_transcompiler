def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.L = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = [ ]
        self.knot = [ ]
        for i in range ( 1 , N + 1 ) :
            self.a.append ( self.a [ i ] )
        for i in range ( 1 , N - 1 ) :
            self.knot.append ( self.a [ i ] + self.a [ i + 1 ] )
    max = 0
    pos = - 1
    for i in range ( 1 , N ) :
        if self.knot [ i ] > max :
            max = self.knot [ i ]
            pos = i
    if max < L :
        print ( "Impossible" )
    else :
        print ( "Possible" )
        for i in range ( 1 , pos ) :
            print ( i )
        for i in range ( N - 1 , pos + 1 , - 1 ) :
            print ( i )
        print ( pos )
