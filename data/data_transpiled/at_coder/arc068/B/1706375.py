def _ ( ) : return sys.stdin.read ( )
def main ( ) :
    global INPUT
    INPUT = ''
    def solve ( ) :
        n = ni ( )
        a = [ ]
        res = 0
        var = 0
        for i in range ( n ) :
            t = ni ( )
            if a [ t ] == 0 :
                var += 1
            if a [ t ] > 0 :
                res += 1
            a [ t ] += 1
        if res % 2 == 0 :
            INPUT.append ( var )
        else :
            INPUT.append ( - 1 )
    def tr ( * o ) :
        print ( [ x for x in o ] )
    return INPUT , tr ( )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s , 'ms' )
def main ( ) :
    with open ( INPUT , 'r' ) as f :
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
        while ( b != - 1 and isSpaceChar ( b ) ) :
            yield b
    nd = float ( ns ( ) )
    nc = char ( ns ( ) )
    return nd , nc
return run
