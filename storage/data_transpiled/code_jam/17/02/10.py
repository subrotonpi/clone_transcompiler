def _import ( ) :
    from sys import stdin , stdout
    from os import urandom
    from random import randint
    from time import sleep
    from os.name import curdir
    from os.path import join
    from os.path import join
    from os.path import join
    from os import sep , join
    from os.path import join
    from os import sep , join
    from os.path import join
    from os import chdir
    class B :
        def __init__ ( self , f ) :
            self.f = open ( join ( f , 'r' ) , 'w' )
            self.f = open ( join ( f , 'w' ) , 'w' )
            self.f.write ( '\n' )
            self.f.flush ( )
        def solve ( self ) :
            s = next ( self )
            for i in range ( len ( s ) - 1 ) :
                if s [ i ] > s [ i + 1 ] :
                    while i > 0 and s [ i - 1 ] == s [ i ] :
                        del s [ i ]
                    s = [ s [ : i ] ] + chr ( ord ( s [ i ] ) - 1 ) + s [ i + 1 : ]
                    for i in range ( 1 , len ( s ) ) :
                        s [ i ] = '9'
                    while len ( s ) > 1 and s [ 0 ] == '0' :
                        s.pop ( 0 )
                    s = ''.join ( s )
                    break
            self.printcase ( )
            self.write ( s )
        def printcase ( self ) :
            self.write ( 'Case #%d: ' % test )
        def printlnCase ( self ) :
            self.write ( 'Case #%d:' % test )
        def randint ( self ) :
            return randint ( 1 , maxsize )
        def uniform ( self ) :
            return uniform ( )
        def longdouble ( self ) :
            return float ( longdouble )
        def longdouble ( self ) :
            return longdouble
        def longdouble ( self ) :
            return longdouble
    