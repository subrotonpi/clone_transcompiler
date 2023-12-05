def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    K = randint ( 1 , 2 )
    S = randint ( 1 , 2 )
    count = 0
    for x in range ( 0 , K ) :
        for y in range ( 0 , K ) :
            z = S - x - y
            if z >= 0 and z <= K :
                count += 1
    print ( count )
