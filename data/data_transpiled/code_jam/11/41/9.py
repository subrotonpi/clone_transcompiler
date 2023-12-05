def _ ( ) : return ''
import sys
import os
import sys
import random
import time
import time
import random
import sys
class A ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.output = sys.stdout
    def solve ( self , f ) :
        self.X , self.S , self.R , self.T = random.randint ( 1 , 30 )
        self.B , self.E , self.W = random.randint ( 1 , 30 )
        self.l = random.randint ( 1 , 30 )
        lines = [ ]
        s = self.X
        for i in range ( self.N ) :
            l [ i ] = self.E [ i ] - self.B [ i ]
            lines.append ( ( l [ i ] , self.W [ i ] ) )
            s -= ( l [ i ] )
        lines.append ( ( s , 0 ) )
        lines.sort ( )
        run_time_left = self.T
        res = 0
        for line in lines :
            time_if_run = 1.0 * line.length / ( line.speed + R )
            if time_if_run <= run_time_left :
                res += time_if_run
                run_time_left -= time_if_run
            else :
                distance_left = line.length - run_time_left * ( line.speed + R )
                time = run_time_left + 1.0 * distance_left / ( line.speed + S )
                res += time
                run_time_left = 0
        return "" , res
