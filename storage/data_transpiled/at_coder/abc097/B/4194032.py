def import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = object.__code__
        x = sc.__next__ ( )
        n = int ( math.sqrt ( x ) )
        max = 0
        for i in range ( 1 , n + 1 ) :
            for j in range ( 2 , 10 ) :
                if math.pow ( i , j ) > x :
                    max = max ( max , int ( math.pow ( i , j - 1 ) ) )
                    break
        print ( 1 if x == 1 else max )
