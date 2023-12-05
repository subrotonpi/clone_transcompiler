def import _solve
import os
import sys
import math
import re
import numpy
import numpy
import numpy
import numpy
import numpy
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import numpy.random
import unicodedata
import C
mod = 100003
def solve ( ) :
    n = sc.randint ( 0 , 10000 )
    dp = [ [ 1 , 0 ] ] * ( n + 1 )
    dp [ 1 , 0 ] = 1
    for last in range ( 1 , n + 1 ) :
        for pos in range ( 0 , n + 1 ) :
            if dp [ last , pos ] == 0 : continue
            for next in range ( last + 1 , n + 1 ) :
                dp [ next , last ] = ( dp [ next , last ] + ( n_ck_p [ next - last - 1 ] [ last - pos - 1 ] * dp [ last , pos ] ) ) % mod
    res = 0
    for i in range ( 0 , n ) :
        res = ( res + dp [ n , i ] ) % mod
    return res
