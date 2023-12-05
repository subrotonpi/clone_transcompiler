def main ( ) :
    import math
    class B ( object ) :
        def __init__ ( self ) :
            self.T = int ( self.T )
    for t in range ( 1 , T + 1 ) :
        L , P , C = B ( t )
        step = 1
        N = L * C
        while N < P :
            step += 1
            N *= C
        ans = 0
        ans = int ( math.ceil ( math.log ( step ) / math.log ( 2 ) ) )
        print ( "Case #{}: {}".format ( t , ans ) )
