def _ _ main _ _ ( ) : return
import os
import sys
import time
import random
import sys
import os
import sys
import os
import random
import string
import string
import locale
import locale
import locale
import time
import time
import time
import time
file = 'B-large'
def solve ( test ) :
    print ( 'Case #%d: ' % ( test + 1 ) , end = '' )
    n = randint ( 0 , len ( a ) )
    m = randint ( 0 , len ( a ) )
    a = [ ]
    for i in range ( n ) :
        a [ i ] = random.choice ( a )
    for j in range ( m ) :
        a [ i ] = random.choice ( a )
    for i in range ( n ) :
        tmp = random.choice ( a )
        for j in range ( m ) :
            a [ i ] [ j ] = tmp [ j ] - '0'
    import time
    time.sleep ( time.time ( ) )
    time.sleep ( 1 )
def main ( ) :
    locale.setlocale ( locale.LC_ALL , '' )
    th = threading.Thread ( target = Solution )
    th.start ( )
    try :
        th.join ( )
    except KeyboardInterrupt :
        pass
    if failed :
        raise SystemExit
sumi = [ ]
for i in range ( n ) :
    for j in range ( m ) :
        sumi.append ( sumi [ i + 1 ] [ j + 1 ] + sumi [ i ] [ j + 1 ] - sumi [ i ] [ j ] + a [ i ] [ j ] * i )
sumj = [ ]
for i in range ( n ) :
    for j in range ( m ) :
        sumj.append ( sumj [ i + 1 ] [ j + 1 ] + sumj [ i ] [ j + 1 ] - sumj [ i ] [ j + 1 ] + a [ i ] [ j ] * j )
    ans = 0
    loop :
    for d in range ( 3 , n + 1 ) :
        for i in range ( 3 , m + 1 ) :
            ans = sum ( ans