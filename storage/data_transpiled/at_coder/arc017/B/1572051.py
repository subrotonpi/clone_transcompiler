def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.k = 0
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( _input ( ) )
    def main ( self , args ) :
        self.input ( )
        self.b = [ ]
        count = 0
        ans = 0
        for i in range ( self.n - 1 ) :
            if self.a [ i ] < self.a [ i + 1 ] :
                b.append ( True )
            else :
                b.append ( False )
            if b [ i ] :
                count += 1
                if count >= self.k - 1 :
                    ans += 1
            else :
                count = 0
        if self.k == 1 :
            print ( self.n )
        else :
            print ( ans )
