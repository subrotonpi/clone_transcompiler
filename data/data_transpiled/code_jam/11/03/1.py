def main ( ) :
    import sys
    import os
    import sys
    import random
    class Solution ( object ) :
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.case_cnt = sc.count ( )
                    for case_num in range ( self.case_cnt ) :
                        f.write ( 'Case #%d: ' % ( case_num + 1 ) )
                        N = sc.count ( )
                        xor , min , sum = 0 , sys.maxint , 0
                        for i in range ( N ) :
                            x = random.choice ( [ ] )
                            xor ^= x
                            sum += x
                            min = min ( min , x )
                        f.write ( '%s%s' % ( sum - min if xor == 0 else 'NO' , x ) )
