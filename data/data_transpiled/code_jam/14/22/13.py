def _import ( ) : return _import ( )
def _import ( x , y , M ) :
    if k < l :
        k = l
        t = x
        y = t
    left_mask = 1
    for i in range ( k , 30 ) :
        left_mask ^= ( 1 << i )
    y_fixed = y & left_mask
    if ( x_fixed & y_fixed ) :
        return 1 << ( i - l )
    else :
        num_same *= 3
    class _tokenizer ( object ) :
        def __init__ ( self , f ) :
            self.f = open ( f , "r" )
            self.default_config ( )
        def __next__ ( self ) :
            try :
                self.f = next ( self.f )
            except StopIteration :
                raise "StopIteration: exception in line %d" % self.lineno ( )
            return self.sval
        def __next__ ( self ) :
            return self.f
        def __next__ ( self ) :
            return self.f
        def __next__ ( self ) :
            return self.f
        def default_config ( self ) :
            self.reset_syntax ( )
            self.word_chars ( 33 , 126 )
            self.whitespace_chars ( 0 , ' ' )
    return _tokenizer ( )
def _import ( ) :
    return _tokenizer ( )
class _TaskB ( ) :
    def solve ( self , test_number = 1 , f = _import ( ) , f = _import ( ) ) :
        A , B , K = f ( )
        res = _solve ( A , B , K )
        f ( "Case #%d: %d" % ( test_number , res ) )
    def solve ( self , A , B , K ) :
        res = 0
        x = 0
        for k in range ( 30 , 31 ) :
            if k < 0 or ( A & ( 1 << k ) ) :
                y = x
                x = y
    return _TaskB ( )
