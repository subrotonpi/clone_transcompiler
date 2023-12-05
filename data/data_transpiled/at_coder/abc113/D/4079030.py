def main ( ) :
    from math import log
    mod = 1_000_000_007
    class Main ( object ) :
        def __init__ ( self ) :
            self.mod = mod
        def __call__ ( self ) :
            self.mod = mod
        def __repr__ ( self ) :
            return "%s" % self.mod
    h , w , k = map ( int , sys.argv [ 1 : ] )
    dp = [ [ 1 ] * ( h + 1 ) * ( w + 2 ) for i in range ( h + 1 ) ]
    dp [ 0 ] [ 1 ] = 1
    for i in range ( h ) :
        for j in range ( 1 , w + 1 ) :
            left = j - 2
            right = w - j - 1
            straight = bit ( left ) * bit ( right )
            Left = bit ( left - 1 ) * bit ( right )
            Right = bit ( left ) * bit ( right - 1 )
            dp [ i + 1 ] [ j ] = ( dp [ i ] [ j ] * straight + dp [ i ] [ j - 1 ] * Left + dp [ i ] [ j + 1 ] * Right ) % mod
    print ( dp [ h ] [ k ] )
    def bit ( number ) :
        if number <= 0 :
            return 1
        ans = 0
        as :
            for i in range ( pow ( 2 , number ) ) :
                for k in range ( number ) :
                    if k != 0 :
                        if ( i >> k & 1 ) == 1 and ( i >> k - 1 & 1 ) == 1 :
                            continue as
                ans += 1
            return ans
    return Main
