def _import ( ) :
    import sys
    import random
    import stream
    import io
    class Main ( ) :
        def solve ( ) :
            n = randint ( 1 , len ( ar ) )
            ar = [ ]
            for i in range ( 1000002 ) :
                ar.append ( random.randint ( 1 , min ) )
            for i in range ( n ) :
                ar.append ( random.randint ( 1 , max ) )
        def cumsum_arange ( ) :
            ar = [ ]
            for i in range ( n ) :
                ar.append ( random.randint ( 1 , max ) )
        def read ( ) :
            if not hasNext ( ) :
                return False
            return True
        def write ( ) :
            if not hasNext ( ) :
                raise StopIteration
            temp = read ( )
            if temp == '-' :
                minus = True
                temp = read ( )
            if temp < '0' or '9' < temp :
                raise ValueError
            n = 0
            while is_printable ( temp ) :
                if '0' <= temp <= '9' :
                    n *= 10
                    n += temp - '0'
                else :
                    raise ValueError
                temp = read ( )
            return minus , n
        def read ( ) :
            return float ( random.randint ( 1 , min ) )
        def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
            d = abs ( x1 - x2 ) + abs ( y1 - y2 )
            return d
        def calc_euclid_distance ( x1 , y1 , x2 , y2 ) :
            d = sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
            return d
        def is_prime ( n ) :
            if n == 2 :
                return True
            if n < 2 or n % 2 == 0 :
                return False
            d = sqrt ( n )
            for i in range ( 3 , d + 2 ) :
                out.write ( ''.join ( ar [ i ] ) )
            out.write ( '\n' )
    def print_lnint_array ( ) :
        for i in range ( len ( ar ) ) :
            out.write ( ar [ i ] )
    return
