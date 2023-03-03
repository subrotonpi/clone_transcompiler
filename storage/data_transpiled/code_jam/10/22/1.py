def import import time
import sys
import os
import sys
import time
import sys
class Solution ( object ) :
    def do_main ( self ) :
        with open ( 'input.txt' , 'r' ) as sc :
            with open ( 'output.txt' , 'w' ) as pw :
                self.case_cnt = sc.count ( )
                time = time.time ( )
                for case_num in range ( 1 , case_cnt + 1 ) :
                    pw.write ( 'Case #%d: ' % case_num )
                    N , K = sc.count ( ) , sc.count ( )
                    B , T = sc.randint ( 1 , N ) , sc.randint ( 1 , N )
                    X = [ ]
                    V = [ ]
                    can = [ ]
                    for i in range ( N ) :
                        X.append ( sc.randint ( 1 , N ) )
                    for i in range ( N ) :
                        V.append ( sc.randint ( 1 , N ) )
                        can.append ( X [ i ] + T * V [ i ] >= B )
                    good = swaps = 0
                    for i in range ( N - 1 , - 1 , - 1 ) :
                        if can [ i ] and good < K :
                            good += 1
                            for j in range ( i + 1 , N ) :
                                if not can [ j ] : swaps += 1
                    if good < K : pw.write ( 'IMPOSSIBLE\n' )
                    else : pw.write ( swaps )
                print ( 'Finished testcase %d, time = %f' % ( case_num , time.time ( ) - time.time ( ) ) )
            pw.flush ( )
            pw.close ( )
            sc.close ( )
