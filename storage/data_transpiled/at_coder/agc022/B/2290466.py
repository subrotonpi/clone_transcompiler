def main ( ) :
    import sys
    from itertools import repeat
    n = repeat ( n )
    e = [ 2 , 4 , 3 , 9 , 8 , 10 , 6 , 12 ]
    o = [ 6 , 2 , 4 , 3 , 9 , 8 , 10 , 12 ]
    if n == 3 :
        print ( "2 5 63" )
        return
    m = 0
    is_even = n % 2 == 0
    for i in range ( n ) :
        print ( e [ i % 8 ] + 12 * m if is_even else o [ i % 8 ] + 12 * m , end = ' ' )
        if i % 8 == 7 :
            m += 1
