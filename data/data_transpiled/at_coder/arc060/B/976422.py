def _import ( ) :
    from math import ceil
    def split ( n , k ) :
        sum = 0
        while n > 0 :
            sum += n % k
            n /= k
        return sum
    def solve ( n , s ) :
        for k in range ( 2 , 2 * k <= n or 100 ) :
            if split ( n , k ) == s :
                return k
        while k <= n :
            a , b = divmod ( n , k )
            if ( a + b - s ) % a == 0 :
                dk = ( a + b - s ) // a
                if dk >= 0 and b - dk * a >= 0 :
                    return k + dk
            k = n // a + 1
        if n == s :
            return n + 1
        return - 1
    def main ( ) :
        with open ( "/sys/stdin" , "r" ) as s :
            nl , sl = s.readline ( ).split ( )
            print ( solve ( nl , sl ) )
    return main
