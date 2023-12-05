def _ ( ) : return sys.stdin.read ( )
INPUT = ''
MOD = 1000000007
INF = 10000000
def solve ( ) :
    print ( abs ( nl ( ) - nl ( ) ) >= 2 )
    return - num if not ( nl ( ) ) else num
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s , 'ms' )
def main ( ) :
    def inbuf ( ) :
        lenbuf , ptrbuf = 0 , 0
        def readByte ( ) :
            if lenbuf == - 1 : raise InputError ( )
            if ptrbuf >= lenbuf :
                ptrbuf = 0
                try :
                    lenbuf = stdin.read ( 1 )
                except IOError :
                    raise InputError ( )
                if lenbuf <= 0 : return - 1
            return inbuf [ ptrbuf ]
        def isSpaceChar ( c ) : return not ( c >= 33 and c <= 126 )
        def skip ( ) :
            while ( b != - 1 and isSpaceChar ( b ) ) : return b
        def nd ( ) : return float ( ns ( ) )
        def nc ( ) : return chr ( skip ( ) )
        def ns ( ) :
            b = skip ( )
            yield b
            yield b
            yield b
        return n if n == p else [ ]
    def ns ( n ) :
        buf = [ ]
        b , p = skip ( ) , 0
        while b < n and not ( isSpaceChar ( b ) ) :
            buf.append ( b )
            b = readByte ( )
        return n if n == p else [ ]
    return run ( )
