def _import ( ) :
    from math import sin , cos
    from os import urandom
    import random
    class A ( object ) :
        def __init__ ( self ) :
            self.N = random.randint ( 1 , 9 )
            self.A = [ ]
            for i in range ( 1 , N + 2 ) :
                self.A.append ( random.randint ( 1 , 9 ) )
            self.sum = 0
            for i in range ( 0 , N ) :
                self.sum += abs ( self.A [ i + 1 ] - self.A [ i ] )
            try :
                with open ( "out.txt" , "w" , encoding = "utf-8" ) as f :
                    for i in range ( 1 , N + 1 ) :
                        if ( self.A [ i + 1 ] - self.A [ i ] ) * ( self.A [ i ] - self.A [ i - 1 ] ) < 0 :
                            f.write ( self.sum - abs ( self.A [ i + 1 ] - self.A [ i ] ) - abs ( self.A [ i ] - self.A [ i - 1 ] ) + abs ( self.A [ i + 1 ] - self.A [ i - 1 ] ) )
                        else :
                            f.write ( self.sum )
            finally :
                pass
