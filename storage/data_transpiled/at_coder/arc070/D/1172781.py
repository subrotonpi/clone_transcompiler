def import _ask
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _ask
        self.A , self.B , self.N = self.sc.__next__ ( )
        if self.B >= self.A :
            print ( "Impossible" )
        else :
            honest = self._honest ( )
            ans = [ '1' if _ask ( honest , i ) else '0' for i in range ( self.N ) ]
            print ( "! " + str ( ans ) )
    def _honest ( self ) :
        need = self.B + 1
        lst = list ( range ( self.N ) )
        for i in range ( self.N ) :
            if lst == [ ] :
                lst.append ( i )
            else :
                if _ask ( lst [ - 1 ] , i ) :
                    lst.append ( i )
                else :
                    lst.pop ( )
                    need -= 1
            if len ( lst ) >= need :
                return lst.pop ( )
        return - 1
    def ask ( self , a , b ) :
        print ( "? " , a , b )
        return self.sc.__next__ ( )
