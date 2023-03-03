def main ( ) :
    import sys
    import os
    import sys
    import random
    import string
    import sys
    import os
    import sys
    class Solution ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    T = sc.randint ( 1 , 100 )
                    for case_num in range ( 1 , T + 1 ) :
                        print ( 'case ' , case_num )
                        L , t , N , C = [ int ( i ) for i in range ( L ) ]
                        a = [ int ( i ) for i in sc.randint ( L ) ]
                        for i in range ( C , N ) :
                            a [ i ] = a [ i - C ]
                        res = 0
                        for i in range ( N ) :
                            res += 4 * a [ i ]
                        pos = 0
                        while pos < N and 2 * a [ pos ] <= t :
                            t -= 2 * a [ pos ]
                            pos += 1
                        if pos < N :
                            ll = [ 2 * a [ pos ] - t ]
                            for i in range ( pos + 1 , N ) :
                                ll.append ( 2 * a [ i ] )
                            ll.sort ( )
                            for i in range ( len ( ll ) - 1 , - L , - 1 ) :
                                res -= ll [ i ]
                        if res % 2 == 1 :
                            print ( 'failure' )
                            sys.exit ( 0 )
                        else :
                            pw.write ( 'Case #' + str ( case_num ) + ': ' + str ( res / 2 ) + '\n' )
