def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "t" )
    except getopt.error , msg :
        print ( msg )
        return
    for o , a in opts :
        if o in ( "a" , "b" , "c" ) :
            print ( "Yes" )
            return
        print ( "No" )
