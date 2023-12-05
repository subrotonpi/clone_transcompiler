def year2017.qualification ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    class OversizedPancakeFlipper ( subprocess.Popen ) :
        def run ( self ) :
            input_file = 'A-large.in'
            with open ( input_file , 'r' ) as f :
                output_file = 'output.txt'
                with open ( output_file , 'w' ) as f :
                    T = len ( f.read ( ) )
                    for t , c in enumerate ( f ) :
                        K = len ( f )
                        count = 0
                        for i in range ( 0 , len ( c ) - K ) :
                            if c [ i ] == '-' :
                                count += 1
                                for k in range ( K ) :
                                    c [ i + k ] = ( c [ i + k ] == '-' ) and '+' or '-'
                    for i in range ( len ( c ) - K + 1 , len ( c ) ) :
                        if c [ i ] == '-' :
                            count = - 1
                    print ( 'Case #{}: {}'.format ( t + 1 , ( 'IMPOSSIBLE' if count == - 1 else count ) ) )
            output_file.write ( '\n' )
