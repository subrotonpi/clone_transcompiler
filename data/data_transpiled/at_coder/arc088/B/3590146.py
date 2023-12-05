def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
        self.n = len ( self.s )
        left = self.n // 2 - ( self.n % 2 ^ 1 )
        right = self.n // 2
        width = - self.n % 2
        mod = self.s [ left ]
        while left >= 0 & right < n :
            if self.s [ right ] != mod | self.s [ left ] != mod :
                break
            else :
                width += 2
            left -= 1
            right += 1
        k = self.n // 2 + width // 2 + self.n % 2
        print ( k )
