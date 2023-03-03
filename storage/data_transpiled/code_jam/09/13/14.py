def import import _open
import os
import sys
import os
import math
import os
import sys
class B ( object ) :
    def __init__ ( self ) :
        self.c , self.n = 0 , 0
    def cnk ( self , n , k ) :
        if ( k < 0 ) : return 0
        res = 1
        for i in range ( k + 1 , n + 1 ) :
            res = res * math.log ( i , 2 )
        for i in range ( 1 , n - k + 1 ) :
            res = res / math.log ( i , 2 )
        return res
    def prob ( self , i , j ) :
        return ( self.cnk ( self.c - i , self.j - i ) * self.cnk ( i , self.n - ( self.j - i ) ) ) / self.cnk ( self.c , self.n )
    def run ( self ) :
        input = sys.stdin
        output = sys.stdout
        t = input.readline ( ).strip ( )
        for tt in range ( t ) :
            self.c , self.n = input.readline ( ).strip ( ).split ( )
            tmp = [ ]
            for i in range ( 0 , c + 1 ) :
                for j in range ( i , c + 1 ) :
                    tmp.append ( prob ( i , j ) )
            v = [ 1 ]
            step = 0
            ans = 0
            while True :
                step += 1
                nv = [ ]
                for i in range ( 0 , c + 1 ) :
                    for j in range ( i , c + 1 ) :
                        nv.append ( v [ i ] * tmp [ i ] [ j ] )
                    ans += step * ( nv [ c ] - v [ c ] )
                    if ( 1 - v [ c ] ) * step * 2 < 0.000000001 :
                        break
                    v = nv
                output.write ( "Case #%d: %f\n" % ( tt + 1 , ans ) )
        input.close ( )
        output.close ( )
