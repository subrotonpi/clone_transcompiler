def main ( ) :
    import sys
    import os
    import sys
    import random
    import string
    import sys
    N = int ( sys.stdin.read ( ) )
    L = [ int ( i ) for i in range ( 2 * N ) ]
    sys.stdout.write ( '\n'.join ( L ) )
    sum = 0
    for i in range ( 0 , 2 * N , 2 ) :
        sum += L [ i ]
    print ( sum )
