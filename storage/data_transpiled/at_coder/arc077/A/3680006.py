def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    n = sc.__next__ ( )
    num = repeat ( n )
    for i in range ( n ) :
        num [ i ] = sc.__next__ ( )
    for i in range ( n - 1 , - 1 , - 2 ) :
        sys.stdout.write ( "%d " % num [ i ] )
    for i in range ( n % 2 , n , 2 ) :
        sys.stdout.write ( "%d " % num [ i ] )
