def gcj2009 ( qual = 'c' ) :
    import sys
    import os
    import sys
    import math
    class C ( object ) :
        INF = 1 << 20
        di = [ - 1 , 0 , 0 , 1 ]
        dj = [ 0 , - 1 , 1 , 0 ]
        key = "welcome to code jam".split ( )
        mod = 10000
        def run ( self ) :
            input = self.sc.readline ( ).decode ( )
            dp = [ 1 ]
            for c in input :
                for i in range ( len ( key ) - 1 , - 1 , - 1 ) :
                    if key [ i ] == c : dp [ i + 1 ] = ( dp [ i + 1 ] + dp [ i ] ) % mod
            print ( "%04d" % dp [ len ( key ) ] )
    def main ( * args ) :
        try :
            sys.stdin = open ( 'C-large.in' , 'r' )
            sys.stdout = open ( 'C-large.out' , 'w' )
        except :
            pass
        sc = sys.stdin
        T = sc.__next__ ( )
        sc.__next__ ( )
        for t in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % t )
            C ( )
    return C
