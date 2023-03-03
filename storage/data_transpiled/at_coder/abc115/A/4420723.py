def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.d = __main__.value
    def main ( self ) :
        self.d = __main__.value
        ans = None
        if self.d == 22 :
            ans = 'Christmas Eve Eve Eve'
        elif self.d == 23 :
            ans = 'Christmas Eve Eve'
        elif self.d == 24 :
            ans = 'Christmas Eve'
        elif self.d == 25 :
            ans = 'Christmas'
        print ( ans )
