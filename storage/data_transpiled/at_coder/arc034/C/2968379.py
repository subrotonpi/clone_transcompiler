def _import ( ) : return _import ( '' )
def nla ( n ) :
    def solve ( ) :
        a , b = ni ( ) , ni ( )
        primcnt = { }
        for i in range ( a , b + 1 , - 1 ) :
            k = i
            for j in range ( 2 , i + 1 , - 1 ) :
                while k % j == 0 :
                    k //= j
                    primcnt [ j ] = primcnt.get ( j , 0 ) + 1
            if k > 1 :
                primcnt [ k ] = primcnt.get ( k , 0 ) + 1
        mod = long ( 1e9 ) + 7
        ans = 1
        for cnt in primcnt.values ( ) :
            ans = ( ans * ( cnt + 1 ) ) % mod
        print ( ans )
    def main ( ) :
        solve ( )
        sys.stdout.flush ( )
    def stdin ( ) :
        f = sys.stdin
        sys.stdout = sys.stdout
        sys.stdout = sys.__stdout__
        sys.stdout = f
    def readline ( ) :
        buffer = sys.stdin
        sys.stdout = sys.__stdout__
        sys.stdout = sys.__stdout__
    def readline ( ) :
        ptr = 0
        buflen = 0
        def has_next_byte ( ) :
            if ptr < buflen :
                return True
            ptr = 0
            try :
                buflen = f.read ( 1 << 15 )
            except TypeError :
                buflen = 0
            return buflen
        def readline ( ) :
            if has_next_byte ( ) :
                return buffer [ ptr ]
            else :
                return - 1
        def is_space_char ( c ) :
            return not ( 33 <= c <= 126 )
        def skip ( ) :
            while ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( ( 1 , ) , ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) and is_space_char ( c ) )
            return True
    def read ( ) :
        return sys.stdin
    def write ( s , l ) :
        return l
