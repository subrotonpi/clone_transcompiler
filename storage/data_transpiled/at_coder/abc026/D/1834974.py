def _ _ main _ _ ( ) : return sys.stdin
def _main ( ) : return sys.stdout
INPUT = ''
MOD = 1_000_000_007
inf = sys.maxsize
def solve ( ) :
    a , b = _skip ( )
    c = _skip ( )
    left , right = float ( 100 - b ) , float ( 100 + b )
    k = 0
    while left < right :
        l , r = ( left + left + right ) / 3 , ( left + right + right ) / 3
        if f ( a , b , c , l ) >= f ( a , b , c , r ) :
            left = l
        else :
            right = r
            k += 1
            if k > 1000000 :
                break
    f ( left , b , c , t )
    k = a * t + b * math.sin ( c * t * math.pi )
    return abs ( 100 - k )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        _tr ( time.time ( ) - s + 'ms' )
def main ( ) :
    with open ( '/dev/null' , 'r' ) as f :
        inbuf = f.read ( 1024 )
        lenbuf , ptrbuf = 0 , 0
        def _skip ( ) :
            if lenbuf == - 1 : raise InputError ( )
            if ptrbuf >= lenbuf :
                ptrbuf = 0
                try :
                    lenbuf = f.read ( lenbuf )
                except IOError :
                    raise InputError ( )
                if lenbuf <= 0 : return - 1
            return inbuf [ ptrbuf ]
        def _skip ( ) :
            while ( b , c ) != - 1 and _skip ( ) :
                b = f.read ( 1 )
            return b
return run ( )
