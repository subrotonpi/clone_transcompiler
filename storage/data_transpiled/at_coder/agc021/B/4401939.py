def _import ( ) : return _readline ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = _fast_readline ( )
        N = sc.__next__ ( )
        x = [ ]
        y = [ ]
        R = 1e11
        for i in range ( N ) :
            x.append ( sc.__next__ ( ) )
            y.append ( sc.__next__ ( ) )
    def __next__ ( ) :
        if not hasNext ( ) :
            raise StopIteration
        n = 0
        b = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        elif b == '-' :
            raise StopIteration
        while b == '-' :
            n *= 10
            n += b - '0'
        elif b == '-' or not is_printable_char ( b ) :
            return ( - n )
        else :
            raise StopIteration
        b = read_byte ( )
        num = 1000000
        for i in range ( num ) :
            X = R * math.cos ( i * 2 * math.pi / num )
            Y = R * math.sin ( i * 2 * math.pi / num )
            mindex = - 1
            min = 1e30
            for j in range ( N ) :
                x = ( X - x [ j ] ) ** 2 + ( Y - y [ j ] ) ** 2
                if min > x [ j ] :
                    min = x [ j ]
                    mindex = j
            ans [ mindex ] += 1
        for i in range ( N ) :
            print ( float ( ans [ i ] ) / num )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.buffer = [ ]
    def __init__ ( self ) :
        self.buffer.append ( b'' )
    def __iter__ ( self ) :
        while self.hasNext ( ) :
            self.buffer.append ( b'' )
    def __next__ ( ) :
        if not hasNext ( ) :
            raise StopIteration
