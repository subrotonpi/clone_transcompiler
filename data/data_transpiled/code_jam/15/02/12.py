def de.kleberhoff.googlecodejam.quali_2015 ( ) :
    import os
    import sys
    import os
    import sys
    import time
    import os
    import subprocess
    import subprocess
    class B_Pancakes ( subprocess.Popen ) :
        def wait ( self ) :
            d = subprocess.Popen ( [ "D:/Codejam/2015-Q/B.in" , "--wait" ] ).wait ( )
            pancakes = [ ]
            highest = 0
            for i in range ( d ) :
                h = subprocess.Popen ( [ "D:/Codejam/2015-Q/B.out" , "--wait" ] ).wait ( )
                if h > highest :
                    highest = h
                pancakes.append ( h )
    def solve ( ) :
        best_steps = highest
        for rem in range ( 1 , highest ) :
            split_steps = 0
            for h in pancakes :
                steps = ( h - 1 ) / rem
                split_steps += steps
            cost = split_steps + rem
            if cost < best_steps :
                best_steps = cost
        return best_steps
    start = time.time ( )
    with open ( "D:/Codejam/2015-Q/B.in" , "r" ) as f :
        stdout = open ( "D:/Codejam/2015-Q/B.out" , "w" )
        n_tests = len ( f.readlines ( ) )
        for i in range ( 1 , n_tests + 1 ) :
            task = B_Pancakes ( f )
            yield "Case #{}: {}".format ( i , result )
            stdout.write ( "\n".join ( [ "Case #{}: {}".format ( i , result ) for i in range ( 1 , n_tests + 1 ) ] ) )
            stdout.write ( "\n".join ( [ "Case #{}: {}".format ( i , result ) for i in range ( 1 , n_tests + 1 ) ] ) )
    finish = time.time ( )
    print ( "Time={}ms".format ( finish - start ) )
