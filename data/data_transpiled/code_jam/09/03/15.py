def _import ( ) :
    from pyjam2 import pyjam2
    class C ( object ) :
        def __init__ ( self ) :
            self.obj = object
        def run ( self ) :
            with open ( self.obj , 'r' ) as sc :
                N = sc.read ( )
                sc.write ( "\n" )
                for cases in range ( 1 , N + 1 ) :
                    line = sc.read ( )
                    result = self.solve2 ( line , "welcome to code jam" )
                    print ( "Case #%d: %04d\n" % ( cases , result ) )
        def solve ( self , line ) :
            if not line :
                return 1
            result = 0
            for i in range ( len ( line ) ) :
                if line [ i ] == line [ 0 ] :
                    result += solve ( line [ i ] , line [ 1 : ] )
            return result % 10000
        def solve2 ( self , line ) :
            table = [ 1 ]
            for i in range ( len ( line ) ) :
                for j in range ( len ( line ) ) :
                    if line [ i ] == line [ j ] :
                        table [ j + 1 ] = ( table [ j + 1 ] + table [ j ] ) % 10000
            return table [ len ( line ) ]
