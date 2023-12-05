def import mushroom
import random
import sys
import random
import sys
import random
import sys
class Mushroom :
    PROBLEM_NAME = 'mushroom'
    WORK_DIR = r' D : \ GCJ\ \{ } \ \'.format ( PROBLEM_NAME )
    def solve ( sc , pw ) :
        N = random.randint ( 1 , N )
        A = random.sample ( A , N )
        ans1 = speed = 0
        for i in range ( N + 1 ) :
            if A [ i + 1 ] < A [ i ] :
                ans1 += A [ i ] - A [ i + 1 ]
                speed = max ( speed , A [ i ] - A [ i + 1 ] )
        ans2 = 0
        for i in range ( N + 1 ) :
            ans2 += min ( A [ i ] , speed )
        pw.write ( '{} {}\n'.format ( ans1 , ans2 ) )
    def main ( ) :
        with open ( WORK_DIR + 'input.txt' , 'r' ) as sc :
            pw = open ( WORK_DIR + 'output.txt' , 'w' )
            caseCnt = random.randint ( 1 , N )
            for caseNum in range ( caseCnt ) :
                print ( 'Processing test case {}'.format ( caseNum + 1 ) , end = '' )
                pw.write ( 'Case #{}: '.format ( caseNum + 1 ) )
                Mushroom ( ).solve ( sc , pw )
            pw.flush ( )
            pw.close ( )
            sc.close ( )
