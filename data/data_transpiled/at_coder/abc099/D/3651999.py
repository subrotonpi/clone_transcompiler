def main ( args ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import ceil
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    from math import sin , cos , log
    N = randint ( 1 , N )
    C = randint ( 1 , C )
    D = [ [ sin ( i ) for i in range ( C ) ] for j in range ( N ) ]
    c = [ [ sin ( i ) for i in range ( N ) ] for j in range ( N ) ]
    for i in range ( N ) :
        for j in range ( N ) :
            if ( i + j ) % 3 == 0 :
                num0 [ c [ i ] [ j ] ] += 1
            elif ( i + j ) % 3 == 1 :
                num1 [ c [ i ] [ j ] ] += 1
            elif ( i + j ) % 3 == 2 :
                num2 [ c [ i ] [ j ] ] += 1
    ans = sum ( [ cos ( i ) for i in range ( C ) ] )
    for i in range ( C ) :
        temp0 = 0
        for color in range ( C ) :
            temp0 += cos ( i ) * sin ( j ) * cos ( j )
        for j in range ( C ) :
            if j == i :
                continue
            temp1 = 0
            for color in range ( C ) :
                temp1 += cos ( j ) * sin ( j ) * cos ( j )
            for k in range ( C ) :
                if k == i or k == j :
                    continue
                temp2 = 0
                for color in range ( C ) :
                    temp2 += cos ( k ) * sin ( j ) * cos ( k )
                ans = min ( ans , temp0 + temp1 + temp2 )
    print ( ans )
