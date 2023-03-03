def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        k = self.sc.randint ( 0 , 1 )
        s = self.sc.randint ( 0 , 1 )
        ans = 0
        for i in range ( 0 , min ( s , k ) + 1 ) :
            ans += max ( 0 , min ( s - i + 1 , k + 1 ) - max ( 0 , s - i - k ) )
        print ( ans )
