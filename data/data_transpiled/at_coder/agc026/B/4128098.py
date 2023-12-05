def _ _ main _ _ ( ) : return sys.stdin
def _main ( ) : return sys.stdout
INPUT = ''
mod = 1_000_000_007
inf = float ( 'inf' )
def solve ( ) :
    t = ni ( )
    for i in range ( t ) :
        a , b , c , d = [ ] , [ ] , [ ] , [ ]
        if a < b :
            print ( 'No' )
        elif d < b :
            print ( 'No' )
        elif b <= c :
            print ( 'Yes' )
        else :
            g = gcd ( d , b )
            x = a % g + ( b - g )
            if x > c :
                print ( 'No' )
            else :
                print ( 'Yes' )
    def _main ( ) :
        fp = INPUT or sys.stdin
        out = sys.stdout
        s = time.time ( )
        solve ( )
        out.flush ( )
        if not INPUT :
            tr ( time.time ( ) - s + 'ms' )
    def _main ( ) :
        with open ( INPUT , 'r' ) as f :
            inbuf = f.read ( 1024 )
            lenbuf , ptrbuf = 0 , [ ]
            def _readByte ( ) :
                if lenbuf == - 1 :
                    raise InputError ( )
                if ptrbuf >= lenbuf :
                    ptrbuf = 0
                    try :
                        lenbuf = f.read ( lenbuf )
                    except IOError :
                        raise InputError ( )
                    if lenbuf <= 0 :
                        return - 1
                return inbuf [ ptrbuf ]
            def _readByte ( ) :
                return lenbuf
    return _main
