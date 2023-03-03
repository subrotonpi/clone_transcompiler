def import import sys , string , traceback ;
import getopt
try :
    opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
except getopt.error as msg :
    print ( msg )
    return
for o , a in opts :
    if o == "-r" :
        print ( "%r" % o )
        return
    if o == "-t" :
        print ( "%r" % o )
        return
    if o == "-r" :
        print ( "%r" % o )
        return
    if o == "-r" :
        print ( "%r" % o )
        return
    if o == "-t" :
        print ( "%r" % o )
        return
    if o == "-r" :
        print ( "%r" % o )
        return
    try :
        if sys.version_info [ 0 ] >= 3 :
            import traceback ; traceback.print_exc ( )
            return
    except :
        print ( "%r" % sys.exc_info ( ) [ 1 ] )
        return
