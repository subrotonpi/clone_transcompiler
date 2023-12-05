def import import sys
import os
import sys
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
except getopt.error as msg :
    print ( msg , file = sys.stderr )
    print ( "usage: " , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
    print ( "-r [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n] [-n]" , file = sys.stderr )
