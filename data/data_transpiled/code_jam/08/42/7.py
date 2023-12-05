def _import ( ) :
    import sys
    import random
    class xx ( object ) :
        def __init__ ( self , * args ) :
            self._import ( )
            self._import ( )
    t = random.randrange ( 1 , 3 )
    for tt in range ( 1 , t + 1 ) :
        n , m , a = random.randrange ( 1 , 3 )
        if a > n * m :
            print ( "Case #{}: IMPOSSIBLE".format ( tt ) )
        else :
            y1 = 1
            x2 = - a % n
            if x2 < 0 :
                x2 += n
            x1 = n
            y2 = ( a + x2 * y1 ) / n
            print ( "Case #{}: 0 0 {} {} {} {}".format ( tt , x1 , y1 , x2 , y2 ) )
