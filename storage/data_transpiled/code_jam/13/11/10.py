def _import ( ) : return
import time
import math
class A ( object ) :
    def B ( x ) : return math.factorial ( x )
    def f ( guess ) :
        x = B ( guess )
        two_x_minus_one = x * B ( 2 ) - B ( 1 )
        return B ( 2 ) * x * r + x * two_x_minus_one
    def main ( ) :
        f = sys.stdin.read ( )
        T = int ( f )
        for cas in range ( 1 , T + 1 ) :
            r = int ( f )
            t = int ( f )
            lo = 0
            hi = t
            while lo < hi :
                mid = ( lo + hi + 1 ) // 2
                score = f ( mid )
                if score > t :
                    hi = mid - 1
                else :
                    lo = mid
            print ( "Case #%d: %d\n" % ( cas , lo ) )
