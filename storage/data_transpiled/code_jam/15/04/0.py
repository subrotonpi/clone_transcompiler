def main ( * orange ) :
    import sys
    import random
    import sys
    class D ( object ) :
        def __init__ ( self , * orange ) :
            self.N , R , C = random.choice ( orange )
            self.N = N
            self.R = R
            self.C = C
            self.print ( "Case #%d: %s\n" % ( n + 1 , "GABRIEL" if good ( ) else "RICHARD" ) )
    def good ( self ) :
        if self.R * self.C % self.N != 0 :
            return False
        if self.N >= 7 :
            return False
        elif self.N == 6 :
            if min ( self.R , C ) <= 3 :
                return False
        elif self.N == 5 :
            if min ( self.R , C ) <= 2 or min ( self.R , C ) == 3 and max ( self.R , C ) == 5 :
                return False
        elif self.N == 4 :
            if min ( self.R , C ) <= 2 :
                return False
        elif self.N == 3 :
            if min ( self.R , C ) <= 1 :
                return False
        return True
    return D
