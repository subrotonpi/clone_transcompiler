def import import math
import os
import math
import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        try :
            f = open ( "/proc/self/" )
        except IOError :
            return
        f.close ( )
        n = int ( f.readline ( ) )
        sum = 0
        for i in range ( n ) :
            str_arr = f.readline ( ).split ( )
            a = int ( str_arr [ 0 ] )
            b = int ( str_arr [ 1 ] )
            sum += a * b
        ans = sum * 1.05
        print ( int ( math.floor ( ans ) ) )
