def _main ( ) :
    import sys
    import random
    import time
    import itertools
    class Main ( object ) :
        MOD = 1000000007
        def __init__ ( self , a ) :
            self.a = a
            self.b = b
            if a == 1 :
                x = [ ]
                for i in range ( n ) :
                    x.append ( random.randint ( a , b ) )
                x.sort ( )
                for i in range ( n ) :
                    print ( x [ i ] )
                return
            x = [ ]
            ts = [ ]
            for i in range ( n ) :
                x.append ( ( i , random.randint ( a , b ) , 0 ) )
                ts.append ( x [ i ] )
            while b > 0 :
                min = ts.pop ( )
                max = ts.pop ( )
                if b > 100 and ( min [ 0 ] , min [ 1 ] + 1 ) > max :
                    d = b / n
                    for i in range ( n ) :
                        x [ i ].y += d
                    b -= d * n
                    continue
                ts.pop ( )
                min [ 1 ] += 1
                ts.append ( min )
                b -= 1
            for num in ts :
                print ( num [ 0 ] * pow ( a , num [ 1 ] , MOD ) % MOD )
        def pow ( self , a , n , mod ) :
            res = 1
            while n > 0 :
                if n & 1 :
                    res = ( res * a ) % mod
                a = ( a * a ) % mod
                n //= 2
            return res
    class Number ( object ) :
        def __init__ ( self , i , x , y ) :
            self.i = i
            self.x = x
            self.y = y
        @ staticmethod
        def __lt__ ( self , other ) :
            self.i = other.i < a
            self.x = x
            self.y = other.y
        @ staticmethod
        def __cmp__ ( self , other ) :
            self.i = other.i < a
            self.y = other.y
    return Main
