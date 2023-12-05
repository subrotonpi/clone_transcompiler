def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
    def run ( self ) :
        print ( int ( self.sc.x * self.sc.y * 0.1 + self.sc.x * self.sc.y * 0.1 ) )
