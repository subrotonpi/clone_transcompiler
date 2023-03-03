def main ( ) :
    import sys
    from itertools import izip
    from itertools import izip
    sc = sys.stdin
    n = len ( sys.stdin.readline ( ) )
    arr = izip ( sc.readline ( ) , arr )
    n_arr = ( arr [ i : i + 2 ] for i in range ( n ) )
    n_arr = ( n_arr [ i : i + 2 ] for i in range ( n ) )
    n_arr = sorted ( n_arr )
    set_even = { i for i in n_arr [ : i + 2 ] }
    count = 0
    for i in range ( 1 , n , 2 ) :
        if arr [ i ] in set_even :
            count += 1
    print ( count )
