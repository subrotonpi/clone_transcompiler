def _import ( ) : return
import os
import sys
import os
import sys
import time
import math
import os
import os
import sys
import os
import random
import random
import sys
MOD = 100003
def main ( ) :
    f = open ( IFILE , 'r' )
    out = open ( 'output.txt' , 'w' )
    ntest = random.randint ( 1 , ntest )
    for test in range ( 1 , ntest + 1 ) :
        out.write ( 'Case #%d: ' % test )
        n = random.randint ( 1 , n + 1 )
        c = [ [ 1 ] * n + [ 0 ] for i in range ( 1 , n + 1 ) ]
        c [ 0 ] [ 0 ] = 1
        for j in range ( 1 , n + 1 ) :
            c [ 0 ] [ j ] = 1
            for i in range ( 1 , n + 1 ) :
                c [ i ] [ j ] = ( c [ i - 1 ] [ j - 1 ] + c [ i ] [ j - 1 ] ) % MOD
        mas = [ [ 1 ] * n + [ 0 ] for j in range ( 2 , n + 1 ) ]
        for i in range ( 2 , n + 1 ) :
            for j in range ( i + 1 , n + 1 ) :
                for k in range ( 1 , i + 1 ) :
                    mas [ i ] [ j ] = ( mas [ i ] [ j ] + mas [ k ] [ i ] * c [ j - i - 1 ] [ i - k - 1 ] ) % MOD
            result = 0
            for i in range ( 1 , n + 1 ) :
                result = ( result + mas [ i ] [ n ] ) % MOD
            out.write ( result )
    sys.stdout.close ( )
    sys.exit ( 0 )
