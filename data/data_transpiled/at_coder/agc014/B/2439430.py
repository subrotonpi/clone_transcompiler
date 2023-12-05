def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    n = islice ( sys.stdin.readline ( ) , 0 , None )
    m = islice ( sys.stdin.readline ( ) , 0 , None )
    odd = islice ( sys.stdin.readline ( ) , 0 , None )
    for i in range ( 2 ** m ) :
        x = islice ( sys.stdin.readline ( ) , 0 , None )
        odd [ x - 1 ] = not x
    ng = islice ( sys.stdin.readline ( ) , 0 , None )
    for i in range ( n ) :
        ng |= islice ( sys.stdin.readline ( ) , 0 , None )
    print ( 'NO' if ng else 'YES' )
