def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.N , self.M , self.X , self.Y = self._raw_input ( )
    def __init__ ( self ) :
        self.N = self.N
        self.M = self.M
        self.X , self.Y = self.X , self.Y
    def __init__ ( self ) :
        self.xn = [ ]
        self.ym = [ ]
        for i in range ( self.N ) :
            xn.append ( self._raw_input ( ) )
        for i in range ( self.M ) :
            ym.append ( self._raw_input ( ) )
    def __init__ ( self ) :
        self.ym = [ ]
        self.Z = X + 1
        while Z < Y :
            is_wing = False
            for i in range ( self.N ) :
                if xn [ i ] >= Z :
                    is_wing = True
            for i in range ( self.M ) :
                if ym [ i ] < Z :
                    is_wing = True
            if not is_wing :
                sys.stdout.write ( 'No War\n' )
                return
            Z += 1
        sys.stdout.write ( 'War\n' )
