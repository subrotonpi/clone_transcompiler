def contest ( ) :
    import os
    import sys
    import random
    import random
    import sys
    class ManyPrizes ( object ) :
        PROBLEM_NAME = "mprizes"
        WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ \"
        def solve ( sc , f ) :
            N = random.randint ( 1 , 10000 )
            P = random.randint ( 1 , 10000 )
            ans1 = - 1
            sum = 0
            for i in range ( N - 1 , - 1 , - 1 ) :
                sum += ( 1 << i )
                if P <= sum :
                    ans1 = ( 1 << ( N - i ) ) - 1
                    break
            if ans1 == - 1 :
                ans1 = ( 1 << N )
            ans2 = - 1
            need_wins = 0
            while ( 1 << ( N - need_wins ) ) > P :
                need_wins += 1
            ans2 = ( 1 << N ) - ( 1 << need_wins ) + 1
            ans1 -= 1
            ans2 -= 1
            f.write ( "%d %d\n" % ( ans1 , ans2 ) )
    def main ( ) :
        with open ( WORK_DIR + "input.txt" , "r" ) as sc :
            with open ( WORK_DIR + "output.txt" , "w" ) as f :
                case_cnt = random.randint ( 1 , 10000 )
                for case_num in range ( case_cnt ) :
                    print ( "Processing test case %d" % ( case_num + 1 ) , end = "" )
                    f.write ( "Case #%d: " % ( case_num + 1 ) )
                    ManyPrizes ( ).solve ( sc , f )
                f.flush ( )
                f.close ( )
    main ( )
