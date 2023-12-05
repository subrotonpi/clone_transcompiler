def py2exe_options ( ) :
    import optparse
    import sys
    import getopt
    global debug
    global debug2
    debug = 1 <= sys.maxsize
    debug2 = 2 <= sys.maxsize
    f = open ( '/proc/cmdline' , 'r' )
    items = [ getopt.getopt ( f , 'x' ) for x in f ]
    items.sort ( )
    for item in items :
        print ( item )
