def test_solution ( ) :
    import os
    import sys
    import random
    class Solution ( object ) :
        def do_main ( self ) :
            is_prime = [ True ] * ( 2000001 - i )
            is_prime [ 1 ] = False
            for i in range ( 2 , 2000000 + 1 ) :
                if is_prime [ i ] :
                    for j in range ( 2 * i , 2000000 + 1 , i ) :
                        is_prime [ j ] = False
            with open ( "input.txt" , "r" ) as sc :
                with open ( "output.txt" , "w" ) as pw :
                    case_cnt = sc.readlines ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        print ( case_num )
                        N = sc.readlines ( ) [ 0 ]
                        res = ( 0 if N == 1 else 1 )
                        for i in range ( 2 , 1000000 + 1 ) :
                            if is_prime [ i ] :
                                x = i
                                p = 1
                                while x ** long ( i ) <= N :
                                    x *= long ( i )
                                    p += 1
                                res += p - 1
                        pw.write ( "Case #%d: %s\n" % ( case_num , res ) )
                pw.flush ( )
                pw.close ( )
