def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.a = int ( self.a )
        self.b = int ( self.b )
        lnb = int ( math.log10 ( b ) ) + 1
        num = a * int ( math.pow ( 10 , lnb ) ) + b
        for i in range ( 1 , 2 ** num + 1 ) :
            if i ** 2 == num :
                self.print ( "Yes" )
                return
        self.print ( "No" )
