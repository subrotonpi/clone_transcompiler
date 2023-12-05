def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    C = randint ( 1 , C )
    b_list = solve ( N , M )
    a_list = [ [ randint ( 1 , N ) for i in range ( M ) ] for j in range ( N ) ]
    ans = 0
    for i in range ( N ) :
        result = 0
        for j in range ( M ) :
            result += a_list [ i ] [ j ] * b_list [ j ]
        ans += 1 if result + C > 0 else 0
    print ( ans )
