def _import ( ) : return sys.stdin.read ( )
def _import ( ) :
    global INPUT
    INPUT = ''
    MOD = 1_000_000_007
    inf = sys.maxsize
    def solve ( ) :
        n , k = nl ( )
        total = n ** 2
        res1 = ( k - 1 ) * ( n - k ) ** 6
        res2 = ( n - k ) * 3 + ( k - 1 ) * 3
        res3 = 1
        ans = float ( res1 + res2 + res3 ) / total
        return ans
    def run ( ) :
        stdin = INPUT.decode ( 'utf-8' ) if INPUT.decode ( 'utf-8' ) else StringIO ( INPUT.decode ( 'utf-8' ) )
        stdout = sys.stdout
        s = time.time ( )
        solve ( )
        stdout.flush ( )
        if not INPUT.decode ( 'utf-8' ) :
            tr ( time.time ( ) - s , 'ms' )
    def main ( ) :
        with open ( INPUT , 'rb' ) as f :
            inbuf = f.read ( 1024 )
        lenbuf , ptrbuf = 0 , 0
        def readByte ( ) :
            if lenbuf == - 1 : raise InputError ( )
            if ptrbuf >= lenbuf :
                ptrbuf = 0
                try :
                    lenbuf = stdin.read ( lenbuf )
                except EOFError :
                    raise InputError ( )
                if lenbuf <= 0 : return - 1
            return inbuf [ ptrbuf ]
    def isSpaceChar ( c ) : return not ( c >= 33 and c <= 126 )
    def skip ( ) :
        while ( b is not None ) and isSpaceChar ( b ) :
            buf += b
            p = 0
        return b
    def nd ( ) :
        return float ( ns ( ) )
    def ns ( ) :
        b = skip ( )
        s = 0
        while not ( isSpaceChar ( b ) and b != ' ' ) :
            s += b
            p = 0
        return s
    return ns
