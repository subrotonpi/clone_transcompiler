def main ( argv = sys.argv ) :
    import random
    import sys
    import math
    class b ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
            self.stdout = sys.stdout
            self.T = self.s.T
    for t in range ( 1 , T + 1 ) :
        print ( "Case #%d: " % t , end = "" )
        N = len ( sys.argv )
        ts = [ random.randrange ( N ) for _ in range ( N ) ]
        ts = [ random.choice ( ts ) for _ in range ( N ) ]
        ts = [ random.choice ( ts ) for _ in range ( N ) ]
        gcd = ts [ 1 ] - ts [ 0 ]
        for i in range ( 2 , N ) :
            gcd = ts [ i ] - ts [ i - 1 ]
        print ( gcd - ts [ 0 ] % gcd , end = "" )
