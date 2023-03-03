def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( self.N )
            self.power = 1
            c = long ( math.pow ( 10 , 9 ) + 7 )
            for i in range ( 1 , N + 1 ) :
                power *= i
                power %= c
            print ( power )
