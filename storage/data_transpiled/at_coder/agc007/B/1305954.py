def import time
import sys
import os
import time
import sys
import getopt
import getopt
def debug ( ) :
    global elapsed
    global p
    global r
    N = len ( getopt.getopt ( [ "lo" , "hi" ] , [ "lo" , "hi" ] ) )
    p = [ ]
    for i in range ( N ) :
        p.append ( i )
    r = [ ]
    for i in range ( N ) :
        r.append ( p [ i ] )
    a = [ ]
    b = [ ]
    for i in range ( N ) :
        a.append ( N * ( i + 1 ) )
        b.append ( N * ( N - i - 1 ) + r [ i ] )
    for i in range ( N ) :
        if i > 0 :
            print ( " " , end = ' ' )
        print ( a [ i ] , end = ' ' )
    print ( )
    for i in range ( N ) :
        if i > 0 :
            print ( " " , end = ' ' )
        print ( b [ i ] , end = ' ' )
    print ( )
