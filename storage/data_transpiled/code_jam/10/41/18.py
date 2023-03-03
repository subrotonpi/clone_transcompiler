def import import sys
import os
import sys
import random
import string
import sys
import sys
import os
import sys
import sys
import itertools
class A ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
T = sys.maxint
for t in range ( 1 , T + 1 ) :
    min = sys.maxint
    k = sys.maxint
    sys.stdin.readline ( )
    n = 2 * k - 1
    ds = [ ]
    for s in sys.stdin :
        ds.append ( ' '.join ( s.split ( ) ) )
    for i in range ( n ) :
        for j in range ( n ) :
            z = 1
            sym = True
            while 0 <= i - z < n and sym :
                for q in range ( n ) :
                    if ds [ i - z ] [ q ] != ds [ i + z ] [ q ] and ds [ i - z ] [ q ] != ' ' and ds [ i + z ] [ q ] != ' ' :
                        sym = False
                        break
                z += 1
            z = 1
            while 0 <= j - z < n and sym :
                for q in range ( n ) :
                    if ds [ q ] [ j - z ] != ds [ q ] [ j + z ] and ds [ q ] [ j - z ] != ' ' and ds [ q ] [ j + z ] != ' ' :
                        sym = False
                        break
                z += 1
            if sym :
                di = max ( [ max ( abs ( i + j - ( k - 1 ) ) , abs ( i + j - ( 3 * k - 3 ) ) ) for i in range ( n ) ] )
                r = ( di + 1 ) * ( di + 1 ) - k * k
                if r < min :
                    sys.stdout.write ( "Case #%d: %d\n" % ( t , min ) )
