def main ( ) :
    import math
    import numpy
    from numpy.core import zeros
    class Main ( object ) :
        def __init__ ( self ) :
            sc = zeros ( self.shape )
            N = sc.shape [ 0 ]
            K = sc.shape [ 1 ]
            scales = [ ]
            max = N - K + 1
            for i in range ( N ) :
                if i < K :
                    scales.append ( min ( max , i + 1 ) )
                elif i + K >= N :
                    scales.append ( min ( max , N - i ) )
                else :
                    scales.append ( min ( max , K ) )
            ans = 0
            for i in range ( N ) :
                value = sc.randint ( N , K )
                ans += value * scales [ i ]
            print ( ans )
