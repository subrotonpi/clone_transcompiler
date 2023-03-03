def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) : return next ( iter ( [ int ( i ) for i in range ( 10 ) ] ) )
def _import ( ) :
    fc = _import ( )
    N , A = fc ( )
    K = fc ( )
    B = [ _import ( ) for i in range ( N ) ]
    print ( _import ( ) )
    def solve ( ) :
        cnt = [ 0 ] * N
        curr = A
        cnt [ curr ] += 1
        while 1 :
            next = B [ curr ]
            if cnt [ next ] < 2 :
                cnt [ next ] += 1
                curr = next
            else :
                break
        loop_size = int ( sum ( cnt ) )
        nonloop_size = int ( sum ( cnt ) )
        k = int ( K )
        if k < loop_size :
            return _import ( )
        else :
            mod = k - int ( nonloop_size )
            return _import ( )
            return _import ( )
    def step ( k ) :
        curr = A
        for i in range ( k ) :
            curr = B [ curr ]
        return curr
    @ staticmethod
    def _import ( ) :
        if not isinstance ( next , ( ) ) or not next ( iter ( [ ] ) ) :
            try :
                next ( iter ( [ ] ) )
            except StopIteration :
                raise StopIteration
        return next ( iter ( [ ] ) )
