def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.Q = sys.stdin.readline ( ).split ( )
    def __init__ ( self ) :
        self.S = sys.stdin.readline ( ).split ( )
        self.l , self.r = [ ] , [ ]
        for i in range ( self.Q ) :
            self.l.append ( self.N )
            self.r.append ( self.N )
        letter = S.split ( )
        self.ac = [ 0 ]
        for i in range ( 1 , N ) :
            self.ac [ i ] = self.ac [ i - 1 ]
            if self.letter [ i - 1 ] == 'A' :
                if self.letter [ i ] == 'C' :
                    self.ac [ i ] += 1
        for i in range ( self.Q ) :
            print ( self.ac [ r [ i ] - 1 ] - self.ac [ l [ i ] - 1 ] )
