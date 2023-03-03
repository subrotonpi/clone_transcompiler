def _import ( ) : return float ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return sys.stdin.readline ( )
def _import ( ) : return sys.stdout.readline ( )
def _import ( ) :
    try :
        f = sys.stdin
    except AttributeError :
        sys.stderr.write ( 'stdin not available on this system: %s\n' % sys.argv [ 0 ] )
        return sys.stdin.readline ( )
    tests = randint ( 1 , 100 )
    for test in tests :
        _import ( )
    f.close ( )
    sys.stdout = _import ( )
    sys.stderr = _import ( )
    sys.stderr = _import ( )
    sys.stderr = _import ( )
    sys.stderr = _import ( )
    from itertools import chain
    n = next ( chain ( _import ( ) , _import ( ) ) )
    p = next ( chain ( _import ( ) , _import ( ) ) )
    cnts = [ _import ( ) for _ in range ( n ) ]
    ans = _import ( )
    if p == 2 :
        ans += _import ( )
    elif p == 3 :
        ans += _import ( )
    elif p == 4 :
        ans += _import ( )
    elif p == 3 :
        ans += _import ( )
    elif p == 4 :
        ans += _import ( )
    elif p == 5 :
        ans += _import ( )
    elif p == 6 :
        ans += _import ( )
    elif p == 7 :
        ans += _import ( )
    elif p == 8 :
        ans += _import ( )
    elif p == 9 :
        ans += _import ( )
    elif p == 10 :
        ans += _import ( )
    elif p == 11 :
        ans += _import ( )
    elif p == 12 :
        ans += _import ( )
    else :
        raise AssertionError ( 'Case #%d: %d' % ( ans , ) )
