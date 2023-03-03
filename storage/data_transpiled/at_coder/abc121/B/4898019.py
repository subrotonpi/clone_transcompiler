def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    C = randint ( 1 , C )
    Blist = [ sin ( x ) for x in range ( M ) ]
    Alist = [ [ sin ( x ) for x in range ( N ) ] for x in range ( M ) ]
    answer = 0
    for x in range ( N ) :
        sum = 0
        for y in range ( M ) :
            sum += Alist [ x ] [ y ] * Blist [ y ]
        sum += C
        if sum > 0 :
            answer += 1
    print ( answer )
