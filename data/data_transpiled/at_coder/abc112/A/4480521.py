def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __init__ ( self ) :
            self.source = sys.stdin
            self.lineno = 1
        def call ( self ) :
            n = NUMPY_COMPILED.index ( self.source )
            if n == 1 :
                print ( "Hello World" )
                return
            a = NUMPY_COMPILED.index ( self.source [ 0 ] )
            b = NUMPY_COMPILED.index ( self.source [ 1 ] )
            print ( a + b )
