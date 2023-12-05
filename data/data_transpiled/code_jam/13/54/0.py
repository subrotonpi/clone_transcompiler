def _import ( ) :
    import math
    import numpy as np
    import numpy.fft as fft
    import numpy.fft as fft
    class D ( object ) :
        def p ( self , * args ) :
            print ( " ".join ( [ str ( x ) for x in args ] ) )
        def main ( self ) :
            with open ( self.filename ) as infile :
                T = len ( infile.read ( ) )
                for zz in range ( 1 , T + 1 ) :
                    start = infile.read ( )
                    N = len ( start )
                    st = 0
                    for i in range ( N ) :
                        if start [ i ] == 'X' :
                            st |= 1 << i
                DP = np.zeros ( ( 1 , N ) )
                DP [ : ] = [ - 1 ]
                DP [ ( 1 , N ) - 1 ] = 0
                print ( "Case #%d: %.12f\n" % ( zz , compute ( st ) ) )
    global N
    global DP
    DP = [ ]
    def compute ( at ) :
        if DP [ at ] != - 1 :
            return DP [ at ]
        ans = 0.0
        for i in range ( N ) :
            cost = N
            j = i
            while get ( at , j ) :
                j += 1
                cost -= 1
                if j == N :
                    j = 0
            ans += cost + compute ( at | ( 1 << j ) )
        ans /= N
        DP.append ( ans )
        return ans
    def get ( num , bit ) :
        return ( num & ( 1 << bit ) ) != 0
