def _ ( ) : return sys.stdin.read ( )
INPUT = ''
MOD = 1000000007
INF = 10000000
def solve ( ) :
    n = ni ( )
    a = [ ]
    sum = 0
    total = 0
    for i in range ( n ) :
        a.append ( ni ( ) )
        sum += a [ i ]
        total += i + 1
    flag = 0
    if sum % total != 0 :
        flag = - 1
    sum /= total
    res = 0
    for i in range ( n ) :
        dif = a [ i ] - a [ ( i + 1 ) % n ]
        if ( sum + dif ) % n != 0 or sum + dif < 0 :
            flag = - 1
            break
        res += ( sum + dif ) / n
    if res != sum : flag = - 1
    print ( flag , 'YES' if flag == 0 else 'NO' )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s , 'ms' )
def main ( ) :
    def run ( ) :
        def inbuf ( ) :
            lenbuf , ptrbuf = 0 , 0
            while not ( isSpaceChar ( b ) and b != '' ) :
                yield b
            lenbuf = lenbuf
            while not ( isSpaceChar ( b ) and b != '' ) :
                yield b
                lenbuf = lenbuf
            if lenbuf <= 0 : return - 1
            return lenbuf [ ptrbuf ]
        def isSpaceChar ( c ) : return not ( c >= 33 and c <= 126 )
        def skip ( ) :
            while ( b != '' ) :
                yield b
        return ''.join ( [ chr ( c ) for c in read ( ) ] )
    return run
