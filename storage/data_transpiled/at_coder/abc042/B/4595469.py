def main ( ) :
    import sys
    import os
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( msg )
        return
    n , l = 0 , len ( args )
    s = [ ]
    for o , a in opts :
        s.append ( a )
    s.sort ( )
    for s1 in s :
        sys.stdout.write ( s1 )
