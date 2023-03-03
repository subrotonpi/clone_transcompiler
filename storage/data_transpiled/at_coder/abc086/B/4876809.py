def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        b = sc.readline ( )
        print ( 'Yes' if math.sqrt ( int ( a + b ) ) % 1 == 0 else 'No' )
