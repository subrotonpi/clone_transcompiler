def main ( * argv ) :
    import os
    import sys
    from math import fabs
    import min
    class Main ( object ) :
        def __init__ ( self , * argv ) :
            sc = sys.stdin
            n = sc.randint ( 1 , 10000 )
            k = sc.randint ( 1 , 10000 )
            ans = 0
            for i in range ( n ) :
                x = sc.randint ( 1 , 10000 )
                ans += min ( x , abs ( k - x ) )
            print ( ans * 2 )
    return Main
