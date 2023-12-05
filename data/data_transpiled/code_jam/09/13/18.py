def round1a ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class CollectingCards ( subprocess ) :
        INPUT = "test/round1a/C-large.in"
        OUTPUT = "test/round1a/C-large.out"
        oo = 100100
        c , n = 0 , 1 , 1
        def init_first ( self ) :
            self.th = [ [ 1 , 0 , 1 , 1 , 1 ] ]
            self.th [ 0 ] = [ 1 , 1 , 1 , 1 ]
            self.th [ 1 ] = [ 1 , 1 , 1 , 1 ]
            for c in range ( 2 , 40 ) :
                self.th [ c ] = [ 1 , 1 , 1 , 1 ]
                for n in range ( 1 , c + 1 ) :
                    self.th [ c ] [ n ] = self.th [ c - 1 ] [ n - 1 ] + self.th [ c - 1 ] [ n ]
        def init_all ( self ) :
            self.d = [ [ 1 , 0 , 1 , 0 ] for i in range ( 2 ) ]
            self.d [ 1 ] = [ 1 , 0 , 0 ]
            self.result = 0
        def process ( self ) :
            for i in range ( 1 , 1000 ) :
                for j in range ( 0 , c + 1 ) :
                    self.d [ 0 ] [ j ] = self.d [ 1 ] [ j ]
                self.d [ 1 ] = [ 0 , 0 , 0 ]
                for j in range ( n , c + 1 ) :
                    for k in range ( j - n , j + 1 ) :
                        self.d [ 1 ] [ j ] += self.d [ 0 ] [ k ] * self.th [ k ] [ n - j + k ] * self.th [ c - k ] [ j - k ] / self.th [ c ] [ n ]
            self.result += self.i * self.tmp
        print ( "result = %f" % self.result )
    return CollectingCards
