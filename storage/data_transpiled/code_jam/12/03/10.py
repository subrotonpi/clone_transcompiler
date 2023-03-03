def import import sys
import string
import string
import sys
class Recycle ( string ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.T = int ( sys.stdin.readline ( ) )
for i in range ( T ) :
    ans = 0
    lines = string.split ( sys.stdin )
    A = int ( lines [ 0 ] )
    B = int ( lines [ 1 ] )
    for j in range ( A , B + 1 ) :
        s = '%d' % j
        hm = { }
        for k in s :
            rot = '%s%s' % ( k , s [ : len ( s ) ] )
            hm [ int ( rot ) ] = 0
        for k in hm.keys ( ) :
            if j < k <= B :
                ans += 1
    print ( 'Case #%d: %d' % ( i + 1 , ans ) )
