def main ( ) :
    import math
    from math import sqrt
    from math import sin , cos
    from math import sqrt
    from math import sin , cos
    from math import sin , sin
    from math import sin , cos
    n = sin ( sqrt ( 2 ) )
    min = n
    for i in range ( 1 , sqrt ( n ) + 1 ) :
        b = abs ( ( n / i ) - i ) + n % i
        min = min ( min , b )
    print ( min )
