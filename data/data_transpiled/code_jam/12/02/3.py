def _import ( ) :
    import os
    import os
    import sys
    class CodeJam2012_Q_B ( object ) :
        def calc ( N , S , p , score ) :
            cnt = 0
            for i in range ( N ) :
                if score [ i ] >= p + max ( p - 1 , 0 ) * 2 :
                    cnt += 1
                elif score [ i ] >= p + max ( p - 2 , 0 ) * 2 and S > 0 :
                    cnt += 1
                    S -= 1
            return cnt
        def main ( ) :
            try :
                ( CodeJam2012_Q_B ( ).exec ( "B-large.in" , "2012_Q_B-large.out" ) )
            except Exception :
                pass
    import os
    in_fd = open ( os.path.join ( os.path.dirname ( __file__ ) , "codeJam2012_Q_B.in" ) , "r" )
    out_fd = open ( os.path.join ( os.path.dirname ( __file__ ) , "codeJam2012_Q_B.out" ) , "w" )
    case_nums = 0
    case_nums = int ( os.stat ( in_fd ).st_size )
    for i in range ( case_nums ) :
        input = in_fd.readline ( ).split ( )
        N , S , p , score = map ( int , input [ 0 : 3 ] )
        out_str = calc ( N , S , p , score )
        fmt_out_str = "Case #%d: %s" % ( i + 1 , out_str )
        out_fd.write ( fmt_out_str )
        print ( fmt_out_str )
    print ( "%d cases complete" % case_nums )
    out_fd.close ( )
    in_fd.close ( )
