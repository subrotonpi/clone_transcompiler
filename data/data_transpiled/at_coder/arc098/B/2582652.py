def import import string , symbols
from os import popen
from string import join
import integer
import sys
if sys.version_info [ 0 ] >= 3 :
    f = open ( '/dev/null' , 'r' )
    n = int ( f.readline ( ) )
    input = f.readline ( )
    tmplist = input.split ( )
    x = [ int ( i ) for i in tmplist ]
    result = solve ( x )
    print ( result )
def solve ( x ) :
    n = len ( x )
    result = 0
    tmp_xor = x [ 0 ]
    tmp_sum = x [ 0 ]
    left = right = 0
    count = [ 0 ]
    while left < n :
        if right < n - 1 and int ( tmp_xor ^ x [ right + 1 ] ) == tmp_sum + x [ right + 1 ] :
            tmp_xor ^= x [ right + 1 ]
            tmp_sum += x [ right + 1 ]
            right += 1
        else :
            count.append ( right - left + 1 )
            tmp_sum -= x [ left ]
            tmp_xor = tmp_sum
            if left < n - 1 and left == right :
                right = left + 1
                tmp_xor = x [ left + 1 ]
                tmp_sum = x [ left + 1 ]
            left += 1
    for i in range ( n ) :
        result += count [ i ]
    return result
