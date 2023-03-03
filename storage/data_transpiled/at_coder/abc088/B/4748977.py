def main ( ) :
    import sys
    from itertools import sort
    from random import randint
    from itertools import chain
    sc = sys.stdin
    n = int ( sc.readline ( ) )
    a = [ randint ( 1 , n ) for i in range ( n ) ]
    Sort ( a )
    alice = bob = 0
    for i in range ( n ) :
        if i % 2 == 0 :
            alice += a [ i ]
        else :
            bob += a [ i ]
    print ( alice - bob )
    sc.close ( )
