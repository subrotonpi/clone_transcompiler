def _import ( ) :
    from itertools import chain
    class C :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.T = len ( self.stdin )
            for C in range ( 1 , T + 1 ) :
                print ( "Case #{}: {}".format ( C , self.dH ) )
        def __init__ ( self ) :
            self.dH = self.dH
            self.dA = self.dA
            self.kA = self.moves
        def __eq__ ( self , o ) :
            if isinstance ( o , State ) :
                self.dH = self.dH
                self.dA = self.dA
                self.kA = self.moves
            return False
        def __hash__ ( self ) :
            return self.dH * 1000000 + self.kH * 10000 + self.kA
        def __eq__ ( self , o ) :
            if isinstance ( o , State ) :
                self.dH = self.dH
                self.dA = self.dA
                self.kA = self.moves
            return True
        def __hash__ ( self ) :
            return self.dH * 1000000 + self.kH * 10000 + self.kA
        def __eq__ ( self , o ) :
            if isinstance ( o , State ) :
                self.dH = self.dH
                self.dA = self.dH
                self.kA = self.moves
            return False
        def __hash__ ( self ) :
            return self.dH * 1000000 + self.kH * 10000 + self.kA
        def __eq__ ( self , o ) :
            if isinstance ( o , State ) :
                self.dH = self.dH
                self.dA = self.dH
                self.kA = self.moves
            return True
        def __hash__ ( self ) :
            return self.dH
        def __eq__ ( self , o ) :
            if isinstance ( o , State ) :
                self.dH = self.dH
                self.dA = self.dH
                self.kA = self.moves
            return False
        def __repr__ ( self ) :
            return "IMPOSSIBLE"
    return C
