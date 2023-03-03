def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
    s = [ ]
    ans = 0
    for line in sys.stdin :
        line = line.rstrip ( )
        for i in range ( self.N ) :
            s.append ( line [ i ] )
    for A in range ( self.N ) :
        good = True
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                tmp_i = ( i + A ) % self.N
                tmp_j = ( j + A ) % self.N
                if s [ tmp_i ] [ j ] != s [ tmp_j ] [ i ] :
                    good = False
        if good :
            ans += 1
    print ( ans * self.N )
