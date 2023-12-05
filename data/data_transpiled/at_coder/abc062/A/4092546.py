def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        map = [ 1 , 3 , 1 , 2 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1 ]
        x , y = sc.read ( ).split ( ' ' )
        print ( 'Yes' if map [ x - 1 ] == map [ y - 1 ] else 'No' )
