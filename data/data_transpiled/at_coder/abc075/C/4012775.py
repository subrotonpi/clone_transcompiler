def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.M = int ( self.M )
        self.a = [ - 1 for i in range ( self.M ) ]
        self.b = [ - 1 for i in range ( self.M ) ]
        self.path = [ False for i in range ( self.N ) ]
        self.visit = [ False for i in range ( self.N ) ]
        ans = 0
        for i in range ( self.M ) :
            for j in range ( self.N ) :
                [ self.path [ j ] ] = True
                self.visit [ j ] = False
        for j in range ( self.M ) :
            self.path [ a [ j ] ] [ b [ j ] ] = True
            self.visit [ j ] = False
        self.path [ a [ i ] ] [ b [ i ] ] = False
        self.path [ b [ i ] ] [ a [ i ] ] = False
        self.dfs ( 0 )
        all_visit = True
        for j in range ( self.N ) :
            if not self.visit [ j ] :
                all_visit = False
        if not all_visit :
            ans += 1
    print ( ans )
    def dfs ( self , point ) :
        self.visit [ point ] = True
        for i in range ( self.N ) :
            if self.path [ point ] [ i ] and not self.visit [ i ] :
                self.dfs ( i )
