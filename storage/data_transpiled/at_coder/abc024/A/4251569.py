def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        a , b , c , k = _main ( )
        s , t = _main ( )
        if s + t >= k :
            print ( a * s + b * t - ( s + t ) * c )
        else :
            print ( a * s + b * t )
