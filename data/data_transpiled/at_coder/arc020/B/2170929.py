def main ( ) :
    import sys
    from random import randint
    from random import randint
    from random import randint
    from random import randint
    from random import choice
    from random import randint
    from random import choice
    from random import random
    from random import randint
    from random import choice
    from random import random
    n = randint ( 1 , randint ( 1 , 10 ) )
    c = randint ( 1 , randint ( 1 , 10 ) )
    for i in range ( 2 , n ) :
        if choice ( [ randint ( 0 , 1 ) , randint ( 1 , 10 ) ] ) :
            temp = choice ( [ randint ( 0 , 1 ) , randint ( 1 , 10 ) ] )
            temp [ 0 ] = temp [ 1 ] = temp [ 0 ]
            temp [ 1 ] = temp [ 1 ] = temp [ 1 ]
        elif choice ( [ randint ( 0 , 1 ) , randint ( 1 , 10 ) ] ) :
            temp [ 0 ] = temp [ 0 ]
            temp [ 1 ] = temp [ 1 ]
        else :
            temp [ 0 ] = temp [ 0 ]
            temp [ 1 ] = temp [ 1 ]
    for i in range ( n ) :
        a = randint ( 1 , 10 ) - 1
        variation [ i % 2 ] [ a ] += 1
    max0 = max ( variation [ 0 ] , 10 )
    max1 = max ( variation [ 1 ] , 10 )
    if max0 [ 1 ] == max1 [ 1 ] :
        max20 = max2 ( variation [ 0 ] , 10 )
        max21 = max2 ( variation [ 1 ] , 10 )
        if ( n + 1 ) / 2 - max20 [ 0 ] + n / 2 - max1 [ 0 ] < ( n + 1 ) / 2 - max0 [ 0 ] + n / 2 - max21 [ 0 ] :
            print ( ( ( n + 1 ) / 2 - max20 [ 0 ] + n / 2 - max1 [ 0 ] ) * c )
        else :
            print ( ( ( n + 1 ) / 2 - max0 [ 0 ] + n / 2 - max1 [ 0 ] ) * c )
    return
