def _import ( ) :
    import time
    import sys
    import os
    import sys
    import os
    import sys
    class Sol_slow ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.case_cnt = sc.count ( )
                    time = time.time ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        f.write ( 'Case #%d: ' % case_num )
                        C = sc.count ( )
                        A = [ ]
                        B = [ ]
                        N = 0
                        for i in range ( C ) :
                            A.append ( sc.randint ( 0 , 1 ) )
                            B.append ( sc.randint ( 0 , 1 ) )
                            N += B [ i ]
                        x = [ ]
                        pos = 0
                        for i in range ( C ) :
                            for j in range ( B [ i ] ) :
                                x.append ( A [ i ] )
                                pos += 1
                        cnt = 0
                        while True :
                            find = False
                            x.sort ( )
                            for i in range ( 0 , N ) :
                                if x [ i ] == x [ i + 1 ] :
                                    x [ i ] -= 1
                                    x [ i + 1 ] += 1
                                    find = True
                                    cnt += 1
                                    break
                                if not find :
                                    break
                        f.write ( str ( cnt ) )
                    print ( 'Finished testcase %d, time = %f' % ( case_num , time.time ( ) - time.time ( ) ) )
