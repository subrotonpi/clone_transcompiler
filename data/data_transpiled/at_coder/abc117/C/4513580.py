def import import os , stdin , stdout , stdin , stderr , n , verbose , filename_verbose , * args , ** kwargs ) :
    import os
    import sys
    import getopt
    if sys.version_info >= ( 2 , 7 ) :
        import getopt
    else :
        import getopt
    for opt , arg in opts :
        if opt in ( '-h' , '--help' ) :
            print ( __doc__ )
            return
        elif opt in ( '-n' , '--no' ) :
            n = int ( arg )
            m = int ( arg )
        else :
            raise ValueError ( 'unknown option %s' % opt )
    if not args :
        args = [ ]
    n = args [ 0 ]
    m = args [ 1 ]
    x = [ stdin ]
    for o , arg in zip ( args [ : - 1 ] , args [ 1 : ] ) :
        x.append ( o )
    os.chdir ( stdin )
    z = [ ]
    if n >= m :
        stdout.write ( 0 )
        return
    for i in range ( 1 , len ( x ) ) :
        z.append ( ( x [ i ] - x [ i - 1 ] ) )
    z.sort ( )
    ans = x [ - 1 ] - x [ 0 ]
    for i in range ( n - 1 ) :
        ans -= z [ - 1 - i ]
    stdout.write ( ans )
