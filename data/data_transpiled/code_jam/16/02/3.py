def _import ( ) : return sys.stdout.readline ( )
import readline
import readline
import time
import sys
import time
import sys
MOD = 1000000007
def print ( x ) :
    print ( "%r" % x )
def print_arr ( x ) :
    s = [ "%d %s" % ( x , MOD ) for x in x ]
    print ( s )
def print_arr ( x ) :
    s = [ "%d" % x for x in x ]
    print ( s )
def print_arr ( x ) :
    s = [ "%d" % x for x in x ]
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
    return s
def readline ( ) :
    while not s or not s :
        line = readline ( )
        s = [ line.strip ( ) for line in s ]
    return s
def randint ( t ) :
    return int ( randint ( t ) )
def long ( t ) :
    return long ( t )
sys.stdout.write ( "Case #%d: %d\n" % ( t , total ) )
