def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv.index ( 'n' )
        self.n = sys.argv.index ( 'n' )
    def run ( self ) :
        if self.n == 0 :
            print ( 0 )
            return
        rem = 0
        ans = ''
        while self.n != 0 :
            rem = self.n % - 2
            self.n /= - 2
            if rem == - 1 :
                self.n += 1
                rem = 1
            ans = self.rem + ans
        print ( ans )
