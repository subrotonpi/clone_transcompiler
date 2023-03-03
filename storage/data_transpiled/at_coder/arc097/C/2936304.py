def _import ( ) :
    import sys
    import os
    import os
    import sys
    import random
    import string
    import tokenize
    class Main ( ) :
        def __init__ ( self ) :
            self.N = 0
            self.B = [ ]
        def main ( self ) :
            sc = FastScanner ( sys.stdin )
            self.N = sc.__next__ ( )
            self.B = [ ]
            for i in range ( self.N * 2 ) :
                self.B.append ( int ( sc.next ( ) [ 0 ] ) , sc.__next__ ( ) )
        def add ( self , x ) :
            self.B.append ( x )
        def solve ( self ) :
            return self.B
        def readline ( self ) :
            if not self.readline or not self.readline :
                try :
                    return self.readline ( )
                except :
                    raise
            return self.readline ( )
        def readline ( self ) :
            return int ( self.readline ( ) [ 0 ] )
        def write ( self , x ) :
            self.B = [ ]
            for i in range ( self.N * 2 ) :
                self.B.append ( int ( x ) )
            return self.B
        def write ( self , x ) :
            self.B = [ ]
            self.B.append ( x )
        def read ( self , n ) :
            if not self.read or not self.readline :
                try :
                    return self.readline ( )
                except :
                    raise
            return self.read ( )
        def write ( self , x ) :
            return int ( self.B [ 0 ] )
        def write ( self , x ) :
            self.B = [ ]
            self.B.append ( x )
        def write ( self , x ) :
            self.B = [ ]
            self.B.append ( x )
        def write ( self , x ) :
            self.B = [ ]
            self.write ( self.next ( ) )
    return Main ( )
