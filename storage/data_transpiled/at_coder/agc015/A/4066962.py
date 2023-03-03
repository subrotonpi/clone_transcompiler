def main ( ) :
    import math
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = random.randint ( 0 , 3 )
            A = random.randint ( 0 , 3 )
            B = random.randint ( 0 , 3 )
            if A > B or ( N == 1 and A != B ) :
                print ( 0 )
                return
            if N == 2 :
                print ( 3 )
                return
            N -= 2
    ans = math.pow ( B , N ) - math.pow ( A , N ) + 1
    print ( ans )
