def main ( ) :
    import sys
    from itertools import count
    from itertools import repeat
    A = repeat ( 'A' )
    B = repeat ( 'B' )
    K = repeat ( 'K' )
    k = K - 1
    if 1 <= A <= B <= 10 ** 2 :
        for _ in range ( K ) :
            if 1 <= A <= B :
                print ( A )
                A += 1
        for i in range ( B - k , B + 1 ) :
            if 1 <= A <= i :
                print ( i )
