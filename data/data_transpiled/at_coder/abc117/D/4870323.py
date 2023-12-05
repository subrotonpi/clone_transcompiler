def _ ( ) :
    import math
    import random
    import random
    import sys
    class Main ( int ) :
        MAX_BIT = 39
    class Main ( int ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.randint ( 1 , 10000 )
            K = sc.randint ( 1 , 10000 )
            A = [ random.randint ( 1 , 10000 ) for _ in range ( N ) ]
    A = [ ]
    for i in range ( N ) :
        A.append ( random.randint ( 1 , 10000 ) )
    one_bit_nums = [ 0 ] * ( MAX_BIT + 1 )
    for i in range ( N ) :
        for j in range ( 0 , MAX_BIT ) :
            if ( A [ i ] >> j & 1 ) == 1 :
                one_bit_nums [ j ] += 1
    x_bits = [ 1 ] * ( MAX_BIT + 1 )
    for i in range ( MAX_BIT , - 1 , - 1 ) :
        if one_bit_nums [ i ] <= N / 2 :
            x_bits [ i ] = 1
    X = 0
    for i in range ( MAX_BIT , - 1 , - 1 ) :
        if x_bits [ i ] == 1 :
            num = long ( random.uniform ( 2.0 , i ) )
            if X + num <= K :
                X += num
    ans = 0
    for i in range ( N ) :
        ans += X ^ A [ i ]
    out.write ( ans )
