def _import ( ) :
    from math import sin , cos , pi
    class Main ( object ) :
        def __init__ ( self ) :
            self.a , self.b , self.n = sin ( self.a ) , cos ( self.b ) , sin ( self.a )
            lcm = lcm ( a , b )
            for i in range ( 1 , pi ) :
                c = lcm ( i )
                if c >= n :
                    print ( c )
                    return
        def lcm ( self , m , n ) :
            return m * n / gcd ( self.m , self.n )
        def gcd ( self , m , n ) :
            if self.m < n :
                return gcd ( self.n , self.m )
            if self.n == 0 :
                return m
            return gcd ( self.n , self.m % self.n )
    return Main
