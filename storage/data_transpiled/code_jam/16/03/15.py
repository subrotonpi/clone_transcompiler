def qualification ( ) :
    import os
    import math
    import sys
    import os
    import sys
    class C_CoinJam ( object ) :
        def __init__ ( self ) :
            self.FILENAME = 'data/qualification/C-large'
            self.STANDARD_OUTPUT = False
            self.stdin = open ( self.FILENAME + '.in' , 'r' )
            self.stdout = open ( self.FILENAME + '.out' , 'w' )
            self.witnesses = [ 1 , 2 , 10 ]
            for base , n in enumerate ( string.split ( ' ' ) ) :
                for f in range ( 2 , n + 1 ) :
                    if n % f == 0 :
                        self.witnesses [ base ] = f
                        break
                if self.witnesses [ base ] == None :
                    continue
                self.process ( self )
        def process ( self ) :
            for case_number , T in enumerate ( string.split ( ' ' ) ) :
                self.witnesses = [ 1 , 2 , 10 ]
                self.stdout.write ( ' ' + self.witnesses [ base ] + '\n' )
            self.process ( self )
    def solve_big ( self ) :
        primes_l = [ 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 ]
        primes = [ pow ( n , n ) for n in primes_l ]
        j = 0
        loop : for i , t in enumerate ( [ 0 , 1 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2