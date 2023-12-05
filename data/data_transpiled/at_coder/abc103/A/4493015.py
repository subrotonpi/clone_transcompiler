def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        list = [ sc.readline ( ) for i in range ( 3 ) ]
        list.sort ( )
        print ( ( list [ 1 ] - list [ 0 ] ) + ( list [ 2 ] - list [ 1 ] ) )
