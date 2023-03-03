def import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        x = sc.randint ( 0 , 100 )
        y = sc.randint ( 0 , 100 )
        print ( math.floor_div ( y , x ) )
