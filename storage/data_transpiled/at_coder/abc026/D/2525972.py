def _import ( ) :
    import sys
    import os
    import os
    import sys
    import os
    import errno
    import math
    import random
    import random
    import string
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.rfile = sys.stdin
            self.wfile = sys.stdout
            self.scanner = Scanner ( self.rfile )
            self.scanner = Scanner ( self.rfile )
            self.scanner.close ( )
    class Task4 ( object ) :
        def __init__ ( self , test_number , sc , f ) :
            self.a = sc.randint ( 0 , 100 )
            self.b = sc.randint ( 0 , 100 )
            self.c = sc.randint ( 0 , 100 )
            t = ( 100d + self.b ) / a
            while abs ( f ( t ) - 100 ) > 0.0000001 :
                t -= ( f ( t ) - 100 ) / df ( t )
            f ( t )
        def f ( t ) :
            return a * t + b * math.sin ( c * t * math.pi )
        def df ( t ) :
            return a + b * math.cos ( c * t * math.pi ) * c * math.pi
    class Scanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.buffer = bytearray ( 1024 )
            self.ptr = 0
            self.buflen = 0
        def has_next_byte ( self ) :
            if not self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
                return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            return - 1
        def isPrintableChar ( self ) :
            return '!' <= self.c <= '~'
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printableChar ( self.buffer [ self.ptr ] ) :
                ptr += 1
                