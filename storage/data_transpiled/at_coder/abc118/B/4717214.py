def main ( ) :
    import sys
    from collections import defaultdict
    from random import randint
    from random import randint
    from collections import defaultdict
    from random import randint
    from collections import defaultdict
    n = randint ( 1 , 5 )
    m = randint ( 1 , 5 )
    d = defaultdict ( int )
    for i in range ( n ) :
        k = randint ( 1 , 5 )
        for a in range ( k ) :
            b = 0
            if d.has_key ( a ) :
                b = d [ a ]
            d [ a ] = b + 1
    ans = 0
    for i in d.values ( ) :
        if i == n :
            ans += 1
    print ( ans )
