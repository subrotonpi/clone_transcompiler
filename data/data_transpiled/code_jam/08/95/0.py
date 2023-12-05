def main ( ) :
    import sys
    import os
    import sys
    import random
    import problem
    class ProblemE ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.case_cnt = sc.count ( )
                    for case_num in range ( 1 , case_cnt + 1 ) :
                        f.write ( 'Case #%d: ' % case_num )
                        N , M = sc.count ( ) , sc.count ( )
                        s = [ sc.next ( ) for i in range ( N ) ]
                        cur , next = [ ] , [ ]
                        cur.append ( - 1000000 )
                        cur.append ( 0 )
                        for x in range ( N ) :
                            for y in range ( M ) :
                                can_put = ( s [ x ] [ y ] != '.' )
                                can_not_put = ( s [ x ] [ y ] != '#' )
                                next.append ( - 1000000 )
                                for mask in ( 1 , - 1 , - 1 , - 1 , - 1 , - 1 ) :
                                    clear_mask = mask & ( ( 1 << M ) - 1 - 1 - ( 1 << y ) )
                                    if can_not_put :
                                        next [ clear_mask ] = max ( next [ clear_mask ] , cur [ mask ] )
                                    if can_put :
                                        clear_mask |= ( 1 << y )
                                        add_score = 4
                                        if y > 0 and ( mask & ( 1 << ( y - 1 ) ) ) :
                                            add_score -= 2
                                        if ( mask & ( 1 << y ) ) :
                                            add_score -= 2
                                        next [ clear_mask ] = max ( next [ clear_mask ] , cur [ mask ] + add_score )
                            for mask in ( 1 , - 1 , - 1 , - 1 , - 1 ) :
                                cur.append ( next [ mask ] )
