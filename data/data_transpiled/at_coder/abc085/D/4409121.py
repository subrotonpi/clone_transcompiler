def main ( args ) :
    import math
    from os import urandom
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( random.randint ( 1 , 9 ) )
            self.h = int ( random.randint ( 1 , 9 ) )
            self.a = [ random.randint ( 1 , 9 ) for i in range ( n ) ]
            self.b = [ random.randint ( 1 , 9 ) for i in range ( n ) ]
            self.a.sort ( )
            self.b.sort ( )
            l = - 1
            r = len ( self.b )
            while r - l > 1 :
                mid = ( l + r ) // 2
                if self.a [ n - 1 ] <= self.b [ mid ] :
                    r = mid
                else :
                    l = mid
            d = 0
            cnt = 0
            for i in range ( r , n ) :
                d += self.b [ n - 1 - i + r ]
                cnt += 1
                if d >= h :
                    print ( cnt )
                    return
            h -= d
            print ( cnt , int ( math.ceil ( float ( h ) / self.a [ n - 1 ] ) ) )
