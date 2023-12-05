def _import ( ) : return _RePS ( n )
def _strs ( n ) : return _RePS ( n )
def _g_int ( ) : return _RePS ( n )
def _g_long ( ) : return _RePS ( n )
def _g_double ( ) : return _RePS ( n )
def main ( ) :
    n , a = _g_int ( ) , _ints ( n ) [ : ]
    def _g ( ) :
        b = [ i for i in a if not _g ( i ) ]
        [ i ] = [ i for i in b if not _g ( i ) ]
    print ( _REPS ( n ).map ( lambda i : abs ( a [ i ] - i ) % 2 ).sum ( ) / 2 )
def _main ( ) :
    def _solve ( ) :
        return _solve ( )
    s = _sys.stdin
    def _g_int ( ) : return s.__next__ ( )
    def _g_long ( ) : return s.__next__ ( )
    def _g_double ( ) : return s.__next__ ( )
    def rep ( i ) : return _range ( i )
    def _rep ( f , t , d ) : return _rep ( f , t , d )
    def _r_rep ( f , t ) : return _rep ( f , t , - 1 )
    class Range ( Iterable ) :
        def __init__ ( self , _collections = _collections ) :
            self._cur , self._cur , self._d = self._cur - d , self._cur , self._d
        def __iter__ ( self ) :
            return self
        def next ( self ) :
            return self._cur + self._d == to or ( self._cur != to and ( self._cur == self._cur + self._d < to ) )
        def _r_rep ( self , v ) :
            return self._r_rep ( v )
    return Range ( _g_long , _g_double )
