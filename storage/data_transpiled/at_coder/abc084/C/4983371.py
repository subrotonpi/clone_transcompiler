def _import ( ) :
    import os
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.ansi = 0
            self.w = [ ]
            self.ww = [ ]
            self.isvisited = [ ]
        def __call__ ( self , * args ) :
            sc = open ( self.filename , 'r' )
            self.n = sc.n
            self.timefornext = [ ]
            self.kankaku = [ ]
            self.kaitsu = [ ]
            self.time = 0
            for i in range ( self.n - 1 ) :
                self.timefornext.append ( sc.next )
                self.kaitsu.append ( sc.next )
                self.kankaku.append ( sc.next )
            for i in range ( self.n ) :
                self.time = 0
                for j in range ( self.n - 1 ) :
                    if self.time < self.kaitsu [ j ] :
                        self.time = self.kaitsu [ j ]
                    elif self.time % self.kankaku [ j ] == 0 :
                        pass
                    else :
                        self.time = self.time // self.kankaku [ j ] * self.kankaku [ j ] + self.kankaku [ j ]
                    self.time += self.timefornext [ j ]
                print ( self.time )
    def gcd_int ( a , b ) :
        if a < b :
            tmpp = a
            a = b
            b = tmpp
        if b == 0 :
            return a
        else :
            return gcd_int ( b , a % b )
    def lcm_int ( a , b ) :
        gcd = gcd_int ( a , b )
        return a / gcd ** b
    def lcm_long ( a , b ) :
        gcd = gcd_long ( a , b )
        return a / gcd ** b
    return Main ( )
