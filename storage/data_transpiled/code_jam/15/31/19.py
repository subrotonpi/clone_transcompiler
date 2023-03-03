def import import *
import os
import sys
import string
import os
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
except getopt.error as msg :
    print ( msg , file = sys.stderr )
    return
FILENAME = 'a'
if not args :
    print ( "No arguments given" , file = sys.stderr )
    return
try :
    f = open ( FILENAME + '.in' , 'r' )
except :
    print ( "No input file" , file = sys.stderr )
    return
try :
    f.close ( )
except :
    pass
try :
    g = open ( FILENAME + '.out' , 'w' )
except :
    print ( "No output file" , file = sys.stderr )
    return
tests = [ ]
for test in range ( len ( tests ) ) :
    g.write ( 'Case #%d: %s\n' % ( test + 1 , solve ( ) ) )
g.write ( '%d: %s\n' % ( r , c / w ) )
g.write ( '%d: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , c / w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , c / w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , w ) )
g.write ( '%s: %s\n' % ( r , w ) )
