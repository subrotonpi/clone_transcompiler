def main ( ) :
    import re
    class Main ( object ) :
        def __init__ ( self , mod ) :
            sc = sys.stdin
            S = sc.readline ( )
            flag = False
            S = S.replace ( 'eraser' , '' )
            S = S.replace ( 'erase' , '' )
            S = S.replace ( 'dreamer' , '' )
            S = S.replace ( 'dream' , '' )
            if S == '' :
                flag = True
            if flag :
                print ( 'YES' )
            else :
                print ( 'NO' )
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
            for i in range ( n , n - k + 1 , - 1 ) :
                ans = ( ans * i ) % mod
            for i in range ( k , 0 , i ) :
                ans = ( ans * modpow ( i , mod - 2 , mod ) ) % mod
            return ans
    return Main
