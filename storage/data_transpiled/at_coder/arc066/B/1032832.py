def _import ( ) : return _import ( )
def main ( ) :
    global N
    global A
    global div
    div = 1000000007
    def dfs ( idx , justAdd , justXor , carry ) :
        if idx == 0 :
            if carry == 1 :
                return 1
            elif ( justAdd == 1 or justXor == 1 ) and not get ( N , 0 ) :
                return 1
        else :
            if not get ( N , 0 ) :
                return 1
        if ( justAdd == 1 or justXor == 1 ) and not get ( N , 0 ) :
            return 1
        if dp [ idx ] [ justAdd ] [ carry ] :
            sum = 1
            x = 2
            while n > 0 :
                if n & 1 :
                    sum *= x
                x %= div
                n >>= 1
            return sum
    def solve ( ) :
        N = randint ( 100 , 2 )
        for i in range ( 0 , len ( dp ) ) :
            for j in range ( 0 , len ( dp [ i ] ) ) :
                for k in range ( 0 , len ( dp [ j ] ) ) :
                    dp [ i ] [ j ] [ k ] = - 1
    def main ( ) :
        out = sys.stdout
        with out :
            out.flush ( )
        def randint ( ) :
            num = 0
            str = next ( )
            minus = False
            i = 0
            if str [ 0 ] == '-' :
                minus = True
                i += 1
            else :
                ans = mod ( dfs ( idx - 1 , 0 , 0 , 1 ) + dfs ( idx - 1 , 0 , 1 , 1 ) )
            for i in range ( 0 , len ( str ) ) :
                c = str [ i ]
                if not ( '0' <= c <= '9' ) :
                    raise SystemExit
                num = num * 10 + ( c - '0' )
        return minus
    def randint ( ) :
        num = 0
        str = next ( )
        minus = False
        i = 0
        if str [ 0 ] == '-' :
            minus = True
            i += 1
        len ( str )
        for i in range ( 0 , len ( str ) ) :