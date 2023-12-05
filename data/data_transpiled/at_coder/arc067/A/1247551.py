def main ( ) :
    import math
    from random import randint
    from math import pow
    from random import randint
    from random import choice
    a = randint ( 1 , a + 1 )
    an = [ 0 ] * a + [ 0 ] * a
    ans = 1
    c = 0
    d = int ( randint ( 10 , 9 ) ) + 7
    for i in range ( a + 1 ) :
        an [ i ] = 1
    for i in range ( 2 , a + 1 ) :
        c = i
        while c % 2 == 0 :
            c //= 2
            an [ 2 ] += 1
        for n in range ( 3 , n ** 2 , c + 2 ) :
            while c % n == 0 :
                c //= n
                an [ n ] += 1
        if c > 1 :
            an [ c ] += 1
    for i in an :
        ans = long ( ans * i ) % d
    print ( ans )
