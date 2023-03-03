def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
        self.N = self.N
        self.row = [ ]
        s = sys.stdin.read ( )
        for n in s.split ( ' ' ) :
            if n == 'E' :
                self.row.append ( True )
            else :
                self.row.append ( False )
        self.count_west = [ ]
        count = 0
        for i in range ( self.N ) :
            self.count_west.append ( count )
            if not self.row [ i ] :
                count += 1
        self.count_east = [ ]
        count = 0
        for i in range ( self.N - 1 , - 1 , - 1 ) :
            self.count_east.append ( count )
            if self.row [ i ] :
                count += 1
        min = sys.maxint
        for i in range ( self.N ) :
            val = self.count_west [ i ] + self.count_east [ i ]
            if min > val :
                min = val
        print ( min )
