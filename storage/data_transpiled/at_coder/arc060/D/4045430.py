def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
            self.a = mp.map ( str , self.a )
            self.n = len ( self.a )
            self.shuki = self.n - self.a [ self.n ]
            if self.shuki == 1 :
                print ( self.n )
                print ( 1 )
            elif self.n % self.shuki != 0 or self.shuki == self.n :
                print ( 1 )
                print ( 1 )
            else :
                print ( 2 )
                restr = [ self.a [ i ] for i in range ( self.n - 1 , - 1 , - 1 ) ]
                b = mp.map ( str , restr )
                self.count = 0
                for i in range ( self.n ) :
                    shuki1 = self.i + 1 - self.a [ i + 1 ]
                    if shuki1 != ( self.i + 1 ) and self.i % shuki1 == 0 :
                        continue
                    shuki2 = self.n - self.i - 1 - self.b [ self.n - i - 1 ]
                    if shuki2 != ( self.n - self.i - 1 ) and self.i % shuki2 == 0 :
                        continue
                    self.count += 1
            print ( self.count )
    def mp ( self ) :
        n = len ( self.a )
        a = [ - 1 ]
        j = - 1
        for i in range ( self.n ) :
            while j >= 0 and self.a [ i ] != self.a [ j ] :
                j = a [ j ]
            j += 1
        a.append ( j )
        return a
