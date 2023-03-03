def _ _ main _ _ ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdout.write ( '' )
INPUT = ''
mod = 1_000_000_007
inf = float ( 'inf' ) / 2
def solve ( ) :
    n = ni ( )
    a = [ nl ( ) for i in range ( n ) ]
    a.sort ( )
    mx = a [ - 1 ]
    mid = float ( mx ) / 2
    md = inf
    for i in range ( n ) :
        if abs ( a [ i ] - mid ) < d :
            d = abs ( a [ i ] - mid )
            md = a [ i ]
    print ( mx , md )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s , 'ms' )
def main ( ) :
    with open ( sys.argv [ 1 ] , 'r' ) as f :
        inbuf = f.read ( 1024 )
        lenbuf , ptrbuf = 0 , 0
        def _readByte ( ) :
            if lenbuf == - 1 : raise InputError ( )
            if ptrbuf >= lenbuf :
                ptrbuf = 0
                try :
                    lenbuf = stdin.read ( 1 )
                except EOFError :
                    raise InputError ( )
                if lenbuf <= 0 : return - 1
            return inbuf [ ptrbuf ]
        def _is_space_char ( c ) : return not ( c >= 33 and c <= 126 )
        def skip ( ) :
            while ( b in read ( ) and _is_space_char ( b ) ) : return b
        nd = float ( ns ( ) )
        nc = float ( ns ( ) )
        return nd , nc
return run
