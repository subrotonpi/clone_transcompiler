def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import shlex
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import shlex
    import string
    class _Scanner :
        def read ( self ) :
            try :
                fh = subprocess.PIPE
            except OSError :
                return None
            else :
                fh = open ( self.path )
                fh = subprocess.PIPE
        def readline ( self ) :
            if not fh or not fh.closed :
                return None
            fh = fh.readline ( )
            fh.close ( )
            return fh.read ( )
        def write ( self , fh ) :
            return int ( fh.readline ( ) )
    def solve ( test_number , f , out ) :
        MOD = 998244353
        n = len ( f.readline ( ) )
        p = [ ]
        for i in range ( n ) :
            x = f.readline ( )
            y = f.readline ( )
            p.append ( ( x , y , i ) )
        p2 = [ 1 ]
        for i in range ( 1 , len ( p2 ) ) :
            p2 [ i ] = 2 * p2 [ i - 1 ] % MOD
        p.sort ( lambda u , v : u [ 0 ] )
        ans = 0
        d = [ ]
        g = [ ]
        for s in range ( n ) :
            r = [ ]
            o = p [ s ]
            r.sort ( lambda u , v : - int ( cross ( u , v , o ) ) )
            for i in range ( r.size ( ) ) :
                for j in range ( r.size ( ) ) :
                    if cross ( r [ i ] , r [ j ] ) == 0 :
                        continue
                    d [ i ] [ j ] = int ( d [ i ] [ j ] * g [ j ] [ k ] ) % MOD
        return ans
    for arr in [ [ ] for i in range ( r.size ( ) ) ] :
        for i in range ( r.size ( ) ) :
            if cross ( arr [ i ] , arr [ i ] ) == 0 :
                continue
        return arr
