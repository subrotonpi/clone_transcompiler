def _main ( ) :
    import sys
    import os
    import os
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            bf = sys.stdin
            out = sys.stdout
            s = bf.readline ( )
            n = len ( s )
            abc = set ( [ 'abc' , 'acb' , 'bac' , 'bca' , 'cab' , 'cba' ] )
            diff = 0
            for i in range ( n - 1 ) :
                if s [ i ] != s [ i + 1 ] :
                    diff += 1
            if n <= 2 :
                if s [ 0 ] == s [ 1 ] :
                    out.write ( 1 )
                else :
                    out.write ( 2 )
            elif s in abc :
                out.write ( '3' )
            elif diff == 0 :
                out.write ( '1' )
            else :
                mod = 998244353
                dp = [ [ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ,