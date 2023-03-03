def main ( ) :
    import math
    from math import pow
    from math import floor
    from math import ceil
    from math import pow
    from math import pow
    from math import pow
    from math import pow
    from math import ceil
    n = int ( math.floor ( math.log ( n , 2 ) ) )
    m = int ( math.floor ( math.log ( m , 2 ) ) )
    x = 0
    y = 0
    if n - m > 0 :
        y = ( n - m ) * 100
    k = pow ( 2 , m )
    p , q = 1 - 1 / k , 1 - 1 / k
    for i in range ( 1 , 3500000 ) :
        q = pow ( p , i - 1 )
        x += ( y + 1900 * m ) * i * q / float ( k )
    print ( round ( x , 2 ) )
