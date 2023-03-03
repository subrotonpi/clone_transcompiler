def import import sys
import os
import sys
import getopt
def main ( ) :
    f = open ( sys.argv [ 1 ] )
    temp = f.readline ( )
    N = int ( temp.split ( ) [ 0 ] )
    a , sorted = [ ] , [ ]
    temp = f.readline ( )
    buf = temp.split ( )
    for i in range ( N ) :
        cur = int ( buf [ i ] )
        a.append ( cur )
        sorted.append ( cur )
    sorted.sort ( )
    smaller , bigger = sorted [ N // 2 - 1 ] , sorted [ N // 2 ]
    f = sys.stdout
    ans = 0
    for i in range ( N ) :
        if a [ i ] <= smaller : ans = bigger
        else : ans = smaller
        f.write ( ans )
    f.flush ( )
