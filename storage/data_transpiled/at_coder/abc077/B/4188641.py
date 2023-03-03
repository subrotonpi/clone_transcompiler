def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000007
    def main ( self ) :
        n = self.mod
        ans = 0
        for i in range ( 1 , 100000 ) :
            ans = self.mod ** i
            if ans == n :
                break
            elif ans > n :
                ans = ( self.mod - 1 ) ** ( i - 1 )
                break
        print ( ans )
