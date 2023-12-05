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
            print ( "%s" % ( o , ) )
            return
        if o == "-t" :
            print ( "%s" % ( o , ) )
            return
    if o == "-r" :
        print ( "%s" % ( o , ) )
        return
    if o == "-r" :
        print ( "%r" % ( o , ) )
        return
    try :
        if o == "-r" :
            print ( "%r" % ( o , ) )
            return
    except getopt.error as msg :
        print ( msg )
        return
