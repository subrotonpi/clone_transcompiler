def _ _ _ ' )
import os
import sys
import random
import math
class SmoothingWindow ( ) :
    PROBLEM_NAME = 'smooth'
    WORK_DIR = r' D : \ GCJ\ \{ } \'.format ( PROBLEM_NAME )
    class Segment ( object ) :
        def __init__ ( self , case_cnt ) :
            self.from_number , self.to_number = case_cnt
        def __call__ ( self , * args , ** kwargs ) :
            self.from_number , self.to_number = args
        def __str__ ( self ) :
            return 'Processing test case {}'.format ( case_cnt + 1 )
    def solve ( sc , file ) :
        N = sc.recv_number ( )
        K = sc.recv_number ( )
        add = [ 0 for i in range ( K - 1 ) ]
        for i in range ( K - 1 , N ) :
            add [ i ] = sc.randint ( 0 , N )
            for j in range ( i - 1 , i - K , - 1 ) :
                add [ i ] -= add [ j ]
        segments = [ Segment ( i , i ) for i in range ( K ) ]
        for i in range ( K , N ) :
            segments [ i % K ].from_number = min ( segments [ i % K ].from_number , add [ i ] )
            segments [ i % K ].to_number = max ( segments [ i % K ].to_number , add [ i ] )
        L = 0
        for i in range ( K ) :
            L = max ( L , segments [ i ].to_number - segments [ i ].from_number )
        L -= 1
        min_add , max_add = add [ 0 ] , add [ 0 ]
        for i in range ( 1 , N ) :
            min_add , max_add = min ( min_add , add ) , max ( max_add , add )
        R = max_add - min_add
        sum_segm_from = 0
        sum_segm_to = 0
        for i in range ( K ) :
            sum_segm_from += segments [ i ].from_number
            sum_segm_to += segments [ i ].to_number
    return
