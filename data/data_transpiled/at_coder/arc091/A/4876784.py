def import import _solve
import os
import sys
import getopt
import getopt
import getopt
import getopt
def solve ( ) :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , 'r' )
    for opt , val in opts :
        if opt in ( '-r' , '--' ) :
            return [ read_input ( ) ]
    return solve
