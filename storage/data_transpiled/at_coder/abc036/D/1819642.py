def _import ( ) : return not ( b >= 33 and b <= 126 )
def _import ( ) : return float ( )
def _import ( ) : return _import ( )
def _INPUT ( ) : return ''
def _MOD ( ) : return _1_000_000_007
def _solve ( ) :
    n = _ni ( )
    node = [ ]
    seen = [ ]
    for i in range ( 0 , n + 1 ) :
        b = _byte ( )
    def _nl ( ) :
        n = _nl ( )
        node = [ ]
        seen = [ ]
        for i in range ( 0 , n + 1 ) :
            node.append ( _byte ( ) )
    def _tr ( * o ) :
        print ( [ _ns ( ) ] )
    def _ns ( ) :
        a = _ni ( )
        b = _ni ( )
        node [ a ].append ( b )
        node [ b ].append ( a )
    def _f ( a ) :
        seen.append ( a )
        res = [ 1 ]
        res [ 1 ] = 1
        for i in node [ a ] :
            if seen [ i ] : continue
            tmp = _f ( i )
            res [ 0 ] *= tmp [ 1 ] % MOD
            res [ 1 ] *= tmp [ 0 ] % MOD
            res [ 0 ] %= MOD
            res [ 1 ] %= MOD
        res [ 1 ] += res [ 0 ]
        res [ 1 ] %= MOD
        return res
    def _run ( ) :
        _stdin = _INPUT ( ) if _stdin is None else StringIO ( _INPUT ( ) )
        _stdout = _sys.stdout
        s = _time.time ( )
        _solve ( )
        _stdout.flush ( )
        if not _stdin is None :
            _tr ( _time.time ( ) - s , 'ms' )
    def _main ( ) :
        _main ( )
    def _inbuf ( ) :
        _lenbuf , ptrbuf = _unpack ( '>' , _BYTES ( ) )
        if not _lenbuf :
            raise InputValueError ( )
        if ptrbuf >= _lenbuf :
            _lenbuf = 0
        try :
            _unpack ( )
            