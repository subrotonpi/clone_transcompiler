def import import sys
import os
import subprocess
import time
import math
import sys
import math
import sys
ICE_TEA_COUNT = 4
SHORT_TEA = 0.25
def main ( ) :
    f = open ( sys.argv [ 1 ] )
    input = f.readline ( ).split ( )
    input2 = f.readline ( )
    ice_tea_list = [ int ( i ) for i in input ]
    max = int ( input2 )
    result_tea = [ ]
    multiple = 2
    before_result = 1
    continue_flag = 0
    point = 0
    result_tea.append ( long ( max / SHORT_TEA ) )
    for i in range ( ICE_TEA_COUNT - 1 ) :
        if before_result == 0 :
            continue_flag = 1
        elif ice_tea_list [ i + point ] * multiple > ice_tea_list [ i + 1 ] :
            result_tea [ i + 1 ] = result_tea [ i + point ] / multiple
            result_tea [ i + point ] = result_tea [ i + point ] % multiple
            continue_flag = 0
            point = 0
            multiple = 2
        if continue_flag :
            point -= 1
            multiple *= 2
            if i + point >= 0 :
                before_result = long ( result_tea [ i + point ] )
                i -= 1
            else :
                before_result = 1
        else :
            before_result = result_tea [ i + 1 ]
    result_value = 0
    for i in range ( ICE_TEA_COUNT ) :
        result_value += result_tea [ i ] * ice_tea_list [ i ]
    print ( result_value )
