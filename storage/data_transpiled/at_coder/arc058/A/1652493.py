def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.randint ( 1 , N )
            K = sc.randint ( 1 , K )
            s = set ( )
            for i in range ( K ) :
                s.add ( sc.randint ( 1 , N ) )
            while not ok ( N , s ) :
                N += 1
            print ( N )
        def ok ( N , s ) :
            while N != 0 :
                if N % 10 in s :
                    return False
                N /= 10
            return True
        def print ( s ) :
            print ( s )
        def init ( self , par , N ) :
            for i in range ( N ) :
                par [ i ] = i
        def root ( x , par ) :
            if par [ x ] == x :
                return x
            else :
                return ( par [ x ] , root ( par [ x ] , par ) )
        def same ( x , y , par ) :
            return root ( x , par ) == root ( y , par )
        def unite ( x , y , par ) :
            x , y = root ( x , par )
            if x == y :
                return x
            par [ x ] = y
        def lcm ( a , b ) :
            return a * ( b / gcd ( a , b ) )
        def gcd ( a , b ) :
            ta = max ( a , b )
            tb = min ( a , b )
            while ( ta % tb ) :
                ta , tb = tb , tmp
            return tb
        def modcomb ( self , n , k , mod ) :
            if k == 1 :
                return self.n
            ans = 1
            for i in range ( self.n , self.n - self.k + 1 , - 1 ) :
                ans = ( ans * i ) % mod
            for i in range ( self.k ) :
                ans = ( ans * i ) % mod
            for i in range ( self.k ) :
                ans = ( ans * i ) % mod
            return ans
    return Main
