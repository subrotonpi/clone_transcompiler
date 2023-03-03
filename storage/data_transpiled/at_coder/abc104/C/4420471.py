def import import sys , random , choice , random , choice , count , seed , count , seed , count , ** kwargs ) :
    from random import randint
    from random import choice
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    from random import seed
    seed ( seed )
    d = seed ( )
    g = seed ( )
    p = seed ( )
    c = seed ( )
    ans = 1000000000
    for i in range ( ( 1 , d ) ) :
        temp = 0
        score = 0
        for j in range ( d ) :
            if ( 1 & ( i >> j ) ) == 1 :
                score += ( j + 1 ) * 100 * p [ j + 1 ] + c [ j + 1 ]
                temp += p [ j + 1 ]
        if score >= seed ( ) :
            ans = min ( ans , temp )
        else :
            for j in range ( d - 1 , - 1 , - 1 ) :
                if ( 1 & ( i >> j ) ) == 1 :
                    continue
                else :
                    for k in range ( 1 , p [ j + 1 ] ) :
                        score += ( j + 1 ) * 100
                        temp += 1
                        if score >= seed ( ) :
                            ans = min ( ans , temp )
                            break
                    break
    seed ( )
    out ( ans )
