def main ( ) :
    import math
    from random import randint
    from math import sqrt
    from math import pow
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    n = randint ( 1 , 4 )
    a = [ ]
    b = [ ]
    ans = 0
    for i in range ( n ) :
        x = randint ( 1 , 4 )
        y = randint ( 1 , 4 )
        a.append ( x )
        b.append ( y )
    for i in range ( n ) :
        for j in range ( i , n ) :
            if sqrt ( pow ( abs ( a [ i ] - a [ j ] ) , 2 ) + pow ( abs ( b [ i ] - b [ j ] ) , 2 ) ) > ans :
                ans = sqrt ( pow ( abs ( a [ i ] - a [ j ] ) , 2 ) + pow ( abs ( b [ i ] - b [ j ] ) , 2 ) )
    print ( ans )
