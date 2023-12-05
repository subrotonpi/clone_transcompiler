def _ _ init _ _ ( ) : return [ ]
class Main ( object ) :
    def __init__ ( self , root ) :
        self.N = 0
        self.parent = [ ]
        self.depth = [ ]
    def apply ( self , v ) :
        if self.depth [ u ] > self.depth [ v ] :
            self.depth [ u ] = self.depth [ v ]
            self.depth [ v ] = self.depth [ v ]
    def bfs ( self , G ) :
        self.depth [ u ] = self.depth [ v ]
        self.depth [ u ] = self.depth [ v ]
    def bfs ( self , G ) :
        for k in range ( 0 , len ( self.depth ) ) :
            if self.depth [ k ] [ v ] < 0 :
                self.depth [ k ] = - 1
            else :
                self.depth [ k ] = self.depth [ k ] [ v ]
    def bfs ( self , G ) :
        self.depth [ u ] = self.depth [ v ]
        self.depth [ v ] = self.depth [ v ]
    def readline ( self ) :
        if self.depth [ u ] == 0 or not self.depth [ u ] :
            try :
                self.depth [ u ] = self.depth [ u ]
            except KeyError :
                raise RuntimeError ( "No depth found for " + self.depth [ u ] )
        return self.depth [ u ]
    def readline ( self ) :
        if self.depth [ u ] == 0 or not self.depth [ u ] :
            try :
                self.depth [ u ] = self.depth [ u ]
            except KeyError :
                raise RuntimeError ( "No depth found for " + self.depth [ u ] )
        return self.depth [ u ]
    def readline ( self ) :
        if self.depth [ u ] == 0 or not self.depth [ u ] :
            try :
                self.depth [ u ] = self.depth [ u ] [ v ]
            except KeyError :
                raise RuntimeError ( "No depth found for " + self.depth [