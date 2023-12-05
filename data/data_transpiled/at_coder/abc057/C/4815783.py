def main ( ) :
    import math
    from math import sqrt
    from math import ceil
    from math import sqrt
    from math import sqrt
    n = sqrt ( n )
    sc = Scanner ( )
    s = int ( math.ceil ( sqrt ( n ) ) )
    for i in range ( s , 0 , - 1 ) :
        if n % i == 0 :
            l = n / i
            print ( len ( str ( l ) ) )
            return
