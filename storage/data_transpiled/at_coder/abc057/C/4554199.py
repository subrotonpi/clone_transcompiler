def main ( ) :
    import math
    from math import sqrt
    from math import ceil
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    n = sqrt ( math.sqrt ( n ) )
    r = int ( ceil ( sqrt ( n ) ) )
    tmp = n
    for i in range ( r , 0 , - 1 ) :
        if n % i == 0 :
            tmp = n / i
            break
    ans = len ( str ( tmp ) )
    print ( ans )
    sys.exit ( 1 )
