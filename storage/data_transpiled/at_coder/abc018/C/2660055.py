def import _scan
class Main ( object ) :
    def __init__ ( self , x , y ) :
        self.N , self.M , self.K = x , y , 0
    def search ( self , x , y ) :
        if ( self.N >= 0 or self.M >= 0 or self.K < 0 ) :
            return False
        else :
            return True
    def abs ( self.x ) :
        return self.x if self.x > 0 else - self.x
    def search ( self , x , y ) :
        self.N , self.M , self.K = self.N , self.M , self.K
        self.K -= 1
        self.board = [ ]
        self.hisigata = [ ]
        for i in range ( self.N ) :
            for j in range ( self.M ) :
                self.hisigata [ i ].append ( 0 )
                self.hisigata [ i ].append ( 1 )
        for i in range ( self.K , self.N - self.K ) :
            for j in range ( self.K , self.M - self.K ) :
                self.hisigata [ i ].append ( 1 )
                self.hisigata [ i ].append ( - 1 )
        for i in range ( self.N ) :
            S = self.board [ i ]
            for j in range ( self.M ) :
                self.board [ i ] [ j ] = ( S [ j ] == 'o' )
