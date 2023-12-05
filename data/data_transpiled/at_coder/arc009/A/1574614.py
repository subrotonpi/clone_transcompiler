def import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        sum = 0
        for a , b in zip ( sc.readline ( ).strip ( ).split ( ' ' ) , N ) :
            sum += a * b
        print ( int ( math.floor ( sum * 1.05 ) ) )
