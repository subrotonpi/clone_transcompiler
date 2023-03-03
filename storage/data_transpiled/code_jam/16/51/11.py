def _import ( ) :
    from itertools import repeat
    class A ( object ) :
        def __init__ ( self ) :
            self.T = repeat ( self.T )
            for i in range ( 1 , T + 1 ) :
                print ( "Case #{}: {}".format ( i , self.solve ( ) ) )
        def solve ( self ) :
            S = self.T.split ( )
            score = 0
            stack = [ ]
            for i in range ( len ( S ) ) :
                if not stack [ - 1 ] and stack [ - 1 ] == S [ i ] :
                    score += 10
                    stack.pop ( )
                else :
                    stack.append ( S [ i ] )
            return score + len ( stack ) / 2 ** 5
    return A
