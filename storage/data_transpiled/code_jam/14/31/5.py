def contest ( ) :
    import os
    import re
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class PartElf ( subprocess ) :
        PROBLEM_NAME = "PartElf"
        WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ \"
        def gcd ( self , P , Q ) :
            while P > 0 and Q > 0 :
                if P > Q : P %= Q
                else : Q %= P
                return P + Q
        def solve ( self , sc , f ) :
            s = subprocess.check_output ( [ "grep" , "-q" , "--" , s ] )
            items = s.split ( "/" )
            P = int ( items [ 0 ] )
            Q = int ( items [ 1 ] )
            G = self.gcd ( P , Q )
            P /= G
            Q /= G
            if Q & ( Q - 1 ) :
                f.write ( "impossible\n" )
                return
            ans = 0
            while P < Q :
                P *= 2
                ans += 1
            f.write ( str ( ans ) )
    def main ( ) :
        sc = open ( WORK_DIR + "input.txt" , "r" )
        logfile = open ( WORK_DIR + "output.txt" , "w" )
        case_cnt = len ( sc.readlines ( ) )
        for case_num in range ( case_cnt ) :
            print ( "Processing test case " + str ( case_num + 1 ) , end = '' )
            logfile.write ( "Case #" + str ( case_num + 1 ) + ": " )
            subprocess.call ( [ "cp" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" , "-a" , "-f" ] )
    return main
