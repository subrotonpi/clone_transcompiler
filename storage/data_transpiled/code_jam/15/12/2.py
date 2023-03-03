def import _solve
import os
import sys
import random
import sys
import os
import sys
import math
class Haircut ( object ) :
    PROBLEM_NAME = "haircut"
    WORK_DIR = r"D:\GCJ\\"+PROBLEM_NAME+" \ \"
    def solve ( sc , file ) :
        B = random.randint ( 1 , 10000 )
        N = random.randint ( 1 , 10000 )
        T = [ random.randint ( 1 , 10000 ) for _ in range ( B ) ]
        L , R = 0 , 1000000000000000L
        while R - L > 1 :
            mid = ( L + R ) / 2
            serve_before = 0
            for i in range ( B ) :
                serve_before += ( mid - 1 ) / T [ i ] + 1
            if serve_before < N :
                L = mid
            else :
                R = mid
        when = L
        for i in range ( B ) :
            N -= ( when - 1 ) / T [ i ] + 1
        for i in range ( B ) :
            if when % T [ i ] == 0 :
                N -= 1
                if N == 0 :
                    print ( i + 1 )
                    return
    def main ( ) :
        with open ( WORK_DIR + "input.txt" , "r" ) as sc :
            with open ( WORK_DIR + "output.txt" , "w" ) as pw :
                case_cnt = random.randint ( 1 , 10000 )
                for case_num in range ( case_cnt ) :
                    print ( "Processing test case " + str ( case_num + 1 ) , end = '' )
                    pw.write ( "Case #" + str ( case_num + 1 ) + ": " )
                    Haircut ( ).solve ( sc , pw )
                pw.flush ( )
                pw.close ( )
                sc.close ( )
