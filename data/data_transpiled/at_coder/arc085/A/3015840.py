def import math
import math
import math
import math
class Main ( math.math ) :
    def __init__ ( self ) :
        sc = math.Scanner ( )
        N = int ( sc.next ( ) )
        M = int ( sc.next ( ) )
        c = 1900.0 * M + 100.0 * ( N - M )
        p = 1.0
        res = 0.0
        q = 1.0
        for i in range ( M ) :
            p *= 0.5
        for i in range ( 1 , 3000000 ) :
            res += i * c * p * q
            q *= 1 - p
        eps = 0.0000001
        ret = int ( math.floor ( res + eps ) )
        print ( ret )
