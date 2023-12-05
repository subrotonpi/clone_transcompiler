def _ _ _ _ ' )
from os import listdir
import random
import math
class ProblemB ( ) :
    PROBLEM_NAME = 'problem_B'
    WORK_DIR = r'C:\GCJ\\'+PROBLEM_NAME+' \ ''
    def area ( x1 , y1 , x2 , y2 , x3 , y3 ) :
        return ( x2 - x1 ) * ( y1 + y2 ) + ( x3 - x2 ) * ( y2 + y3 ) + ( x1 - x3 ) * ( y1 + y3 )
    def solve ( sc , f ) :
        N = len ( sc )
        T = [ ]
        for i in range ( N ) :
            T.append ( sc [ i ] )
        L , R = 0.0 , 1000000.0
        for it in range ( 100 ) :
            mid = ( L + R ) / 2.0
            y_up = [ ]
            y_down = [ ]
            for i in range ( N ) :
                y_up.append ( T [ i ] + mid )
                y_down.append ( T [ i ] - mid )
            stack_cnt = 0
            stack_x = [ ]
            stack_y = [ ]
            stack_x.append ( 0 )
            stack_y.append ( 1 )
            stack_x.append ( 1 )
            stack_y.append ( 1 )
            for i in range ( 2 , N ) :
                while stack_cnt > 1 and area ( stack_x [ stack_cnt - 2 ] , stack_y [ stack_cnt - 2 ] , stack_x [ stack_cnt - 1 ] , stack_y [ stack_cnt - 1 ] , i , y_up [ i ] ) > 0 :
                    stack_cnt -= 1
                stack_x.append ( i )
                stack_y.append ( 1 )
            for i in range ( 1 , N ) :
                for x in stack_x :
                    stack_x.append ( x + ( x - stack_x [ i ] ) / float ( stack_x [ i ] ) )
        return 0
