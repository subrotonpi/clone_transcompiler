def _ _ main _ _ ( ) :
    import os
    import re
    import os
    import os
    import math
    import os
    import os
    import os
    import math
    import os
    import os
    import os
    import math
    import os
    import os
    import subprocess
    import subprocess
    class Main ( object ) :
        def __init__ ( self , test_number ) :
            locale.setlocale ( 'locale.US' , '' )
            try :
                import re
                regex = r'C-(small|large).*[.]in'
                directory = os.path.dirname ( os.path.abspath ( __file__ ) )
                candidates = os.listdir ( directory )
                to_run = None
                for candidate in candidates :
                    if not to_run or os.path.getmtime ( candidate ) > os.path.getmtime ( to_run ) :
                        to_run = candidate
                input_file = open ( to_run , 'r' )
            except OSError :
                input_file = None
            with open ( 'c.out' , 'w' ) as output_file :
                self.output_file = output_file
                self.test_count = int ( input_file.read ( ) )
                for i in range ( 1 , test_count + 1 ) :
                    self.solver.solve ( i , input_file , output_file )
                output_file.close ( )
        def solve ( self , test_number , f , out ) :
            n = len ( f )
            f.seek ( 0 )
            p = [ ]
            for x , y , z in zip ( range ( n ) , range ( n ) ) :
                p.append ( ( x , y , z ) )
                f.seek ( 0 )
                f.write ( '\n' )
            d = [ ]
            for i in range ( n ) :
                if d [ i ] [ y ] <= M and not u [ y ] :
                    self.dfs ( i )
            return d
    return Main
