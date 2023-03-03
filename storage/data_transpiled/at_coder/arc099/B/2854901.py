def _import ( ) :
    from math import log
    from math import factorial
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    K = log ( 'K' )
    n = 1
    s = 1.d
    for i in range ( 1 , K + 1 ) :
        x = n
        z = 0
        y = 1
        while x > 0 :
            x /= 10
            z = z * 10 + 9
            y *= 10
            t = x * y + z
            ts = sunuke ( t )
            if ts < s :
                n = t
                s = ts
        print ( n )
        n += 1
        s = sunuke ( n )
    def sunuke ( n ) :
        return float ( n ) / sum_digits ( n )
    def sumdigits ( i ) :
        sum = 0
        while i > 0 :
            sum += i % 10
            i /= 10
        return sum
    def numdigits ( i ) :
        d = 0
        while i > 0 :
            d += i % 10
            i /= 10
        return d
    return sumdigits , sumdigits
