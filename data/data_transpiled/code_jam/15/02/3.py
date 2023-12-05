def import _readline
import sys
import math
import random
import time
import sys
import time
import sys
MOD = 1000000007
def print ( x ) :
    print ( "%r" % x )
def print_arr ( x ) :
    s = [ "%d " % x [ i ] for i in x ]
    print ( s )
def print_arr ( x ) :
    s = [ "%d " % x [ i ] for i in x ]
    print ( s )
def join ( x , space = "" ) :
    if not x :
        return ""
    s = [ ]
    first = True
    for elt in x :
        if first :
            first = False
        else :
            s.append ( space )
        s.append ( elt )
    return "".join ( s )
def __next__ ( ) :
    while not x or not x :
        line = sys.stdin.readline ( )
        x = [ line.strip ( ) for line in x ]
    return x
def __next__ ( ) :
    return int ( __next__ ( ) )
def __next__ ( ) :
    return time.time ( )
def next_ints ( N ) :
    ret = [ ]
    for i in range ( N ) :
        ret.append ( __next__ ( ) )
    return ret
sys.stdout.write ( "Case #%d: %d\n" % ( t , max_time ) )
