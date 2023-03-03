def main ( argv ) :
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.V = 32
        def __init__ ( self ) :
            self.n = random.randint ( 1 , 10000 )
            for i in range ( 1 , n + 1 ) :
                print ( "Case #%d: " % i , end = "" )
                self.solve ( )
        def solve ( self ) :
            m , p = random.randint ( 1 , 1000000 )
            x = random.randint ( 1 , 1000000 / 32 )
            v = [ 0.for i in range ( V // 2 ) ]
            for i in range ( V // 2 ) :
                v [ i ] = p
            v [ V ] = 1.
            m -= 1
            while m > 0 :
                next = [ ]
                for i in range ( 0 , V + 1 ) :
                    tmp = 0.
                    for bet in range ( 0 , i + bet ) :
                        poss = p * v [ ( i + bet ) ] + ( 1 - p ) * v [ i - bet ]
                        if poss > tmp :
                            tmp = poss
                    next.append ( tmp )
                v = next
                m -= 1
            print ( "%.06f\n" % v [ x ] , end = "" )
    return Main ( )
