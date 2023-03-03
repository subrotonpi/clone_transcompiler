def import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = Scanner ( )
        N = sc.number
        sum = 0
        for a , b in zip ( sc.next ( ) , sc.next ( ) ) :
            sum += a * b
        print ( int ( math.floor ( sum * 1.05 ) ) )
