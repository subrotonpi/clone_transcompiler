def _import ( ) :
    import time
    import numpy as np
    import numpy.random
    import numpy.testing as npt
    class Sol_Slow ( object ) :
        def __init__ ( self ) :
            self.cnt = 0
            self.B = 0
            self.A = np.zeros ( 100 )
            self.M = np.zeros ( 100 )
            self.was = np.zeros ( 20 )
            self.A = np.zeros ( 100 )
            self.B = np.zeros ( 20 )
            self.was = np.zeros ( 30 )
        def go ( self , left , last , pos ) :
            if left == 0 :
                max_len = 0
                for i in pos :
                    [ M [ i ] , M [ i ] ] = - 1
                    len = 0
                    tmp = A [ i ]
                    while tmp > 0 :
                        M [ i ] [ len ] = tmp % B
                        tmp /= B
                    max_len = max ( len , max_len )
                for col in range ( max_len ) :
                    [ was ] = False
                    for i in pos :
                        if M [ i ] [ col ] == - 1 :
                            continue
                        if was [ M [ i ] [ col ] ] :
                            return
                        was [ M [ i ] [ col ] ] = True
                self.cnt += 1
                return
            for A [ pos ] in range ( self.last + 1 , self.left + 1 ) :
                self.A [ pos ] = last + 1
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    self.case_cnt = len ( sc.read ( ) )
                    time = time.time ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        pw.write ( 'Case #%d: ' % case_num )
                        N = sc.read ( )
                        B = sc.read ( )
                        self.B = B
                        self.cnt = 0
                        self.B = B
                        self.go ( N , 0 , 0 )
                        pw.write ( cnt )
                        print ( 'Finished testcase %d, time = %f' % ( case_num ,