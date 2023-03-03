def import _solve
class D ( object ) :
    def __init__ ( self , T ) :
        self.T = T
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s\n" % ( i , "GABRIEL" if _solve ( ) else "RICHARD" ) )
    def solve ( self ) :
        X = self.T
        R = self.R
        C = self.C
        if R * C % X != 0 :
            return False
        if R < C :
            tmp = R
            R = C
            C = tmp
        if R < X :
            return False
        if X == 1 :
            return True
        if X == 2 :
            return True
        if X == 3 :
            return C > 1
        if X == 4 :
            return C > 2
        if X == 5 :
            return C > 2 and R * C > 15
        if X == 6 :
            return C > 3
        return False
return D
