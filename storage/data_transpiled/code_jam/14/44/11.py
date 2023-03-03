def _ ( ) : return
import threading
import time
import sys
import os
import sys
import os
import sys
import time
class Solution ( threading.Thread ) :
    class Node :
        def __init__ ( self , root , str ) :
            self.to = [ ]
        def add ( self , root , str ) :
            ans = 0
            pos = root
            for i in str :
                to = pos.to [ i ] - 'A'
                if to is None :
                    to = pos.to [ i ] - 'A'
            return int ( to )
        def read ( self ) : return float ( to )
        def write ( self , s ) :
            return s.read ( )
    class FastScanner ( Scanner ) :
        def readline ( self ) :
            while not s.startswith ( '' ) :
                s = [ ]
            return s
        def readline ( self ) : return readline ( )
        def readline ( self ) : return readline ( )
    def read ( self ) : return open ( 'A' )
    def write ( self , s ) :
        return s.read ( )
    ans = 0
    anscnt = 0
    loopmask :
    for mask in range ( ( 1 << ( 2 * m ) ) ) :
        roots = [ Node ( ) for _ in range ( n ) ]
        good = [ False ] * n
        msk = mask
        curans = 0
        for toi in range ( m ) :
            toi = msk & 3
            msk >>= 2
            if toi >= n :
                continue loopmask
            curans += add ( roots [ toi ] , s [ toi ] )
            good [ toi ] = True
        for i in range ( n ) :
            if not good [ i ] :
                continue loopmask
        if curans > ans :
            ans = curans
            anscnt = 1
        elif curans == ans :
            anscnt += 1
    print ( _ ( "Case #%d: %d %d\n" ) % ( Case , ans + n , anscnt ) )
