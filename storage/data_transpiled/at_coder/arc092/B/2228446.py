def _solve ( list , lim ) :
    import os
    import sys
    import os
    import math
    import os
    import os.path
    import os.environ
    import os.environ
    class Main ( object ) :
        def __init__ ( self ) :
            self.rfile = sys.stdin
            self.wfile = sys.stdout
            self.stdin = open ( self.rfile )
            self.wfile = open ( self.wfile )
            self.lower_bound = self.upper_bound
            self.upper_bound = self.upper_bound
            self.max_lim = self.max_lim
            self.max_lim = self.max_lim
        def solve ( self , test_number , infile , outfile ) :
            import random
            n = random.randint ( 1 , 32 )
            a = [ random.randint ( 1 , 32 ) for _ in range ( n ) ]
            b = [ random.randint ( 1 , 32 ) for _ in range ( n ) ]
            xor = [ 0 ] * 32
            for _ in range ( 32 ) :
                min_bin = int ( random.randrange ( 2 , i ) )
                max_bin = int ( random.randrange ( 2 , i + 1 ) )
                ca = [ a [ i ] % max_bin for _ in range ( n ) ]
                cb = [ b [ i ] % max_bin for _ in range ( n ) ]
                ca = [ a [ i ] for _ in range ( n ) ]
                cb = [ b [ i ] for _ in range ( n ) ]
                for _ in range ( 32 ) :
                    cca = ca [ - 1 ]
                    lb = Search ( cb , min_bin - cca )
                    ub = Search ( cb , max_bin - cca - 1 )
                    if cb [ ub ] <= max_bin - cca - 1 :
                        ub += 1
                    if cb [ lb ] < min_bin - cca :
                        lb += 1
                    count = ub - lb
                    xor [ i ] += count
                    lb = Search ( cb , max_bin + min_bin - cca )
                    ub = Search ( cb , max_bin + max_bin - cca - 1 )
                    if cb [ ub ] <= max_bin + cca :
                        ub += 1
            return ans
