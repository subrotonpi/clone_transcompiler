def round1c ( ) :
    import os
    import os
    import os
    import sys
    import os
    import math
    import os
    import os
    import os
    import os
    import os
    import os
    import os
    import stat
    class UglyNumbers ( object ) :
        def __init__ ( self , test ) :
            self.res = [ '0' ] * len ( self.res ) + [ '0' ] * len ( self.res )
            self.res = self.res - self.res [ 6 ] - self.res [ 10 ] - self.res [ 15 ] - self.res [ 21 ] - self.res [ 30 ] + self.res [ 42 ] + self.res [ 70 ] + self.res [ 105 ]
            self.res = self.res - self.res [ 210 ]
        def __repr__ ( self ) :
            return "Case #%s: %s\n" % ( test , self.res )
    sc = os.popen ( 'B-large.in' )
    wr = open ( 'b.out' , 'w' )
    n = sc.readline ( ).strip ( )
    sc.close ( )
    for test in range ( 1 , n + 1 ) :
        s = sc.readline ( )
        self.res = [ s [ 0 ] ]
        self.big = [ [ i , j ] for i in range ( len ( s ) + 1 ) ]
        for i in range ( 0 , len ( s ) ) :
            for j in range ( i + 1 , len ( s ) ) :
                self.big [ i ] [ j ] = random.choice ( s )
