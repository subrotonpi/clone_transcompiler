def gcj._2015.qual ( ) :
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import subprocess
    import subprocess
    class A :
        def solve ( self ) :
            input = open ( 'data/gcj/2015/qual/A-large.in' )
            self.stdin = input
            test = open ( 'data/gcj/2015/qual/A.out' , 'w' )
            self.stdout = sys.stdout
            self.stdout = subprocess.PIPE
            self.stdin.close ( )
            case = self.stdin.readline ( )
            self.stdin.readline ( )
            for i in range ( 1 , case + 1 ) :
                print ( 'Case #%d: %d\n' % ( i , self.solve_case ( ) ) , end = '' )
        def solve_case ( self ) :
            smax = self.stdin.readline ( ).strip ( )
            s = self.stdin.readline ( )
            need = 0
            total = 0
            for i in range ( len ( s ) ) :
                audnum = s [ i ] - '0'
                if audnum == 0 :
                    continue
                if total < i :
                    need += i - total
                    total += i - total
                total += audnum
            return need
    return A ( )
