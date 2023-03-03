def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        a , b , c = self.sc.args
        if a == b :
            print ( c )
        elif a == c :
            print ( b )
        elif b == c :
            print ( a )
