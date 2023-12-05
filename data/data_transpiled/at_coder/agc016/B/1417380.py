def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.a = [ _main.get ( i ) for i in range ( self.n ) ]
    def main ( self ) :
        sc = _main.get ( )
        self.n = sc.n
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sc.get ( i ) )
        self.max , self.min = self.n , self.n
        for i in range ( self.n ) :
            self.max , self.min = max ( self.a [ i ] ) , min ( self.a [ i ] )
        if self.max - self.min >= 2 :
            print ( "No" )
            return
        if self.max == self.min :
            if self.max == self.n - 1 or 2 * self.max <= self.n :
                print ( "Yes" )
            else :
                print ( "No" )
        else :
            self.x , self.y = self.n , self.n
            for i in range ( self.n ) :
                if self.a [ i ] == self.max :
                    self.x += 1
                if self.a [ i ] == self.min :
                    self.y += 1
            if self.y < self.max and 2 * self.( self.max - y ) <= self.x :
                print ( "Yes" )
            else :
                print ( "No" )
