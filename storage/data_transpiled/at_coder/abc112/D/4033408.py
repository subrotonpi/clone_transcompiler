def main ( ) :
    import math
    from random import randint
    from random import randint
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    N = randint ( 1 , N )
    M = sqrt ( N )
    _ , _ , _ , _ , _ , _ , _ = range ( 2 , m + 1 )
    prm = [ True for i in range ( 2 , m + 1 ) ]
    for i in range ( 2 , m + 1 ) :
        if prm [ i ] :
            for j in range ( 2 * i , m + 1 , i ) :
                prm [ j ] = False
    L1 = [ ]
    L2 = [ ]
    id = 0
    M2 = M
    for i in range ( 2 , m + 1 ) :
        if prm [ i ] and M2 % i == 0 :
            L1.append ( i )
            while M2 % i == 0 :
                L2.append ( i )
                M2 /= i
            id += 1
        if i == m and M2 > 1 :
            L1.append ( M2 )
            L2.append ( i )
            id += 1
    p = solve ( 1 , L1 , L2 , 0 , N , id )
    print ( M / p )
    def solve ( a , l1 , l2 , ind , n , l ) :
        if ind == l :
            if a >= n :
                return a
            else :
                return 1000000007
        else :
            min = 1000000007
            for i in range ( 0 , l2 [ ind ] + 1 ) :
                min = min ( solve ( a * int ( pow ( l1 [ ind ] , i ) ) , l1 , l2 , ind + 1 , n , l ) , min )
            return min
    return solve
