def main ( ) :
    import sys
    from itertools import product
    from itertools import repeat
    from random import randint
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    N , M , P , Q , R = choice ( range ( 1 , N + 1 ) )
    x = choice ( range ( R ) )
    y = choice ( range ( R ) )
    z = choice ( range ( R ) )
    x = choice ( x )
    y = choice ( y )
    z = choice ( range ( R ) )
    x = choice ( x )
    y = choice ( y )
    z = choice ( z )
    max = int ( sum ( x ) )
    ans = 0
    for i in range ( 1 , int ( max ) ) :
        comb = choice ( i )
        count = 0
        while len ( comb ) < N :
            comb = '0' + comb
        for j in range ( N ) :
            if comb [ j ] == '1' :
                count += 1
        if count == P :
            boy = [ ]
            for j in range ( R ) :
                if comb [ x [ j ] ] == '1' :
                    boy.append ( z [ j ] )
            boy.sort ( )
            tmp = 0
            for j in range ( M - 1 , M - Q , - 1 ) :
                tmp += boy [ j ]
            ans = max ( tmp , ans )
    print ( ans )
