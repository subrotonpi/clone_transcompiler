def de.kleberhoff.googlecodejam.quali_2015 ( ) :
    import os
    import sys
    import os
    import sys
    import time
    import sys
    class A_StandingOvation ( object ) :
        def __init__ ( self , input ) :
            self.n = input.count ( )
            self.shyness_distribution = [ int ( x ) for x in input.split ( ' ' ) ]
        def solve ( self ) :
            standing = 0
            addition = 0
            for shyness in self.shyness_distribution :
                missing = shyness - standing
                if missing > 0 :
                    addition += missing
                    standing += missing
                standing += shyness_distribution [ shyness ]
            return addition
        def solve ( self ) :
            return self.standing
    start = time.time ( )
    with open ( 'D:/Codejam/2015-Q/A.in' , 'r' ) as f :
        with open ( 'D:/Codejam/2015-Q/A.out' , 'w' ) as f :
            n_tests = len ( f.readlines ( ) )
            for i in range ( 1 , n_tests + 1 ) :
                task = A_StandingOvation ( f )
                yield "Case #{}: {}".format ( i , result )
                f.write ( "\n".join ( [ "{} {}".format ( i , result ) for i in range ( 0 , len ( f.readlines ( ) ) ) ] ) )
                print ( "\n".join ( [ "{} {}".format ( i , result ) for i in range ( 0 , len ( f.readlines ( ) ) ) ] ) )
    sys.stdout.close ( )
    finish = time.time ( )
    print ( "Time={}ms".format ( finish - start ) )
