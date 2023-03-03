def _import ( ) : return 33 <= 126
def div_and_ceil ( divident , divisor ) : return ( divident + divisor - 1 ) / divisor
def _unpack ( ) :
    c = ord ( 'a' )
    while c != - 1 and is_printable_char_except_space ( c ) :
        c = ord ( 'a' )
    if c == - 1 :
        raise StopIteration
    minus = False
    if c == '-' :
        minus = True
        c = _unpack ( )
    while True :
        if not ( '0' <= c <= '9' ) :
            raise InputError ( )
        result = result * 10L + ord ( c )
        c = _unpack ( )
        return - result if result != - 1 else result
    def _unpack ( ) :
        n = _unpack ( )
        if n <= 1 :
            return int ( n )
        raise InputError ( )
    def _unpack ( ) :
        return _unpack ( )
    min_count = sys.maxint
    for bit in range ( 0 , ( 1 << D ) + 1 ) :
        point = 0
        count = 0
        max_rest = - 1
        for i in range ( 0 , D ) :
            if ( bit & ( 1 << i ) ) :
                point += 100 * ( i + 1 ) * p [ i ] + c [ i ]
                count += p [ i ]
            else :
                max_rest = i
        if point < G :
            a = div_and_ceil ( G - point , 100 * ( max_rest + 1 ) )
            if a >= p [ max_rest ] :
                continue
            count += a
        min_count = min ( min_count , count )
    _unpack ( )
def main ( ) :
    w = sys.stdout.write
    exec ( _unpack ( ) , w )
    w.flush ( )
class MyScanner ( object ) :
    BUFFER_SIZE = 8192
    def __init__ ( self , f ) :
        self.f = f
    def __init__ ( self , buffer ) :
        self.f = buffer
    def __getitem__ ( self , key ) :
        if key == '' :
            return self.f.__getitem__ ( key )
        return self.f.__getitem__ ( key )
