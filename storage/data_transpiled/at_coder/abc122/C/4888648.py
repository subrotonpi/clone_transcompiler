def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Q = sys.stdin.read ( )
        self.S = sys.stdin.read ( )
        self.num_array = [ ]
        count = 0
        self.num_array.append ( 0 )
        for i in range ( self.N - 1 ) :
            if self.S [ i ] == 'A' :
                if i < self.N - 1 and self.S [ i + 1 ] == 'C' :
                    count += 1
            self.num_array.append ( count )
        for i in range ( self.Q ) :
            start = self.N - 1
            end = self.Q - 1
            answer = self.num_array [ end - 1 ] - self.num_array [ start - 1 ]
            print ( answer )
