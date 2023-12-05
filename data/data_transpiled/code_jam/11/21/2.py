def _import ( * os ) :
    import sys
    import io
    import sys
    import sys
    import os
    import sys
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            with io.open ( sys.argv [ 1 ] if sys.argv [ 1 ] else ( '.stdin' , 'rb' ) ) as f :
                self.N = len ( f.read ( ) )
        def read ( self ) :
            self.N = len ( self.N )
            self.cs = [ s.decode ( 'ascii' ) for s in f.read ( ) ]
        def solve ( self ) :
            num = [ ]
            for i in range ( N ) :
                for j in range ( N ) :
                    if self.cs [ i ] [ j ] != '.' :
                        num [ i ] += 1
            win = [ ]
            wp = [ ]
            for i in range ( N ) :
                for j in range ( N ) :
                    if self.cs [ i ] [ j ] == '1' :
                        win [ i ] += 1
                wp.append ( float ( win [ i ] ) / num [ i ] )
            self.owp = [ ]
            for i in range ( N ) :
                for j in range ( N ) :
                    if self.cs [ i ] [ j ] != '.' :
                        owp [ i ] += float ( win [ j ] - ( self.cs [ i ] [ j ] - '0' ) ) / ( num [ j ] - 1 )
                    self.owp [ i ] /= num [ i ]
            self.oowp = [ ]
            for i in range ( N ) :
                for j in range ( N ) :
                    if self.cs [ i ] [ j ] != '.' :
                        oowp [ i ] += owp [ j ]
                    self.oowp [ i ] /= num [ i ]
        def run ( self ) :
            caseN = self.N
            for i in range ( 1 , caseN + 1 ) :
                self.run ( )
