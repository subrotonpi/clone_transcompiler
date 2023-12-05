def _import ( ) : return int ( next ( ) )
def main ( ) :
    global N , M
    global X0 , A , P
    def next_int ( n ) :
        sc = FastScanner ( )
        N = sc.next ( )
        M = sc.next ( )
        X0 = sc.next ( )
        A = sc.next ( )
        P = sc.next ( )
        print ( solve ( ) )
    def solve ( ) :
        if A % P == 0 :
            if X0 >= P :
                return 2 ** ( N - 1 )
            else :
                return 0
        x = X0
        S = [ ]
        for i in range ( N ) :
            for j in range ( M ) :
                idx = i * M + j
                S.append ( Student ( i , j , x ) )
                x = ( x + A ) % P
        S.sort ( key = lambda s : s.x )
        ans = 0
        for i in range ( N ) :
            start = i * M
            S.sort ( key = lambda s : s.j )
            for j in range ( M ) :
                ans += abs ( S [ start + j ].i - i )
                ans += abs ( S [ start + j ].j - j )
        return ans
    class Student ( ) :
        def __init__ ( self , i , j , x ) :
            self.i = i
            self.j = j
            self.x = x
    from itertools import repeat
    class FastScanner ( ) :
        def __init__ ( self , stream = sys.stdin ) :
            self.stream = stream
            self.stream = None
        def readline ( self ) :
            if not stream or not stream :
                try :
                    self.stream = sys.stdin.readline ( )
                except AttributeError :
                    raise EOFError
            return self.stream.readline ( )
    return int ( next ( ) )
