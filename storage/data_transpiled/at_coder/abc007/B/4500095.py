def main ( args ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( args , 'a' )
    except getopt.error as msg :
        print ( msg )
        return
    for o , a in opts :
        if o == '-1' :
            print ( '-1' )
            return
    if not args :
        print ( '-2' )
        return
    for arg in args :
        print ( arg )
