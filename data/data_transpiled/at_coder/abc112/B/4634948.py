def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.T = self.T
        self.hairetu1 = [ ]
        self.hairetu2 = [ ]
        for i in range ( self.N ) :
            self.hairetu1.append ( self.hairetu1 [ i ] )
            self.hairetu2.append ( self.hairetu2 [ i ] )
        count = 0
        for i in range ( self.N ) :
            if self.hairetu2 [ i ] <= self.T :
                count += 1
        if count == 0 :
            print ( "TLE" )
            sys.exit ( )
        z = 0
        self.hairetu3 = [ ]
        for i in range ( self.N ) :
            if self.hairetu2 [ i ] <= self.T :
                self.hairetu3.append ( self.hairetu1 [ i ] )
                z += 1
        min = self.hairetu3 [ 0 ]
        for i in range ( self.count ) :
            if min > self.hairetu3 [ i ] :
                min = self.hairetu3 [ i ]
        print ( min )
