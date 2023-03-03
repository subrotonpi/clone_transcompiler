def _ _ main _ _ ( ) : return
import sys
import struct
import struct
import struct
import struct
import sys
import struct
import struct
import struct
import struct
import struct
import sys
mod = 1000000007
def main ( $ ) :
    sc = struct.Struct ( '<i' )
    n = sc.recv ( 1 )
    v = [ [ ] for i in range ( 1 , n + 1 ) ]
    for a , b in zip ( sc.recv ( 1 ) , sc.recv ( 2 ) ) :
        v [ a ].append ( b )
        v [ b ].append ( a )
    f = [ ]
    g = [ ]
    par = [ ]
    par = [ ]
    par = [ ]
    par = [ ]
    q = [ 1 ]
    while q :
        x = q.popleft ( )
        if x != 1 and len ( v [ x ] ) == 1 :
            f.append ( 2 )
            g.append ( 1 )
            par.append ( x )
        else :
            for k in v [ x ] :
                if k != 1 and par [ k ] != x :
                    if not par [ k ] : par [ k ] = x
                    q.append ( k )
    while par :
        k = par [ 0 ]
        white , black = 1 , 1
        for l in v [ k ] :
            if par [ l ] == k :
                white = ( white * f [ l ] ) % mod
                black = ( black * g [ l ] ) % mod
        f.append ( ( black + white ) % mod )
        g.append ( white % mod )
        if par [ k ] and f [ k ] : par [ k ] = x
    out ( f [ 1 ] )
Note :./ main.py.uses.unchecked or unsafe.operations.Note : Recompile : unchecked for details in main ( ) :
    out ( )
