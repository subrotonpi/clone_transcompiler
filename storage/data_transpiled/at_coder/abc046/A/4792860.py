def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( msg )
        return
    for o , a in opts :
        if o == "-r" :
            print ( "1" )
            return
        elif o == "-b" :
            return
        elif o == "-c" :
            return
    if not args :
        print ( "No arguments" )
        return
    for arg in args :
        print ( arg )
