def de.kleberhoff.googlecodejam.quali_2015 ( ) :
    import os
    import time
    import sys
    import os
    import sys
    import os.path
    import time
    import sys
    class D_Omino ( object ) :
        def __init__ ( self , x ) :
            self.x = x
            self.r = r
            self.c = c
        def solve ( self ) :
            if self.x == 1 :
                return True
            if self.x >= 7 :
                return False
            if ( self.r * self.c ) % self.x != 0 :
                return False
            if not self.willFit ( ) :
                return False
            if self.specialFailure ( ) :
                return False
            return True
        def willFit ( self ) :
            d1 = min ( self.r , self.c )
            d2 = max ( self.r , self.c )
            for w , h in zip ( self.x , self.c ) :
                if w > d1 or h > d2 :
                    return False
            return True
        def specialFailure ( self ) :
            d1 = min ( self.r , self.c )
            d2 = max ( self.r , self.c )
            if self.x == 4 :
                if d1 == 2 :
                    return True
            elif self.x == 5 :
                if d1 == 3 and d2 == 5 :
                    return True
            elif self.x == 6 :
                if d1 == 3 :
                    return True
            return False
        def main ( self ) :
            start = time.time ( )
            with open ( "D:/Codejam/2015-Q/D.in" , "r" ) as f :
                f.write ( "" )
            f.close ( )
    sys.path.append ( "D:/Codejam/2015-Q/D.out" )
    n_tests = sys.argv [ 1 ]
    for i in range ( 1 , n_tests + 1 ) :
        task = D_Omino ( sys.argv [ 2 ] )
        yield task
        result = task.solve ( )
        yield "Case #%d: %s" % ( i , " GABRI@@