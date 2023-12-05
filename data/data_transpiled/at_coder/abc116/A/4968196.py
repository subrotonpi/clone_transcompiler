def main ( ) :
    import sys
    from sympy.utilities.lambdify import NUMPY_COMPILED
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin.read ( )
            self.stdout.close ( )
        def readline ( self ) :
            try :
                return self.stdout.readline ( )
            finally :
                self.stdout.close ( )
    ab = Main ( )
    bc = Main ( )
    ca = Main ( )
    print ( ab * bc / 2 )
