def test_solve ( ) :
    import sys
    import termios
    import struct
    import time
    import math
    class A ( termios.Struct ) :
        def __init__ ( self ) :
            self.T = int ( self.T )
            for tn in range ( 1 , T + 1 ) :
                n = struct.unpack ( '>I' , self.T ) [ 0 ]
                a = [ int ( self.a [ i ] ) for i in range ( n ) ]
                b = [ int ( self.b [ i ] ) for i in range ( n ) ]
                ans = 0
                for i in range ( n ) :
                    for j in range ( i + 1 , n ) :
                        if ( a [ i ] - a [ j ] ) * ( b [ i ] - b [ j ] ) < 0 :
                            ans += 1
            self.out.write ( 'Case #%d: %d\n' % ( tn , ans ) )
    FILE_NAME = 'A-large'
    def solve ( ) :
        try :
            f = open ( FILE_NAME + '.in' , 'r' )
            f = open ( FILE_NAME + '.out' , 'w' )
            self.solve ( )
            f.close ( )
        except ( IOError , OSError ) :
            sys.exit ( - 1 )
    def main ( ) :
        with open ( FILE_NAME + '.in' , 'r' ) as f :
            f.write ( '' )
        def my_assert ( e ) :
            if not e :
                raise Error ( 'assertion failed' )
        def assert_bounds ( l , m , r ) :
            my_assert ( l <= m <= r )
            return m
        class SimpleScanner ( termios.Scanner ) :
            def __init__ ( self ) :
                self.tokens = [ ]
                self.eof = False
            def readline ( self ) :
                while self.tokens is None or not self.tokens :
                    try :
                        self.tokens = self.tokens [ 0 ]
                    except IndexError :
                        eof = True
                        return ''
                return self.tokens [ 0 ]
            def seek ( self , 0 ) :
                self.tokens = self.tokens [ 1 ]
        