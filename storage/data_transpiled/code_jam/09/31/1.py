def import readline , sys , stdout , errors , filename
import readline
import os
import sys
import readline
import readline
import readline
import readline
import time
def solve ( test_number ) :
    sys.stdout.write ( "Case #%d: " % test_number )
    base = 0
    h = { }
    s = readline ( )
    h [ s [ 0 ] ] = 1
    for c in s [ 1 : ] :
        if c not in h :
            h [ c ] = base
            base += 1
            if base == 1 :
                base += 1
    if base < 2 :
        base = 2
    res = 0
    pow = 1
    for c in s [ 1 : ] :
        res += h [ c ] * pow
        pow *= base
    print ( res )
def read ( ) :
    try :
        locale.setlocale ( locale.LC_ALL , '' )
        stdin = open ( filename + ".in" , 'r' )
        stdout = sys.stdout
    except :
        stdin = open ( filename + ".out" , 'w' )
        stdout = open ( filename + ".out" , 'w' )
    else :
        stdout = sys.stdin
    t = randint ( 1 , 10000 )
    for i in range ( t ) :
        solve ( i + 1 )
    stdout.close ( )
def main ( ) :
    threading.Thread ( target = read ).start ( )
