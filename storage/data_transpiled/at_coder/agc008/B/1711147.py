def _ _ main _ _ ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdin.readline ( )
INPUT = ''
MOD = 1000000007
INF = 10000000
def solve ( ) :
    n = ni ( )
    k = ni ( )
    a = [ ]
    ans = 0
    p = long ( )
    m = long ( )
    while b in isSpaceChar ( ) :
        a.append ( b )
    b = [ ]
    for i in range ( n ) :
        b = ni ( )
        if b in a :
            ans += a [ i ]
            psum += a [ i ]
        else :
            msum += a [ i ]
        if i >= k :
            if a [ i - k ] in a :
                psum -= a [ i - k ]
            else :
                msum -= a [ i - k ]
        if i >= k - 1 :
            p = min ( p , psum )
            m = max ( m , msum )
    print ( max ( 0 , ans - min ( p , - m ) ) )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s , 'ms' )
    def main ( ) :
        with open ( stdin , 'rb' ) as f :
            inbuf = f.read ( 1024 )
            lenbuf , ptrbuf = 0 , 0
        def readByte ( ) :
            if lenbuf == - 1 : raise InputMismatchException ( )
            if ptrbuf >= lenbuf :
                ptrbuf = 0
                try :
                    lenbuf = f.read ( lenbuf )
                except IOError :
                    raise InputMismatchException ( )
                if lenbuf <= 0 : return - 1
            return inbuf [ ptrbuf ]
    def isSpaceChar ( c ) :
        return not ( c >= 33 and c <= 126 )
    def skip ( ) :
        return 0
    return run ( )
