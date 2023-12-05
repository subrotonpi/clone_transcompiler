def main ( ) :
    import sys
    import getopt
    try :
        opts , args = getopt.getopt ( sys.argv [ 1 : ] , "r" )
    except getopt.error as msg :
        print ( msg )
        return
    N = int ( args [ 0 ] )
    M = int ( args [ 1 ] )
    list = [ ]
    for S in opts :
        list.append ( S )
    counter = 0
    for i in range ( M ) :
        counter += 1
    return counter
