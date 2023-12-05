def contest ( ) :
    import os
    import sys
    import math
    class Cheaters :
        PROBLEM_NAME = "cheat"
        WORK_DIR = r"D:\Gcj\\"+PROBLEM_NAME+" \ "
        def __init__ ( self , case_cnt ) :
            sc = open ( "input.txt" , "r" )
            f = open ( "output.txt" , "w" )
            for case_num in range ( self.case_cnt ) :
                print ( "Processing test case " + str ( case_num + 1 ) )
                print ( "Case #" + str ( case_num + 1 ) + ": " , end = "" )
                Cheaters ( ).solve ( sc , f )
            f.flush ( )
            sc.close ( )
    def profit ( min ) :
        spent = 0
        cnt = 0
        for i in range ( self.case_cnt ) :
            if i <= min :
                spent += min - i
                cnt += 1
        return 36 * spent / float ( cnt ) - spent
    def solve ( sc , f ) :
        B = sc.__next__ ( )
        N = sc.__next__ ( )
        X = [ sc.__next__ ( ) for i in range ( 37 ) ]
        X.sort ( )
        ans = 0.0
        for win in range ( 1 , 35 ) :
            min = X [ win - 1 ]
            need = 0
            for i in range ( win ) :
                need += min - i
            for i in range ( win , 37 ) :
                if min + 1 > i :
                    need += min + 1 - i
            if need > B :
                continue
            L , R = min , 1000000000000000L
            while R - L > 1 :
                mid = ( L + R ) // 2
                need = 0
                for i in range ( win ) :
                    need += mid - i
                for i in range ( win , 37 ) :
                    if mid + 1 > i :
                        need += mid + 1 - i
                if need <= B :
                    L = mid
                else :
                    R = mid
            lose_money = 0
            win_money = 0
            for i in range ( win ) :