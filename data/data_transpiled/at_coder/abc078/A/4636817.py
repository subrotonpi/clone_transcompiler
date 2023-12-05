def main ( ) :
    class Main ( object ) :
        _sc = sys._getframe ( 1 )
        X = _sc.f_code
        Y = _sc.f_code
        a = 10
        b = 10
        A = 'A'
        B = 'B'
        C = 'C'
        D = 'D'
        E = 'E'
        F = 'F'
        if X == A : a = 10
        elif X == B : a = 11
        elif X == C : a = 12
        elif X == D : a = 13
        elif X == E : a = 14
        elif X == F : a = 15
        if Y == A : b = 10
        elif Y == B : b = 11
        elif Y == C : b = 12
        elif Y == D : b = 13
        elif Y == E : b = 14
        elif Y == F : b = 15
        if a < b : println ( "<" )
        elif a == b : println ( "=" )
        else : println ( ">" )
        for i in range ( 10 ) :
            print ( "[" + i + "] " + str ( i ) )
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = X
            self.Y = Y
        def __repr__ ( self ) :
            if self.X is None :
                print ( "None" )
            else :
                print ( self.X )
        def __str__ ( self ) :
            return "<" + self.X + ">"
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = X
            self.Y = Y
        def __repr__ ( self ) :
            if self.X is None :
                print ( "None" )
            else :
                print ( self.X )
        def __str__ ( self ) :
            return "<" + self.X + ">"
