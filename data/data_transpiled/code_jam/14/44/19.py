def _import ( ) : return _import ( )
import math
import int
import sys
import os
class D ( object ) :
    def parts ( self , f ) :
        line = f.readline ( )
        if not line : return None
        return len ( line.strip ( ).split ( 's+' ) )
    def size ( self ) :
        return 1
        for c in self.keys ( ) :
            sum += len ( self [ c ] )
        return sum
    def unpack ( self , args ) :
        return self.keys ( )
class LL ( list ) :
    INF = - 1
cas = atoi ( args [ 0 ] )
for z in range ( 1 , cas + 1 ) :
    ss = parts ( args )
    M = atoi ( ss [ 0 ] )
    N = atoi ( ss [ 1 ] )
    S = [ s for s in ss if s ]
    arr = [ LL ( ) for s in ss ]
    out ( 'Case #%d: %s' % ( z , go ( arr , 0 , M , N , S ) ) )
def go ( arr , k , M , N , ss ) :
    if k == M :
        for s in arr :
            if len ( s ) == 0 : return INF , 1
            sum = 0
            for s in s :
                sum += count ( s )
            return sum , 1
    max = 0
    count = 0
    sum = 0
    for s in arr :
        s += ss [ k ]
        p = go ( s , k + 1 , M , N , ss )
        if p.u > max :
            max = p.u
            count = p.v
        elif p.u == max :
            count += p.v
        arr [ - 1 ].pop ( )
    return max , count
return D ( )
