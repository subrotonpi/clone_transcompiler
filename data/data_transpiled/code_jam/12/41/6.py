def import import sys , errno , symbols , iread , dread , lread , problem , out
from os import urandom
import random
import locale
import os
import sys
import random
import time
try :
    random.seed ( )
except :
    pass
def solve ( ) :
    N = iread ( )
    d = [ random.randint ( 0 , N ) for i in range ( N ) ]
    l = [ random.randint ( 0 , N ) for i in range ( N ) ]
    D = iread ( )
    x = [ ]
    x.append ( d [ 0 ] )
    for i in range ( N ) :
        if x [ i ] == - 1 :
            continue
        x [ i ] = min ( x [ i ] , l [ i ] )
        if d [ i ] + x [ i ] >= D :
            out.write ( "YES\n" )
            return
        for j in range ( i + 1 , N ) :
            if d [ i ] + x [ i ] >= d [ j ] :
                x [ j ] = max ( x [ j ] , d [ j ] - d [ i ] )
        out.write ( "NO\n" )
def solve_gcj ( ) :
    tests = iread ( )
    for test in range ( 1 , tests + 1 ) :
        out.write ( "Case #%d: " % test )
        solve ( )
        out.write ( "\n" )
def readword ( ) :
    b = [ ]
    c = sys.stdin.read ( )
    while c >= 0 and c <= errno.EINTR :
        c = c - 1
    if not c :
        return ""
    return readword ( )
