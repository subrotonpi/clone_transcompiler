def import import math
from os.path import join
from os import getenv
from os.path import join
from os.path import expanduser
from os.path import join
from os.path import join
from os.path import join
from os.path import join
from os.path import join
from os import sep
from os.path import join
q = int ( join ( sys.argv [ 1 : ] ) )
for i in range ( q ) :
    tmplist = join ( sys.argv [ 1 : ] , '..' ).split ( )
    a = int ( tmplist [ 0 ] )
    b = int ( tmplist [ 1 ] )
    if a > b :
        tmp = a
        a = b
        b = tmp
    result = 0
    if a == b :
        result = 2 ** a - 2
    elif a + 1 == b :
        result = 2 ** a - 2
    else :
        c = long ( sqrt ( long ( a ) * b ) )
        if c ** 2 == long ( a ) * b :
            c -= 1
        if c * ( c + 1 ) >= long ( a ) * b :
            result = 2 ** c - 2
        else :
            result = 2 ** c - 1
    print ( result )
