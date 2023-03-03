def _import ( ) :
    from os import path
    import sys
    from os.path import join
    from os import sep
    from os import urandom
    from random import randint
    from itertools import chain
    class A ( object ) :
        def __init__ ( self , f , g ) :
            self.f = f
            self.g = g
        def solve ( self ) :
            try :
                with open ( join ( self.f , 'A-large.in' ) , 'r' ) as f :
                    return chain ( [ self.f , self.g ] , [ self.g , self.h ] )
            except ( IOError , OSError ) :
                pass
        def solve ( self ) :
            tests = self.n
            for test in range ( 1 , tests + 1 ) :
                parts = split ( '/' )
                P = int ( parts [ 0 ] )
                Q = int ( parts [ 1 ] )
                d = P / Q
                P = P / d
                Q = Q / d
                p = P
                q = Q
                print ( 'Case #%d: ' % test , end = ' ' )
                if q != int ( q ) :
                    print ( 'impossible' )
                else :
                    for ans in chain ( p , q ) :
                        print ( ans )
    return A ( )
