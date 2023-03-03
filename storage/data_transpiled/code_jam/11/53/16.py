def _ ( ) : pass
import os
import sys
import io
import sys
import time
import glob
import glob
import glob
import glob
import glob
import glob
import glob
import glob
import random
M = 1000003
DIR = r'|-/\'
dx , dy = [ - 1 , 1 , 0 , 0 , - 1 , 1 , - 1 , 1 ] , [ 0 , 0 , - 1 , 1 , 1 , - 1 , - 1 , 1 ]
def solve ( ) :
    R , C = glob.glob ( '*.' )
    cs = glob.glob ( '*.' )
    res = 0
    for i in range ( 1 << ( R * C ) ) :
        f = glob.glob ( '*.' )
        for x in range ( R ) :
            for y in range ( C ) :
                d = DIR.find ( cs [ x ] [ y ] )
                k = ( i >> ( x * C + y ) ) & 1
                x2 , y2 = ( x + dx [ d * 2 + k ] + R ) % R , ( y + dy [ d * 2 + k ] + C ) % C
                f [ x2 ] [ y2 ] += 1
        ok = True
        for x in range ( R ) :
            for y in range ( C ) :
                if f [ x ] [ y ] != 1 :
                    ok = False
        if ok :
            res += 1
    print ( res % M )
    def run ( ) :
        caseN = glob.glob ( '*.' )
        for caseID in range ( 1 , caseN + 1 ) :
            print ( "Case #%d: " % caseID )
            solve ( )
            sys.stdout.flush ( )
    def debug ( * os ) :
        print ( deepstr ( sys.argv ) , file = sys.stderr )
    def main ( ) :
        import glob
        for caseID in glob.glob ( '*.' ) :
            print ( "Case #%d: " % caseID )
            solve ( )
            sys.stdout.flush ( )
    main ( )
