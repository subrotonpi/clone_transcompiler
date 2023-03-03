def main ( ) :
    import sys
    import os
    import math
    import random
    a = random.randint ( 1 , 100 )
    b = random.randint ( 1 , 100 )
    c = random.randint ( 1 , 100 )
    count = 0
    if a == 0 :
        count += 1
        count += b / c
    elif a == 1 :
        count += b / c
    else :
        count += b / c
        count -= ( a - 1 ) / c
    print ( count )
