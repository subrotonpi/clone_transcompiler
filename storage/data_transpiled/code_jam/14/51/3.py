def contest ( ) :
    import os
    import sys
    import random
    import random
    import sys
    import os
    import random
    import sys
    class MagicalTour ( ) :
        PROBLEM_NAME = 'tour'
        WORK_DIR = r'D:\GCJ\\'+PROBLEM_NAME+' \ \'
        A , S = random.sample ( range ( 1 , N + 1 ) , N )
        def solve ( sc , file ) :
            N = sc.randint ( 0 , 1 )
            p , q , r , s = random.randint ( 0 , 1 ) , random.randint ( 0 , 1 ) , random.randint ( 0 , 1 )
            A = [ ( p * i + q ) % r + s for i in range ( N + 1 ) ]
            S = [ 0 ]
            for i in range ( 1 , N + 1 ) :
                S [ i ] = S [ i - 1 ] + A [ i ]
        ans = float ( 'inf' )
        sum_left = 0
        for a in range ( 1 , N + 1 ) :
            L , R = a - 1 , N
            while R - L > 1 :
                mid = ( L + R ) // 2
                sum1 = S [ mid ] - S [ a - 1 ]
                sum2 = S [ N ] - S [ mid ]
                if sum1 < sum2 :
                    L = mid
                else :
                    R = mid
            for b in range ( L - 3 , L + 3 ) :
                if b < a or b > N :
                    continue
                sum_mid = S [ b ] - S [ a - 1 ]
                sum_right = S [ N ] - S [ b ]
                max = max ( sum_left , max ( sum_mid , sum_right ) )
                ans = min ( ans , max )
            sum_left += A [ a ]
        print ( ( S [ N ] - ans ) / float ( S [ N ] ) , file = sys.stderr )
