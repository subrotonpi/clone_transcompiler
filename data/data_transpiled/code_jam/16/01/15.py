def import import os , StringIO , StringIO , pipes , pipes , ** kwargs ) :
    import sys
    import os
    import subprocess
    import shlex
    import subprocess
    import subprocess
    import tempfile
    import sys
    class Sheep ( object ) :
        def __init__ ( self ) :
            import subprocess
            import subprocess
            subprocess.call ( [ 'shell' , '--shell' , '--quiet' , '--no-output' , '--quiet' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' , '--no-output' ] )
        def do_case ( self , case_number ) :
            line = stdin.readline ( )
            scan = shlex.shlex ( line )
            N = scan.__next__ ( )
            if N == 0 :
                print ( 'INSOMNIA' )
                return
            seen = [ False ] * 10
            curr = N
            while True :
                curr_string = str ( curr )
                for char in curr_string :
                    seen [ char - '0' ] = True
                if all_seen ( seen ) :
                    print ( curr )
                    return
                curr += N
        def all_seen ( seen ) :
            for i in range ( 0 , 9 ) :
                if not seen [ i ] :
                    return False
            return True
        def run ( self ) :
            num_cases = int ( stdin.readline ( ).strip ( ) )
            for i in range ( 1 , num_cases + 1 ) :
                stdout.write ( 'Case #%d: ' % i )
                do_case ( i )
            return True
    return Sheep ( )
