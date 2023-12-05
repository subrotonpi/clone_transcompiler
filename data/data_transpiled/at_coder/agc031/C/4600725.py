def _import ( ) :
    import sys
    import sys
    class Main ( object ) :
        def impossible ( self ) :
            print ( "NO" )
            sys.exit ( )
        def answer ( self , N , end ) :
            if N == 1 :
                return [ 0 , 1 ]
            if N == 2 :
                if end == 1 :
                    return [ 0 , 2 , 3 , 1 ]
                else :
                    return [ 0 , 1 , 3 , 2 ]
            ans = [ ]
            if end & ( 1 << ( N - 1 ) ) == 0 :
                smaller = answer ( self , N - 1 , end )
                for i in range ( len ( smaller ) ) :
                    if i & 1 == 0 :
                        ans.append ( smaller [ i ] )
                        ans.append ( smaller [ i ] | ( 1 << ( N - 1 ) ) )
                    else :
                        ans.append ( smaller [ i ] | ( 1 << ( N - 1 ) ) )
                        ans.append ( smaller [ i ] )
            return ans
        else :
            smaller1 = answer ( self , N - 1 , 1 )
            for n in range ( ( 1 << ( N - 1 ) ) ) :
                ans.append ( smaller1 [ n ] )
            smaller2 = answer ( self , end ^ ( 1 << ( N - 1 ) ) ^ 1 )
            for n in range ( ( 1 << ( N - 1 ) ) ) :
                ans [ ( 1 << ( N - 1 ) ) + n ] = smaller2 [ n ] ^ ( 1 << ( N - 1 ) ) ^ 1
            return ans
    def main ( ) :
        sc = sys.stdin
        N , A , B = sc.regs [ 0 ]
        if sum ( A ^ B ) % 2 == 0 :
            impossible ( )
        print ( "YES" )
        ans = answer ( self , N , A ^ B )
        for i in range ( len ( ans ) ) :
            ans [ i ] ^= A
    return Main ( )
