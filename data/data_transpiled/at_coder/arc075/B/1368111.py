def main ( ) :
    import math
    from random import randint
    from math import pow
    from random import randint
    from math import log
    from random import uniform
    from math import log
    from random import uniform
    from math import log
    from math import log
    from random import uniform
    n = randint ( 1 , 5 )
    a = uniform ( 0 , 1 )
    b = uniform ( 0 , 1 )
    health = [ log ( uniform ( 0 , 1 ) ) for _ in range ( n ) ]
    min = 1
    max = int ( uniform ( 0 , 9 ) )
    ans = 0
    while min < max :
        med = ( min + max ) / 2
        count = 0
        for i in range ( n ) :
            k = ( health [ i ] - med * b + a - b - 1 ) / ( a - b )
            k = max ( 0 , k )
            count += k
        if count <= med :
            ans = med
            max = med
        else :
            min = med + 1
    print ( ans )
