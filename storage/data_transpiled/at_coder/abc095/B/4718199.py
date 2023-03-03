def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    from math import log
    from math import sin , cos , log
    from math import log
    n = randint ( 1 , 5 )
    x = randint ( 1 , 5 )
    m = [ ]
    sum_g = 0
    min_donut = 1001
    for i in range ( n ) :
        m.append ( sin ( x ) )
        sum_g += m [ i ]
        min_donut = min ( min_donut , m [ i ] )
    sum_donut = n + ( x - sum_g ) / min_donut
    print ( sum_donut )
