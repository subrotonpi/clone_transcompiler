def main ( ) :
    import sys
    import os
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , 'r' )
    except getopt.error as msg :
        print ( msg , file = sys.stderr )
        return
    for o , a in opts :
        if o == '-r' :
            h , w = os.path.split ( a )
            for h in h :
                print ( '#' , end = '' )
            print ( )
            for h in h :
                print ( '#' , h , file = sys.stderr )
            for w in w :
                print ( '#' , end = '' )
            print ( )
