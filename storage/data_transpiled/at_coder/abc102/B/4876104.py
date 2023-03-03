def main ( ) :
    import sys
    from time import sleep
    from itertools import chain
    sc = open ( sys.argv [ 1 ] )
    n = int ( sc.readline ( ) )
    a = chain ( [ int ( x ) for x in sc.readlines ( ) ] , [ ] )
    a.sort ( )
    print ( a [ - 1 ] - a [ 0 ] )
