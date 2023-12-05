def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 1 , 3 ) , sc.randint ( 1 , 3 ) , sc.randint ( 1 , 3 ) ]
        a.sort ( )
        str = ( ( a [ 0 ] + a [ 1 ] ) == a [ 2 ] ) and 'Yes' or 'No'
        print ( str )
