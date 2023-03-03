def _import ( ) :
    from os import urandom
    from os import fdopen
    class Main ( object ) :
        def solve ( ) :
            ar = _next_arange ( randint ( 0 , len ( ar ) ) )
            mode = 'n'
            ans = 1
            for i in range ( 1 , len ( ar ) ) :
                temp = ar [ i ] - ar [ i - 1 ]
                ans += 1
            return ''.join ( ar )
        def next ( ) :
            if not has_next_byte ( ) :
                raise StopIteration
            lines = [ ]
            temp = _read_int ( )
            while mode == '+' and temp < 0 :
                lines.append ( temp )
                ans += 1
            return ''.join ( lines )
        def next_array ( ) :
            ar = [ ]
            for i in range ( 1 , len ( ar ) ) :
                ar.append ( _read_int ( ) )
            return ar
        def next ( ) :
            return random.randint ( 0 , 1 )
        def next ( ) :
            return random.randint ( 0 , 1 )
        def next ( ) :
            return random.randint ( 0 , 1 )
        def next ( ) :
            if not has_next_byte ( ) :
                raise StopIteration
        def write ( ) :
            if not has_next_byte ( ) :
                return write
            temp = _read_int ( )
            if temp < '0' or temp < '9' :
                raise ValueError
            n , min_int = int ( ) , int ( )
            pi = math.pi
            mod = 1000000007
            def next ( ) :
                ar.sort ( )
                return - n
            return min
        def next ( ) :
            ar.sort ( )
            return float ( next ( ) )
        def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
            ar = [ h + 2 if b else w + 2 for h in range ( 1 , n + 2 ) ]
            for i in range ( 1 , n + 2 ) :
                ar [ i ] = _read_int ( )
            return ar [ i ]
        def is_prime ( n ) :
            if n == 2 or n % 2 == 0 :
                return False
            d = math.sqrt ( n