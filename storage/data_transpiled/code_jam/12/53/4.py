def _ _ main _ _ ( ) :
    import sys
    import random
    import math
    class Food ( object ) :
        def __init__ ( self ) :
            self.P = 0
            self.S = 0
        def __call__ ( self , other ) :
            if self.S == other.S :
                return - self.P
            else :
                return self.S
    total = random.randrange ( 0 , N )
    many = random.randrange ( 0 , N )
    for i in range ( NN ) :
        prize = f [ i ].P
        last = ( f [ i ].S - f [ i ].S ) if i > 0 else f [ i ].S + 1
        res = calc ( M , total + F , many , last )
        total = total + last * f [ i ].P
        many = many + last
    print ( "Case #%d: %s" % ( test , ans ) )
