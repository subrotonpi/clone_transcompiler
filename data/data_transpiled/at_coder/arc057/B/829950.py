def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.MAX = 2000 * 500000 + 1
    def main ( self ) :
        sc = _main ( )
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        acc_days = [ 1 ] + sc.__next__ ( )
        for i in range ( 2 , N + 1 ) :
            acc_days [ i ] = acc_days [ i - 1 ] + sc.__next__ ( )
        if acc_days [ N ] == K :
            print ( 1 )
            return
        dp = [ [ 0 ] * ( N + 1 ) for day in range ( 1 , N + 1 ) ]
        for day in range ( 1 , N + 1 ) :
            for win in range ( 1 , N + 1 ) :
                dp [ day ] [ win ] = MAX
        dp [ 0 ] [ 0 ] = 0
        for day in range ( 1 , N + 1 ) :
            for win in range ( 1 , day + 1 ) :
                if dp [ day ] [ win ] == MAX :
                    continue
                needed_win = _get_needed_win ( day , win , acc_days , dp )
                if needed_win + win > K :
                    break
                else :
                    dp [ day + 1 ] [ win ] = min ( dp [ day + 1 ] [ win ] , dp [ day ] [ win ] )
                    dp [ day + 1 ] [ win + 1 ] = min ( dp [ day + 1 ] [ win + 1 ] , dp [ day ] [ win ] + needed_win )
        ans = 0
        for win in range ( 1 , N + 1 ) :
            if dp [ N ] [ win ] != MAX and dp [ N ] [ win ] <= K :
                ans = win
        print ( ans )
    def _get_needed_win ( self , day , win , acc_days , dp ) :
        current_rate = ( float ( dp [ day ] [ win ] ) / ( float ( acc_days [ day ] ) ) ) + 1
        ret = int ( current_rate * ( acc_days [ day ] - acc_days [ day ] ) ) + 1
        return ret
