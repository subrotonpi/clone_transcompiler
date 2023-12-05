def import math
import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = math.Scanner ( )
        a = sc.next ( )
        b = sc.next ( )
        num = int ( a + b )
        s = int ( math.sqrt ( num ) )
        if s * s == num :
            print ( "Yes" )
        else :
            print ( "No" )
