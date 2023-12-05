def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error , msg :
        print ( msg )
        return
    for o , a in opts :
        if o == "-r" :
            print ( "NO" )
            return
        if o == "-r" :
            print ( "OPTION" )
            return
    if not args :
        print ( "no" )
        return
    for arg in args :
        print ( arg )
