def main ( ) :
    import math
    class Main ( ) :
        def __init__ ( self ) :
            self.N = math.sqrt ( math.pi )
        def input ( self ) :
            self.N = math.sqrt ( math.pi )
        def main ( self ) :
            self.input ( )
            sum = 1
            for i in range ( 2 , math.sqrt ( N ) + 1 ) :
                if self.N % i == 0 :
                    sum += i + N / i
            if self.N % math.sqrt ( N ) == 0 :
                sum -= math.sqrt ( N )
            if sum == N :
                print ( "Perfect" )
            elif sum > N :
                print ( "Abundant" )
            else :
                print ( "Deficient" )
