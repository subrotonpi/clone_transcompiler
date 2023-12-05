def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    n = sc.randint ( 1 , 30 )
    ar = [ i + 1 for i in range ( 6 ) ]
    for i in range ( n ) :
        tmp = ar [ i % 5 ]
        ar [ i % 5 ] = ar [ i % 5 + 1 ]
        ar [ i % 5 + 1 ] = tmp
    for i in range ( 6 ) :
        sys.stdout.write ( ar [ i ] )
    sys.stdout.write ( '\n' )
