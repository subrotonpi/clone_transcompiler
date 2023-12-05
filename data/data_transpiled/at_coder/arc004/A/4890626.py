def import math
import os
import sys
import math
import string
import math
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        num = int ( sc.readline ( ) )
        data = [ ]
        for i in range ( num ) :
            data = sc.readline ( ).split ( )
            data.append ( reduce ( lambda x , y : x + y , data ) )
        max_length = 0
        for i , base_nums in enumerate ( data ) :
            for k in range ( len ( base_nums ) ) :
                if i <= k :
                    continue
                target_nums = base_nums [ k ]
                x_length = math.pow ( abs ( base_nums [ 0 ] - target_nums [ 0 ] ) , 2 )
                y_length = math.pow ( abs ( base_nums [ 1 ] - target_nums [ 1 ] ) , 2 )
                sqrt = math.sqrt ( x_length + y_length )
                if sqrt > max_length :
                    max_length = sqrt
        print ( max_length )
