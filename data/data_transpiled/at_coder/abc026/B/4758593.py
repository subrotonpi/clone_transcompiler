def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        dp = [ int ( i ) for i in sc.readlines ( ) ]
        dp.sort ( reverse = True )
        ans = 0.0
        for i in range ( N ) :
            if i % 2 == 0 :
                ans += dp [ i ] * dp [ i ] * math.pi
            else :
                ans -= dp [ i ] * dp [ i ] * math.pi
        print ( ans )
