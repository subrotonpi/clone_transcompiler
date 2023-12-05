def import import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.K = 0 , 0
        ans = "Nothing"
        self.a = [ ]
    def main ( self ) :
        sc = _scanner.Scanner ( )
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        for i in range ( self.N ) :
            for j in range ( self.K ) :
                self.a [ i ] [ j ] = sc.__next__ ( )
        self.dfs ( 0 , 0 )
        print ( self.ans )
    def dfs ( self , n , value ) :
        if n == self.N :
            if not value :
                ans = "Found"
            return
        for i in range ( self.K ) :
            self.dfs ( self.n + 1 , value ^ self.a [ n ] [ i ] )
        return
