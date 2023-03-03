def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _input ( )
    def input ( self ) :
        self.s = _input ( )
    def main ( self , args ) :
        self.input ( )
        N = len ( self.s )
        count = 0
        for i in range ( N // 2 ) :
            if self.s [ i ] != self.s [ N - i - 1 ] :
                count += 1
        ans = 0
        if count == 0 :
            if N % 2 == 1 :
                ans = 25 * N - 25
            else :
                ans = 25 * N
        elif count == 1 :
            ans = 25 * N - 2
        elif count >= 2 :
            ans = 25 * N
        print ( ans )
