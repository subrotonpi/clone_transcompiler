def main ( ) :
    from math import ceil
    from random import randint
    from random import randint
    from random import randint
    from random import choice
    R = randint ( 1 , randint ( 1 , 2 ) )
    C = randint ( 1 , randint ( 1 , 2 ) )
    X = randint ( 1 , randint ( 1 , 2 ) )
    Y = randint ( 1 , randint ( 1 , 2 ) )
    D = randint ( 1 , randint ( 1 , 2 ) )
    L = randint ( 1 , randint ( 1 , 2 ) )
    A = 1000000007
    part = X * Y
    comb = [ [ 1 ] * ( part + 1 ) for i in range ( part + 1 ) ]
    for i in range ( 1 , part + 1 ) :
        for j in range ( 0 , i ) :
            if j == 0 :
                comb [ i ] [ j ] = 1
            else :
                comb [ i ] [ j ] = ( comb [ i - 1 ] [ j - 1 ] + comb [ i - 1 ] [ j ] ) % A
    answer = 0
    if D + L == X * Y :
        answer = ( R - X + 1 ) * ( C - Y + 1 ) * comb [ X * Y ] [ D ] % A
    else :
        for i in range ( 0 , 2 ) :
            for j in range ( 0 , 2 ) :
                if ( X - i ) * ( Y - j ) < D + L :
                    continue
                if ( i + j ) % 2 == 0 :
                    answer += comb [ 2 ] [ i ] * comb [ 2 ] [ j ] * ( R - X + 1 ) * ( C - Y + 1 ) * comb [ ( X - i ) * ( Y - j ) ] [ D ] % A * comb [ ( X - i ) * ( Y - j ) - D ] [ L ] % A
                else :
                    answer -= comb [ 2 ] [ i ] * comb [ 2 ] [ j ] * ( R - X + 1 ) * ( C - Y + 1 ) * comb [ ( X - i ) * ( Y - j ) ] [ D ] % A * comb [ ( X - i ) * ( Y - j ) - D ] [ L ] % A
        answer %= A
        if answer