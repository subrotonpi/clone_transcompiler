def import import sys
import os
import sys
import getopt
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
except getopt.error as msg :
    print ( msg , file = sys.stderr )
    print ( "usage: %s" % msg , file = sys.stderr )
    print ( "%s" % msg , file = sys.stderr )
    print ( "%s" % msg , file = sys.stderr )
    print ( "%s" % msg , file = sys.stderr )
    test = 1
    for t in range ( 1 , test + 1 ) :
        counts = [ 0 ] * 9
        n = getopt.getgetopt ( t , "n" ) [ 0 ]
        A = getopt.getgetopt ( t , "A" ) [ 0 ]
        B = getopt.getgetopt ( t , "B" ) [ 0 ]
        C = getopt.getgetopt ( t , "C" ) [ 0 ]
        D = getopt.getgetopt ( t , "D" ) [ 0 ]
        x = getopt.getgetopt ( t , "x" ) [ 0 ]
        y = getopt.getgetopt ( t , "y" ) [ 0 ]
        M = getopt.getgetopt ( t , "M" ) [ 0 ]
        for i in range ( n ) :
            index = int ( ( x % 3 + 3 ) % 3 ** 3 + ( y % 3 + 3 ) % 3 )
            counts [ index ] += 1
            x = ( A * x + B ) % M
            y = ( C * y + D ) % M
        result = 0
        for i in range ( 9 ) :
            for j in range ( i ) :
                for k in range ( j ) :
                    if ( i // 3 + j // 3 + k // 3 ) % 3 == 0 and ( i % 3 + j % 3 + k % 3 ) % 3 == 0 :
                        if i == j and j == k :
                            if counts [ i ] >= 3 :
                                result += counts [ i ] * ( counts [ i ] - 1 ) * ( counts [ i ] - 2 ) / 6
                        elif i == j and j != k :
                            if counts [ i ] >= 2 :
                                result += counts [ j