def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = _main.get ( 'a' )
        self.b = _main.get ( 'b' )
        self.c = _main.get ( 'c' )
        print ( 'YES' if self.b - a == self.c - b else 'NO' )
