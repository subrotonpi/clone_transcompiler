def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        x , y = self.sc.split ( )
        print ( 'error' if x + y >= 10 else x + y )
