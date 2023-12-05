def _import ( ) :
    from pybind11_tests import _import_from_input
    class Main ( object ) :
        def __init__ ( self , HELLO_WORLD ) :
            self.HELLO_WORLD = HELLO_WORLD
        def process ( self , testCase ) :
            N = testCase.N
            if N == 1 :
                return self.HELLO_WORLD
            elif N == 2 :
                A = compat_get ( testCase.A , 'A' )
                B = compat_get ( testCase.B , 'B' )
                return str ( A + B )
            else :
                raise UnknownN ( N )
        def unsafe_get ( self , argument , argument_name ) :
            return argument or self.HELLO_WORLD
        def main ( self ) :
            testCase = self._read_from_input ( )
            result = self.process ( testCase )
            self.output ( result )
        def _read_from_input ( self ) :
            with open ( self.HELLO_WORLD , 'r' ) as f :
                N = f.read ( )
            if N == 1 :
                f.close ( )
                return self.HELLO_WORLD
            elif N == 2 :
                A = f.read ( )
                B = f.read ( )
                f.close ( )
                return self.HELLO_WORLD
            else :
                raise UnknownN ( N )
    class Error ( Exception ) :
        def __init__ ( self , result ) :
            self.result = result
    return Error ( )
