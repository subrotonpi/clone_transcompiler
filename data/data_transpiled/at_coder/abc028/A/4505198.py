def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def run ( self ) :
        self.n = int ( self.n )
        self.s = 'Bad'
        if self.n == 100 :
            self.s = 'Perfect'
        elif self.n >= 90 :
            self.s = 'Great'
        elif self.n >= 60 :
            self.s = 'Good'
        print ( self.s )
