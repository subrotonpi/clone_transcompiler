def _ _ main _ _ ( ) : return sys.stdin
def _main ( ) : return sys.stdout
INPUT = ''
MOD = 1_000_000_007
inf = sys.maxsize
def _unpack ( n ) :
    buf = [ ]
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n - 1 ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n - 1 ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n ) :
        buf.append ( i )
    for i in range ( n - 1 ) :
        buf.append ( i )
    s = - 1
    ans = 1
    for i in range ( n - 2 ) :
        if buf [ i ] < 0 and buf [ i + 1 ] > 0 :
            res = i - s + 1
            ans = max ( res , ans )
            s = i
    ans = max ( ans , n - 2 - s + 1 )
    print ( ans )
def _main ( ) :
    stdin = sys.stdin if INPUT else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    _solve ( )
    stdout.flush ( )
    if not INPUT :
        _tr ( time.time ( ) - s , "ms" )
def _unpack ( ) :
    yield sys.stdin.read ( 1024 )
def _unpack ( ) :
    yield sys.stdin.read ( 1024 )
def _unpack ( ) :
    yield sys.stdin.read ( 1024 )
for i in range ( 0 , 1024 ) :
    yield _unpack ( )
