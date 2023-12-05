def main ( ) :
    import math
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    from math import sqrt
    N = sqrt ( N )
    m = int ( sqrt ( N ) )
    ans = 100
    for i in range ( m , 0 , - 1 ) :
        if N % i == 0 :
            A = i
            B = N / i
            count = 0
            while A > 0 or B > 0 :
                A /= 10
                B /= 10
                count += 1
            ans = min ( ans , count )
            break
    print ( ans )
