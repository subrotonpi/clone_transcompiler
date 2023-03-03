def import math
class Main ( object ) :
    def __init__ ( self , a , b ) :
        Scanner ( ).__init__ ( self )
        a = int ( a )
        b = int ( math.log10 ( b ) )
        bd = int ( math.log10 ( b ) ) + 1
        a = a * int ( math.pow ( 10 , bd ) ) + b
        print ( a * 2 )
