def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.a = sys.maxint , [ 0 ] * n
        for i in range ( self.n ) :
            self.a [ self.s [ i ] ] += 1
        if self.n % 2 == 0 :
            for i in range ( 1 , self.n , 2 ) :
                if self.a [ i ] != 2 :
                    print ( 0 )
                    return
            r = 1
            for i in range ( self.n // 2 , 0 , - 1 ) :
                r *= 2
                r %= 1000000007
            print ( r )
        else :
            if self.a [ 0 ] != 1 :
                print ( 0 )
                return
            for i in range ( 2 , self.n , 2 ) :
                if self.a [ i ] != 2 :
                    print ( 0 )
                    return
            r = 1
            for i in range ( self.n // 2 , 0 , - 1 ) :
                r *= 2
                r %= 1000000007
            print ( r )
