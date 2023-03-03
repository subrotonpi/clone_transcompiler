def _import ( ) : return sys.stdin.readline ( ).rstrip ( '\n' )
import random
import time
MOD = 1000000007
EPS = 0.0000001
def print ( x ) :
    print ( "%d" % x )
def print_arr ( x ) :
    s = [ ]
    for i in range ( K ) :
        cur = 0
        for j in range ( N - K ) :
            cur += sums [ j + 1 ]
        cur = cur % K
        error = ( mod - cur ) if ( cur <= mod ) else ( mod + cur )
        if error < EPS :
            diff += 1
        print ( "Case #%d: %d" % ( t , diff ) )
def print_arr ( x ) :
    s = [ ]
    for i in range ( K ) :
        s.append ( "%d" % ( i ) )
    print ( "".join ( s ) )
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
def __next__ ( ) :
    while not st or not st :
        line = open ( "input.txt" , "r" ).readline ( )
        st = [ line.strip ( ) for line in st ]
    return st [ 0 ]
def __next__ ( ) :
    N = randint ( 1 , K )
    min = [ ]
    max = [ ]
    sums = [ random.randint ( 1 , K ) for i in range ( N - K + 1 ) ]
    for i in range ( N ) :
        ret.append ( __next__ ( ) )
    return ret
sys.stdout.write ( "\n" )
