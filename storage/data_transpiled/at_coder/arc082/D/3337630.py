def _ _ main _ _ ( ) : return sys.stdin
class Main ( object ) :
    def __init__ ( self , h , u , v ) :
        self.X = h
        self.K = v
        self.Q = v
    @ staticmethod
    def readline ( ) :
        if not isinstance ( self.X , str ) or not isinstance ( self.X , str ) :
            try :
                self.X = raw_input ( )
            except EOFError :
                raise EOFError
        return self.X
    def down ( self , u , v ) :
        self.X = h
        self.v = v
    @ staticmethod
    def readline ( ) :
        if not isinstance ( self.X , str ) or not isinstance ( self.X , str ) :
            try :
                self.X = raw_input ( )
            except EOFError :
                raise EOFError
        return self.X
    def up ( self , u , v ) :
        self.X = h
        self.v = v
    def next_int ( self ) :
        self.T = [ ]
        self.H = [ ]
        self.H = [ ]
        self.U = [ ]
        self.V = [ ]
        self.H.append ( 0 )
        self.U.append ( min ( self.R [ 0 ] , self.X ) )
        self.V.append ( self.X )
        for i in range ( 1 , K ) :
            t = self.R [ i ] - self.R [ i - 1 ]
            if i % 2 == 0 :
                result = down ( self.H [ i - 1 ] , self.U [ i - 1 ] , self.V [ i - 1 ] , t )
            else :
                result = up ( self.H [ i - 1 ] , self.U [ i - 1 ] , self.V [ i - 1 ] , t )
            self.H.append ( result.h )
            self.U.append ( result.u )
            self.V.append ( result.v )
return Main ( )
