def _ ( ) : return sys.stdin.read ( )
def main ( ) : return sys.stdin.read ( )
INPUT = ''
MOD = 1000000007
INF = 10000000
def solve ( ) :
    n , t = ni ( )
    a = [ ]
    for i in range ( n ) :
        a.append ( i )
    def nm ( * o ) :
        map = [ ]
        for i in range ( n ) :
            map.append ( i )
        return map
    def na ( * o ) :
        a = [ ]
        for i in range ( n - 2 , - 1 , - 1 ) :
            if i >= maxnum :
                maxnum = i
                continue
            else :
                if maxnum - i > maxprof :
                    maxprof = i
                    ans = 1
                elif maxnum - i == maxprof :
                    ans += 1
        return a
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
                        lenbuf = stdin.read ( lenbuf )
                    except EOFError :
                        raise InputError ( )
                    if lenbuf <= 0 : return - 1
                return inbuf [ ptrbuf ]
            def isSpaceChar ( c ) : return not ( c >= 33 and c <= 126 )
            def skip ( ) :
                while ( b in read ( ) and isSpaceChar ( b ) ) : return b
            def nd ( ) : return float ( ns )
            def read ( ) : return nd ( )
        return read ( )
    return run
