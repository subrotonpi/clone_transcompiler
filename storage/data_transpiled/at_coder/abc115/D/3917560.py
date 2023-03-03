def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self , H , W , K ) :
        self.H = H
        self.W = W
        self.K = K
    def dp ( self , n , x ) :
        self.X = [ ]
        self.P = [ ]
        self.X.append ( 1 )
        self.P.append ( 1 )
        for i in range ( 1 , 50 ) :
            self.X.append ( 2 * self.X [ i - 1 ] + 3 )
            self.P.append ( 2 * self.P [ i - 1 ] + 1 )
        ans = self.sum ( n , x )
        print ( ans )
    def sum ( self , n , l ) :
        if n == 1 :
            if l == 1 :
                return 0
            elif l <= 4 :
                return l - 1
            else :
                return 3
        if l <= 1 :
            return 0
        elif l <= 1 + self.X [ n - 1 ] :
            return self.sum ( n - 1 , l - 1 )
        elif l == 2 + self.X [ n - 1 ] :
            return self.P [ n - 1 ] + 1
        elif l <= 2 + 2 * self.X [ n - 1 ] :
            return self.P [ n - 1 ] + 1 + sum ( n - 1 , l - ( 2 + self.X [ n - 1 ] ) )
        else :
            return 2 * self.P [ n - 1 ] + 1
class Pair ( object ) :
    from operator import itemgetter
    def from_key ( self , key ) :
        return self.X [ key ]
    def to_key ( self , other ) :
        otherpair = other [ key ]
        return self.end - otherpair.end
return Main ( )
