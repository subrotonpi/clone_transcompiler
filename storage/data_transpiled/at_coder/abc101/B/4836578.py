def import string
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.str = str ( self.n )
        self.sum = 0
        for c in self.str :
            self.sum += ord ( c )
        print ( 'Yes' if self.n % self.sum == 0 else 'No' )
