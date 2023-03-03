def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    def __init__ ( self ) :
        self.a = [ ]
        self.b = [ ]
        for input in sys.stdin.read ( ).split ( ) :
            self.a.append ( input )
    def __init__ ( self ) :
        self.b = [ ]
        self.count = 0
        for i in range ( 2 * self.N ) :
            if self.b [ i ] == 0 :
                continue
            tmp_min = sys.maxint
            tmp_j = 2 * self.N
            f = False
            for j in range ( i - 1 , - 1 , - 1 ) :
                if self.a [ j ] != 0 :
                    if self.b [ i ] - self.a [ j ] > 0 and self.b [ i ] - self.a [ j ] < tmp_min :
                        tmp_min = self.b [ i ] - self.a [ j ]
                        tmp_j = j
                        f = True
            if f :
                self.a [ tmp_j ] = 0
                self.count += 1
                f = False
        print ( self.count )
