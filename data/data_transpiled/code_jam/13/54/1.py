def contest ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class WheelEasy ( subprocess ) :
        PROBLEM_NAME = "wheel1"
        WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ \"
        def solve ( sc , file ) :
            s = sc.read ( )
            N = len ( s )
            dp = [ 0.0 ] * ( 1 << N )
            dp [ ( 1 << N ) - 1 ] = 0.0
            for mask in range ( ( 1 << N ) - 2 , - 1 , - 1 ) :
                ans = 0.0
                for pos in range ( N ) :
                    pp , wait = pos , 0
                    while mask & ( 1 << pp ) :
                        pp = ( pp + 1 ) % N
                        wait += 1
                    nmask = mask | ( 1 << pp )
                    ans += dp [ nmask ] + ( N - wait )
                dp [ mask ] = ans / N
            mask = 0
            for i in range ( N ) :
                if s [ i ] == "X" :
                    mask |= ( 1 << i )
            print ( dp [ mask ] , file = file )
    def main ( ) :
        sc = subprocess.Popen ( [ WORK_DIR + "input.txt" ] , stdout = subprocess.PIPE )
        out = open ( WORK_DIR + "output.txt" , "w" )
        case_cnt = len ( sc.stdout.readlines ( ) )
        for case_num in range ( case_cnt ) :
            print ( "Processing test case " + str ( case_num + 1 ) )
            print ( "Case #" + str ( case_num + 1 ) + ": " , end = '' )
            subprocess.call ( [ "make" , "-t" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" , "-" ,