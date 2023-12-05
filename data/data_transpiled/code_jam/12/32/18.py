def _import ( ) :
    import math
    import os
    import os
    import os
    import math
    import os
    import sys
    import time
    import time
    import time
    import time
    import time
    import time
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class Q2 :
        def run ( CASE ) :
            stdin = open ( 'B-small-attempt0.in' , 'r' )
            total_dist = float ( stdin.readline ( ) )
            N = int ( stdin.readline ( ) )
            A = int ( stdin.readline ( ) )
            t = [ float ( stdin.readline ( ) ) for i in range ( N ) ]
            x = [ float ( stdin.readline ( ) ) for i in range ( N ) ]
            stdin = open ( 'out.txt' , 'w' )
            stdout.write ( 'Case #%d:\n' % ( CASE ) )
            for a in range ( A ) :
                accel = float ( stdin.readline ( ) )
                dist = time = vel = 0
                for i in range ( N ) :
                    dist_by_accel = vel * t [ i ] + 0.5 * accel * t [ i ] * t [ i ]
                    dist_other_car = x [ i ]
                    if dist + dist_other_car >= total_dist :
                        factor = math.sqrt ( vel ** 2 + 2 * accel * ( total_dist - dist ) )
                        final_time_by_accel = ( - vel + factor ) / accel
                        if final_time_by_accel < 0 :
                            final_time_by_accel = ( - vel - factor ) / accel
                        final_time_by_other = - 1
                        if i == 0 :
                            final_time_by_other = 0
                        else :
                            final_time_by_other = ( total_dist - x [ i - 1 ] ) * ( t [ i ] - t [ i - 1 ] ) / ( x [ i ] - x [ i - 1 ] )
                        final_time = max ( final_time_by_accel , final_time_by_other )
                        printf ( '%.7f\n' , time + final_time )
                        break
                    if dist_by_accel <= dist_other_car :
                        dist += dist_by_accel
                        time += t [ i ]
                        vel += accel * t [ i ]
                    else :
                        print ( '%.7f\n' % ( a )