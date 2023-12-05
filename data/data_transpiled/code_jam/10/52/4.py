def main ( ) :
    import time
    import sys
    import os
    import sys
    import os
    import sys
    class Solution ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    self.case_cnt = sc.count ( )
                    time = time.time ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        pw.write ( 'Case #%d: ' % case_num )
                        L , N = sc.__next__ ( )
                        B = [ i for i in range ( N ) ]
                        B.sort ( )
                        state = int ( L % B [ N - 1 ] )
                        MOD = B [ N - 1 ]
                        best = [ 0 ] * MOD
                        best [ 0 ] = 1000000000
                        known = [ False ] * MOD
                        Q = [ 0 ] * 2 * MOD * N
                        q_beg , q_end = MOD * N , MOD * N
                        Q [ q_beg ] = 0
                        while q_end < q_beg :
                            x = Q [ q_end ]
                            if known [ x ] :
                                continue
                            known [ x ] = True
                            for i in range ( N - 1 ) :
                                next = x + B [ i ]
                                if next < MOD :
                                    if best [ next ] > best [ x ] + 1 :
                                        best [ next ] = best [ x ] + 1
                                        Q [ q_beg ] = next
                                else :
                                    if best [ next - MOD ] > best [ x ] :
                                        best [ next - MOD ] = best [ x ]
                                        Q [ - q_beg ] = next - MOD
                    if best [ state ] == 1000000000 :
                        pw.write ( 'IMPOSSIBLE\n' )
                    else :
                        pw.write ( L / MOD + best [ state ] )
            pw.flush ( )
            pw.close ( )
