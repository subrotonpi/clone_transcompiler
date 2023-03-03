def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( sys.stdin.readline ( ) )
        self.Q = int ( sys.stdin.readline ( ) )
        self.S = sys.stdin.readline ( )
        self.lr = [ [ int ( x ) for x in self.lr ] for x in self.S ]
        self.AC = 'AC'
        self.counter = [ ]
        count = 0
        for i in range ( len ( self.S ) - 1 ) :
            self.counter.append ( count )
            if self.AC == self.S [ i ] [ 2 ] :
                count += 1
        self.counter.append ( [ count ] )
        for i in range ( self.Q ) :
            print ( self.counter [ lr [ i ] [ 1 ] - 1 ] [ 1 ] - self.counter [ lr [ i ] [ 0 ] - 1 ] [ 1 ] )
