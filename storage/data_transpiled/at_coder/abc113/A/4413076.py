def import _main
class Main ( TestCase ) :
    def process ( self , case ) :
        X = case.X
        Y = case.Y
        return X + Y / 2
    def is753 ( self , x ) :
        return x in [ 7 , 5 , 3 ]
    def main ( self ) :
        case , _ = self._read_from_input ( )
        return process ( case )
    def output ( self , result ) :
        return result
    def _read_from_input ( self ) :
        with open ( self.input , 'r' ) as f :
            X = f.read ( )
            Y = f.read ( )
            f.close ( )
        return X , Y
    def output ( self , result ) :
        print ( result )
class Main ( TestCase ) :
    def process ( self , case ) :
        self.X , self.Y = self.X , self.Y
