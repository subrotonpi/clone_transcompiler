def _import ( ) :
    import math
    import numpy as np
    class A :
        def p ( * x ) :
            print ( np.sum ( x ) )
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as infile :
            T = len ( infile )
            for zz in range ( 1 , T + 1 ) :
                A = np.arange ( A )
                B = np.arange ( B )
                P = np.linalg.pinv ( P )
                ans = B + 2
                p = 1.0
                for l in range ( 0 , A ) :
                    a1 = ( A - l ) + ( B - l ) + 1
                    a2 = ( A - l ) + ( B - l ) + 1 + B + 1
                    ans = min ( ans , p * a1 + ( 1 - p ) * a2 )
                    if l < A :
                        p *= P [ l ]
                print ( 'Case #%d: %.09f\n' % ( zz , ans ) )
