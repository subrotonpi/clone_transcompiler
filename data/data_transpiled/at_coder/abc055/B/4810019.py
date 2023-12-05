def main ( arg ) :
    import math
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            self.args = args
            self.N = int ( self.N )
            self.print ( self.mulPower ( self.N ) )
        def mulPower ( self ) :
            power = 1
            c = long ( math.pow ( 10 , 9 ) + 7 )
            for i in range ( 1 , self.N + 1 ) :
                power *= i
                power %= c
            return power
    return Main ( )
