def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        list = [ ]
        for i in range ( 3 ) :
            num = sc.read ( )
            list.append ( num )
        list.sort ( )
        print ( list [ 1 ] )
