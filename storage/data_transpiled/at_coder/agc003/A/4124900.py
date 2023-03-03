def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        self.n , self.w , self.s , self.e = False , False , False
        for c in str ( self ) :
            if c == 'N' :
                self.n = True
            elif c == 'W' :
                self.w = True
            elif c == 'S' :
                self.s = True
            elif c == 'E' :
                self.e = True
        if ( self.n and self.s or not self.n and not self.s ) and ( self.w and self.e or not self.w and not self.e ) :
            self.print ( "Yes" )
        else :
            self.print ( "No" )
