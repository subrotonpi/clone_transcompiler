def import import sys , string , ** kwargs ) :
    import sys
    import string
    import sys
    import os
    import sys
    import getopt
    try :
        from getopt import getopt as getopt
    except ImportError :
        print ( "Usage: %s [-o file]" % sys.argv [ 0 ] )
        return
    n = int ( sys.argv [ 1 ] )
    m = int ( sys.argv [ 2 ] )
    for i in range ( 1 , n + 1 ) :
        if i != m :
            print ( i )
            exit ( 0 )
