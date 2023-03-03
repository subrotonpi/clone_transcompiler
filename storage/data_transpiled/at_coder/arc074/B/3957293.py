def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from itertools import islice
    from itertools import islice
    n = islice ( sys.stdin.read ( ) , 0 , 0 , 0 )
    a = [ islice ( sys.stdin.read ( ) , 0 , n * 3 ) for i in range ( 3 * n ) ]
    first_half = islice ( a , 0 , n )
    second_half = islice ( islice ( a , 0 , n ) , 0 , n )
    left_sum = [ 0 ] * ( n + 1 )
    right_sum = [ 0 ] * ( n + 1 )
    for i in islice ( first_half , 0 , n ) :
        first_half.append ( a [ i ] )
        left_sum [ 0 ] += a [ i ]
    for i in range ( n , 2 * n ) :
        first_half.append ( a [ i ] )
        head = first_half.pop ( )
        left_sum [ i - n + 1 ] = left_sum [ i - n ] + a [ i ] - head
    for i in islice ( 3 * n - 1 , 2 * n - 1 , - 1 ) :
        second_half.append ( a [ i ] )
        right_sum [ n ] += a [ i ]
    for i in islice ( 2 * n - 1 , n - 1 , - 1 ) :
        second_half.append ( a [ i ] )
        head = second_half.pop ( )
        right_sum [ i - n ] = right_sum [ i - n + 1 ] + a [ i ] - head
    result = islice ( left_sum , n )
    for i in range ( 0 , n ) :
        result = max ( result , left_sum [ i ] - right_sum [ i ] )
    print ( result )
