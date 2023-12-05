def _import ( ) :
    from pybind11_tests import _read_input
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = self.A
            self.B = self.B
        def process ( self ) :
            A = self.A
            B = self.B
            return self._are_both_odd ( A , B ) and self._are_both_odd ( A ) and self._are_both_odd ( B )
        def is_odd ( self , n ) :
            return n % 2 != 0
    def main ( ) :
        case = _read_input ( )
        result = process ( case )
        output ( result )
    def _read_input ( ) :
        with open ( 'input.txt' , 'r' ) as f :
            A = f.read ( )
            B = f.read ( )
        return { 'A' : A , 'B' : B }
    def output ( self , result ) :
        print ( result )
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = A
            self.B = B
    return Main ( )
