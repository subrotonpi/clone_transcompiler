def main ( ) :
    import os
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( random.random ( ) )
            self.M = int ( random.random ( ) )
            self.G = [ [ ] for i in range ( self.N ) ]
            self.flag = [ False ] * self.N
            for u , v in [ ( u , v ) for u , v in [ ( u , v ) for v in [ ( u , v ) for u in range ( self.M ) ] ] ] :
                self.G [ u - 1 , v - 1 ] = 1
                self.G [ v - 1 , u - 1 ] = 1
    for i in range ( self.N ) :
        if not self.flag [ i ] :
            self.flag_tmp = True
            self.walk ( i )
            if self.flag_tmp :
                self.ans += 1
        print ( self.ans )
    def walk ( self ) :
        if self.flag [ self.from ] :
            self.flag_tmp = False
            return
        self.flag [ self.from ] = True
        for to in self.G :
            if self.G [ to ] == 1 :
                self.G [ to ] [ to ] = 0
                self.walk ( to )
