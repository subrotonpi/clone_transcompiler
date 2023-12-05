def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( msg )
        return
    for o , a in opts :
        if o == '-r' :
            h , w = o
        elif o == '-s' :
            h , w = o
        elif o == '-r' :
            w , h = o
        elif o == '-r' :
            h , w = o
        elif o == '-s' :
            s , w = o
        elif o == '-r' :
            h , w = o
        elif o == '-s' :
            s , w = o
        elif o == '-r' :
            h , w = o
        elif o == '-r' :
            w , h = o
        elif o == '-s' :
            s , w = o
        else :
            raise ValueError ( "unknown option" )
