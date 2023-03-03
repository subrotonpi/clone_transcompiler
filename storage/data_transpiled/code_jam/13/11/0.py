def contest ( ) :
    import os
    import math
    import random
    import random
    import os
    import sys
    import os
    import math
    import random
    import random
    import string
    class Bullseye :
        PROBLEM_NAME = 'bullseye'
        WORK_DIR = r'D:\Gcj\\{0}\{1}'
        def solve ( sc , f ) :
            r = random.randint ( 0 , 2 )
            t = random.randint ( 0 , 2 )
            left = 0
            right = random.randint ( 0 , 2000000000 )
            while right - left > 1 :
                mid = ( left + right ) // 2
                need = mid * r * ( 2 - mid - 3 )
                need = need + 2 * mid * mid + 1
                if need <= t :
                    left = mid
                else :
                    right = mid
            f.write ( left )
        return f
    sc = open ( WORK_DIR + 'input.txt' , 'r' )
    f = open ( WORK_DIR + 'output.txt' , 'w' )
    case_cnt = random.randint ( 1 , 4 )
    for case_num in range ( case_cnt ) :
        print ( 'Processing test case {}'.format ( case_num + 1 ) , file = sys.stderr )
        f.write ( 'Case #{}: '.format ( case_num + 1 ) )
        Bullseye ( ).solve ( sc , f )
    f.flush ( )
    f.close ( )
    sc.close ( )
