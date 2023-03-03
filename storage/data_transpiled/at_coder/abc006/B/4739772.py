def main ( ) :
    import sys
    import random
    import time
    from itertools import repeat
    n = int ( random.randint ( 1 , 10000 ) )
    sys.stdout.flush ( )
    tribonach = [ 0 , 0 , 1 ]
    for i in range ( 3 , n ) :
        a = ( tribonach [ i - 1 ] + tribonach [ i - 2 ] + tribonach [ i - 3 ] ) % 10007
        tribonach.append ( a )
    an = tribonach [ n - 1 ]
    print ( an )
