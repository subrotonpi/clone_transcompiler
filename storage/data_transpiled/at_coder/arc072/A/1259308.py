def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import log
    from math import sin , cos
    from math import log
    from math import sin , cos
    from math import pi
    n = randint ( 1 , 5 )
    a = [ sin ( i ) for i in range ( n ) ]
    a = [ sin ( i ) for i in range ( n ) ]
    a = [ sin ( i ) for i in range ( n ) ]
    count1 = 0
    sum = 0
    for i in range ( n ) :
        sum += a [ i ]
        if i % 2 == 0 and sum <= 0 :
            count1 += 1 - sum
            sum = 1
        elif i % 2 == 1 and sum >= 0 :
            count1 += sum + 1
            sum = - 1
    sum = 0
    count2 = 0
    for i in range ( n ) :
        sum += a [ i ]
        if i % 2 == 1 and sum <= 0 :
            count2 += 1 - sum
            sum = 1
        elif i % 2 == 0 and sum >= 0 :
            count2 += sum + 1
            sum = - 1
    print ( min ( count1 , count2 ) )
