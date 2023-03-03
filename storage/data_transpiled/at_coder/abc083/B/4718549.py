def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    N = randint ( 1 , 10000 )
    A = log ( 'A' )
    B = log ( 'B' )
    sum = 0
    for i in range ( 1 , N + 1 ) :
        ii = i
        iii = 0
        sum2 = 0
        for j in range ( 5 ) :
            iii = ii % 10
            sum2 += iii
            ii = ii // 10
        if sum2 >= A and sum2 <= B :
            sum += i
    print ( sum )
