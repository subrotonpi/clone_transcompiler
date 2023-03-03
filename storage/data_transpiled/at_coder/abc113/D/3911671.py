def _ ( ) : return 1
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1_000_000_007
    def __call__ ( self ) :
        sc = sys.stdin
        h , w , k = sc.readline ( ).split ( )
        dp = [ [ 1 ] * ( h + 1 ) for i in range ( h + 1 ) ]
        dp [ 0 ] [ 1 ] = 1
        for i in range ( h ) :
            for j in range ( 1 , w + 1 ) :
                left = j - 2
                right = w - j - 1
                Straight = self.my_pow ( left ) * self.my_pow ( right )
                Left = self.my_pow ( left - 1 ) * self.my_pow ( right )
                Right = self.my_pow ( left ) * self.my_pow ( right - 1 )
                dp [ i + 1 ] [ j ] = dp [ i ] [ j ] * Straight + dp [ i ] [ j - 1 ] * Left + dp [ i ] [ j + 1 ] * Right
                dp [ i + 1 ] [ j ] %= self.MOD
        print ( dp [ h ] [ k ] )
    def my_pow ( self , weight ) :
        if weight <= 0 : return 1
        ret_v = 0
        loop : for j in range ( ( 1 << weight ) ) :
            verify :
                for k in range ( weight ) :
                    if k == 0 : continue
                    verify
                    if ( ( j >> k ) & 1 ) == 1 and ( ( j >> k - 1 ) & 1 ) == 1 : continue loop
                ret_v += 1
            return ret_v
