def import import math
class Main ( object ) :
    MOD = 1000000007L
    def __init__ ( self ) :
        self.a = int ( self.a )
        self.b = int ( self.b )
    def __init__ ( self ) :
        self.d = { }
        for i in range ( self.b + 1 , self.a + 1 ) :
            x = i
            for j in range ( 2 , math.sqrt ( i ) + 1 ) :
                while x % j == 0 :
                    if j in self.d :
                        self.d [ j ] = self.d [ j ] + 1
                    else :
                        self.d [ j ] = 1
                    x /= j
            if x != 1 :
                if x in self.d :
                    self.d [ x ] = self.d [ x ] + 1
                else :
                    self.d [ x ] = 1
    ans = 1
    for x in self.d.values ( ) :
        ans = ( ans * long ( x + 1 ) ) % MOD
    print ( ans )
