def import __modernart_easy
class ModernArtEasy ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
    def __call__ ( self , * args ) :
        if self.T <= self.T :
            print ( "Case #%d: " % self.T , end = ' ' )
            self.n = int ( self.n )
            self.a = [ [ True for i in range ( self.n ) ] for u in range ( self.n ) ]
            self.b = [ [ True for i in range ( self.n ) ] for u in range ( self.n ) ]
            self.a [ u ] [ v ] = self.a [ v ] [ u ] = True
        self.m = int ( self.m )
        self.b = [ [ True for i in range ( self.n ) ] for u in range ( self.m ) ]
        self.a [ u ] [ v ] = self.b [ v ] [ u ] = True
        if self.recurse ( 0 , [ True for i in range ( self.n ) ] , [ False for i in range ( self.m ) ] ) :
            print ( "YES" )
        else :
            print ( "NO" )
def recurse ( self , index , used , ass ) :
    m , n = len ( self.b ) , len ( self.a )
    if index < m :
        for i in range ( self.n ) :
            if not self.used [ i ] :
                ass [ index ] = i
                self.used [ i ] = True
                if self.recurse ( index + 1 , used , ass ) :
                    return True
                self.used [ i ] = False
    else :
        for i in range ( self.m ) :
            for j in range ( self.m ) :
                if self.a [ ass [ i ] ] [ ass [ j ] ] != self.b [ i ] [ j ] :
                    return False
        return True
return ModernArtEasy
