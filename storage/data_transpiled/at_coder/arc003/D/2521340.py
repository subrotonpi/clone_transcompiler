def import import os , random
import sys
import random
import sys
import os
import random
import sys
debug = 0
debug2 = 0
def main ( ) :
    debug = 1 <= sys.argv [ 1 ]
    debug2 = 2 <= sys.argv [ 2 ]
    f = open ( '/proc/self/debug.txt' , 'r' )
    ia = f.readline ( ).split ( )
    ( N , M , K ) = [ int ( i ) for i in ia ]
    if N == 2 and 0 < M :
        print ( 0 )
        return
    pair = [ [ False ] * N ]
    for i in range ( M ) :
        ia = f.readline ( ).split ( )
        ( A , B ) = [ int ( i ) for i in ia ]
        pair [ A ] [ B ] = pair [ B ] [ A ] = True
    count = 10000000 / N
    valid = 0
    line = [ ]
    sr = random.Random ( )
    test : for c in range ( count ) :
        for i in range ( len ( line ) ) :
            line.append ( i )
        for i in range ( K ) :
            a = sr.randint ( N , N )
            while 1 :
                b = sr.randint ( N , N )
                if a != b :
                    t = line [ a ]
                    line [ a ] = line [ b ]
                    line [ b ] = t
                    break
        for i in range ( 1 , len ( line ) ) :
            if pair [ line [ i - 1 ] ] [ line [ i ] ] :
                continue test
        if not pair [ line [ - 1 ] ] [ line [ 0 ] ] :
            valid += 1
    print ( '%.9f' % ( 1.0 * valid / count ) )
