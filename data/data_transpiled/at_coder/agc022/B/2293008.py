def main ( ) :
    import sys
    import os
    import subprocess
    import subprocess
    import time
    import sys
    if sys.stdin.isatty ( ) :
        cin = subprocess.Popen ( [ '/usr/bin/cin' , '-s' ] , stdout = subprocess.PIPE )
        n = cin.wait ( )
        if n == 3 :
            print ( '2 5 63' )
        elif n == 4 :
            print ( '2 5 20 63' )
        elif n == 5 :
            print ( '2 5 20 63 30' )
        else :
            nums = set ( )
            offset = ( 2 , 3 , 4 , 6 )
            k = 0
            summary = 0
            for i in range ( n ) :
                k = i // 4
                ai = k * 6 + offset [ i % 4 ]
                nums.add ( ai )
                summary += ai
            next6k = ( k + 1 ) * 6
            if next6k in nums :
                next6k += 6
            fraction = summary % 6
            candidateToRemove = ( 0 , 0 , 8 , 9 , 0 , 9 )
            candidateToAppend = ( 0 , 0 , ( k + 1 ) * 6 , ( k + 1 ) * 6 , 0 , k * 6 + 4 )
            if fraction != 0 :
                nums.remove ( candidateToRemove [ fraction ] )
                append = candidateToAppend [ fraction ]
                if append in nums :
                    append += 6
                nums.add ( append )
            print ( ' '.join ( nums ) )
