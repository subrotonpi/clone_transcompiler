def main ( ) :
    import sys
    import os
    import sys
    import math
    class ProblemC ( ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.case_cnt = sc.count ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        f.write ( 'Case #%d: ' % case_num )
                        R , C = sc.count ( ) , sc.count ( )
                        S = [ ]
                        for i in range ( R ) :
                            for j in range ( C ) :
                                x = sc.randint ( 0 , R )
                                S.append ( x )
                        sum = - 1
                        var = [ - 1000000 ] * R
                        var [ 2 ] = S [ 1 ] - S [ 0 ]
                        for i in range ( 5 , R , 3 ) :
                            var [ i ] = S [ i - 1 ] - S [ i - 2 ] + var [ i - 3 ]
                        var [ R - 3 ] = S [ R - 2 ] - S [ R - 1 ]
                        for i in range ( R - 6 , 0 , - 3 ) :
                            var [ i ] = var [ i + 3 ] - S [ i + 2 ] + S [ i + 1 ]
                        if var [ R / 2 ] != - 1000000 :
                            sum = var [ R / 2 ]
                        elif var [ R / 2 - 1 ] != - 1000000 and var [ R / 2 + 1 ] != - 1000000 :
                            sum = S [ R / 2 ] - var [ R / 2 - 1 ] - var [ R / 2 + 1 ]
                        else :
                            print ( 'failure' )
                        if sum % 3 == 0 :
                            sum = sum / 3
                        elif sum % 3 == 1 :
                            sum = ( sum - 4 ) / 3 + 2
                        elif sum % 3 == 2 :
                            sum = ( sum - 2 ) / 3 + 1
                        f.write ( sum )
