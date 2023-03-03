def _import ( ) : return ''
import sys
import os
import os
import sys
import math
import os
import os
import sys
import os
import os
import sys
class Main ( object ) :
    code = 'c2'
    inpFile = '%s.in' % code
    outFile = '%s.out' % code
    def main ( ) :
        T = ni ( )
        for i in range ( 1 , T + 1 ) :
            print ( 'Case #%d: ' % i , file = sys.stderr )
            print ( file = outFile )
        if os.path.exists ( outFile ) : os.remove ( outFile )
        if os.path.exists ( outFile ) : os.remove ( outFile )
    def msg ( s ) :
        con.write ( s )
        con.flush ( )
    def nt ( ) :
        while not s or not s :
            s = None
            try :
                s = br.readline ( )
            except Exception :
                s = None
            st = s.split ( ' ' )
        return st [ 0 ]
    def ni ( ) : return int ( nt ( ) )
    def nl ( ) : return long ( nt ( ) )
    def eof ( ) :
        ready = False
        try :
            ready = br.ready ( )
        except Exception :
            ready = False
        return not ( ready or ( st and st ) )
    p = 1000000009L
    n , k = ni ( )
    e = list ( )
    w = [ False ] * n
    def F ( n , k1 , k2 ) :
        if k1 + k2 > n : return 0
        ans = 1
        for i in range ( n - k1 - k2 + 1 , n - k1 + 1 ) :
            ans *= i
            ans %= p
        return ans
    def count ( cur , par ) :
        ans = 1
        w [ cur ] = True
        for v in e [ cur ] :
            if not w [ v ] :
                ans *= count ( v , cur )
                ans %= p
        if par >= 0 :
            ans *= F ( k , len ( e [ par ] ) , len ( e [ cur ] ) - 1 )
        return ans
