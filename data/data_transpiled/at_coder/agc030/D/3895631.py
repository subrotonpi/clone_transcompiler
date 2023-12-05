def _import ( ) : return atoi ( scanString ( ) )
def _import ( ) : return long ( scanString ( ) )
def _exit ( ) : return sys.exit ( )
def _import ( ) :
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import sys
    import subprocess
    import sys
    import struct
    import time
    import struct
    import sys
    import struct
    import sys
    import sys
    MOD = 1000000007
    HALF = ( MOD + 1 ) / 2
    def _add ( a , b ) :
        res = a + b
        return res - MOD if res >= MOD else res
    def _mul ( a , b ) :
        res = int ( long ( a ) * b % MOD )
        return res + MOD if res < 0 else res
    def solve ( ) :
        n , q = scanInt ( )
        a = [ ]
        for i in range ( n ) :
            a.append ( scanInt ( ) )
        v = [ ]
        for i in range ( n ) :
            for j in range ( n ) :
                v [ i ] [ j ] = 1 if a [ i ] < a [ j ] else 0
        for qq in range ( q ) :
            x , y = scanInt ( ) - 1 , scanInt ( ) - 1
            for i in range ( n ) :
                if i != x and i != y :
                    v [ i ] [ x ] = v [ i ] [ y ] = _mul ( v [ i ] [ x ] + v [ i ] [ y ] , HALF )
                    v [ x ] [ i ] = v [ y ] [ i ] = _mul ( v [ x ] [ i ] + v [ y ] [ x ] , HALF )
            v [ x ] [ y ] = v [ y ] [ x ] = _mul ( v [ x ] [ y ] + v [ y ] [ x ] , HALF )
        ans = 0
        for i in range ( n ) :
            for j in range ( i ) :
                ans = _add ( ans , v [ i ] )
        return ans
    return _import ( )
