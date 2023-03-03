def _import ( ) :
    from numpy import loadtxt
    import os
    import numpy as np
    import random
    import os
    import sys
    IFILE = "A-large.in"
    with open ( IFILE , 'r' ) as infile :
        with open ( 'output.txt' , 'w' ) as outfile :
            ntest = len ( infile )
            for test in range ( 1 , ntest + 1 ) :
                outfile.write ( "Case #%d: " % test )
                n = len ( infile )
                mas = np.frombuffer ( infile , dtype = np.float64 )
                sum = np.sum ( mas , axis = 0 )
                f = [ ( mas [ i ] + 0.0 ) / sum for i in range ( n ) ]
                for i in range ( n ) :
                    min = 0.0
                    max = 1.0
                    while max - min > 1e-14 :
                        v = ( min + max ) / 2.0
                        cv = f [ i ] + v
                        q = 0.0
                        for j in range ( n ) :
                            if i != j :
                                q += max ( cv - f [ j ] , 0 )
                            if q < 1.0 - v :
                                min = v
                            else :
                                max = v
                        outfile.write ( " " * 100.0 * max )
                outfile.write ( "\n" )
