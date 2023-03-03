def import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = open ( "/proc/stations" , "r" )
        N = sc.read ( )
        K = sc.read ( )
        print ( "YES" if ( K <= math.ceil ( float ( N - 1 ) / 2 ) ) else "NO" )
