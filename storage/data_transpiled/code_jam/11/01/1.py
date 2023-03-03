def _import ( ) :
    import sys
    import os
    import sys
    class Solution ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.case_cnt = sc.count ( )
                    for case_num in range ( self.case_cnt ) :
                        f.write ( 'Case #%d: ' % ( case_num + 1 ) )
                        cur_o , spare_steps_o , cur_b , spare_steps_b = 1 , 0 , 1 , 0
                        N = sc.count ( )
                        res = 0
                        for who in sc.read ( ) :
                            if who == 'O' :
                                pos = sc.tell ( )
                                dist = abs ( cur_o - pos ) + 1
                                dist -= min ( spare_steps_o , dist - 1 )
                                res += dist
                                spare_steps_b += dist
                                spare_steps_o = 0
                                cur_o = pos
                            else :
                                pos = sc.tell ( )
                                dist = abs ( cur_b - pos ) + 1
                                dist -= min ( spare_steps_b , dist - 1 )
                                res += dist
                                spare_steps_o += dist
                                spare_steps_b = 0
                                cur_b = pos
                        f.write ( res )
                f.flush ( )
                f.close ( )
                sc.close ( )
