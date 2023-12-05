def import _main
class Main ( TestCase ) :
    FAVOURITE_NUMBER = 753
    def process ( self ) :
        S = self.S
        min = sys.maxint
        for i , length in enumerate ( S ) [ 2 : ] :
            _ , num = int ( S [ i - 2 : i + 1 ] ) , min
            min = min ( min , _diff ( num ) )
        return min
    def diff ( num ) :
        return abs ( _FAVOURITE_NUMBER - num )
    def main ( self ) :
        case = self._read_from_input ( )
        result = self.process ( case )
        self.output ( result )
    def _read_from_input ( self ) :
        with open ( self.S , 'r' ) as sc :
            S = sc.read ( )
            sc.close ( )
        return { 'S' : S }
    def output ( self , result ) :
        print ( result )
    class TestCase ( TestCase ) :
        def __init__ ( self , S ) :
            self.S = S
