def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        r = sc.randint ( 0 , 100 )
        g = sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 )
        print ( 'YES' if ( r * 100 + g * 10 + b ) % 4 == 0 else 'NO' )
