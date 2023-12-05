def _import ( ) :
    import time
    import os
    import sys
    import os
    import sys
    import locale
    class A ( object ) :
        NAME = 'a-large'
        def solve ( self ) :
            ntest = int ( self.read_word ( ) )
            for test in range ( ntest ) :
                c = int ( self.read_word ( ) )
                if c <= 32 :
                    break
            return ''.join ( [ chr ( c ) for c in self.read_word ( ) ] )
    def main ( ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
        except ( locale.Error , locale.UnicodeError ) :
            pass
        return
    def solve ( ) :
        try :
            sys.stdin.write ( '%s.in\n' % NAME )
        except :
            sys.stdout.write ( '%s.out\n' % NAME )
    def main ( ) :
        for test in range ( ntest ) :
            a = int ( self.read_word ( ) )
            b = int ( self.read_word ( ) )
            c = int ( self.read_word ( ) )
            d = int ( self.read_word ( ) )
            x0 = int ( self.read_word ( ) )
            y0 = int ( self.read_word ( ) )
            M = int ( self.read_word ( ) )
            table = [ [ ] for _ in range ( 3 ) ]
            for p in range ( n ) :
                p = ( int ( x0 ) , int ( y0 ) )
                table [ int ( x0 ) % 3 ] [ int ( y0 ) % 3 ] += 1
                x0 = ( a * x0 + b ) % M
                y0 = ( c * y0 + d ) % M
            ans = 0
            for x1 in range ( 3 ) :
                for y1 in range ( 3 ) :
                    v1 = table [ x1 ] [ y1 ]
                    for x2 in range ( 3 ) :
                        for y2 in range ( 3 ) :
                            v2 = table [ x2 ] [ y2 ]
                            x3 = ( 6 - x1 - x2 ) % 3
                            y3 = ( 6 - y1 - y2 ) % 3
                            v3 = table [ x3 ] [ y3 ]
                            if x1 == x2 and y1 == y2