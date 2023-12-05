def _import ( ) :
    import sys
    import numpy as np
    import scipy.optimize
    class Main ( object ) :
        def max_of_array ( a ) :
            ans = a [ 0 ]
            for i in a [ 1 : ] :
                if i > ans :
                    ans = i
            return ans
        def min_of_array ( a ) :
            ans = a [ 0 ]
            for i in a [ 1 : ] :
                if i < ans :
                    ans = i
            return ans
        def cost ( array , target ) :
            ans = 0
            for n in array :
                ans += ( n - target ) ** 2
            return ans
        def main ( ) :
            sc = np.random.RandomState ( 0 )
            N = sc.randint ( N )
            a = np.array ( [ sc.randint ( N ) for n in range ( N ) ] )
            min = min_of_array ( a )
            max = max_of_array ( a )
            ans = np.inf
            for target in range ( min , max + 1 ) :
                ans = min ( ans , cost ( a , target ) )
            print ( ans )
    return Main
