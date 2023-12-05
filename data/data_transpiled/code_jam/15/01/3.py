def import _readline
import sys
import time
import sys
import string
import string
import sys
MOD = 1000000007
def print ( x ) :
    print ( "%r" % x )
def print_arr ( x ) :
    s = string.join ( x , "" )
    print ( s )
def print_arr ( x ) :
    s = string.join ( x , "" )
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
        line = sys.stdin.readline ( )
        s = string.split ( line.strip ( ) )
    return s
def __next__ ( ) :
    return int ( __next__ ( ) )
def next_ints ( N ) :
    ret = [ ]
    for i in range ( N ) :
        ret.append ( "%d" % ( i ) )
    return ret
def main ( ) :
    f = open ( "input.txt" , "r" )
    T = randint ( 1 , T )
    for t in range ( 1 , T + 1 ) :
        S = randint ( 1 , T )
        count = next ( f )
        needed = 0
        total = 0
        for shyness in count :
            if total < shyness :
                total = shyness
                needed += 1
            total += int ( "%d" % ( shyness ) )
        print ( "Case #%d: %d%%" % ( t , needed , total ) )
