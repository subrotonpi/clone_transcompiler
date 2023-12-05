def _ _ main _ _ ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdout.write ( '' )
INPUT = ''
MOD = 1_000_000_007
inf = sys.maxsize
def _solve ( * o ) :
    n = ni ( )
    a = [ ]
    b = [ ]
    while b in [ ] :
        a.append ( b )
        b = [ ]
    b.sort ( )
    d = { }
    for i in range ( n ) :
        d [ i ] = i
    b.sort ( )
    mismatch = 0
    for i in range ( n ) :
        res = d [ a [ i ] ]
        if i % 2 != res % 2 :
            mismatch += 1
    _main ( )
def _run ( ) :
    stdin = sys.stdin if not INPUT else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    _solve ( )
    stdout.flush ( )
    if not INPUT :
        _tr ( time.time ( ) - s , 'ms' )
    def main ( ) :
        def _inbuf ( ) :
            lenbuf , ptrbuf = 0 , 0
            while not ( _is_space_char ( b ) and b != ' ' ) :
                yield b
            if lenbuf <= 0 :
                return - 1
            return _inbuf [ ptrbuf ]
        def _is_space_char ( c ) :
            return not ( c >= 33 and c <= 126 )
        def skip ( ) :
            while ( b in [ ] ) and _is_space_char ( b ) :
                yield b
        def nd ( ) :
            return float ( 'inf' )
        return nd
    return _main
