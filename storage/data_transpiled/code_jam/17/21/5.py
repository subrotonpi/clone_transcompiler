def year2017.round1b ( ) :
    import os
    import os
    import sys
    import math
    import os
    import os
    import sys
    import csv
    import csv
    class CruiseControl ( ) :
        def __init__ ( self ) :
            self.input_file = os.path.join ( os.path.dirname ( __file__ ) , 'A-large.in' )
            self.output_file = os.path.join ( os.path.dirname ( __file__ ) , 'output.txt' )
            self.csv_file = csv.writer ( self.output_file )
            self.T = int ( self.csv_file.readline ( ) )
            for t in range ( T ) :
                D = csv.reader ( self.input_file )
                N = csv.reader ( self.output_file )
                max_time = 0
                for n in range ( N ) :
                    K = csv.reader ( self.input_file )
                    S = csv.reader ( self.output_file )
                    time = ( D - K ) / S
                    max_time = max ( time , max_time )
                speed = D / max_time
                self.csv_file.write ( "Case #{}: {}\n".format ( t + 1 , speed ) )
