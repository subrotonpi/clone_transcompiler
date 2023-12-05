def import _sys , StringIO , is_printable_char , is_printable_char , is_printable_char , is_printable_char , ) :
    import sys
    import os
    import sys
    from StringIO import StringIO
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.rfile = sys.stdin
            self.wfile = sys.stdout
            self.fin = FasterScanner ( self.rfile )
            self.fout = StringIO ( )
            self.solver = TaskC ( )
            self.solver.solve ( 1 , self.fin , self.fout )
            self.fout.seek ( 0 )
    class TaskC ( object ) :
        def solve ( self , test_number , FasterScanner , stream ) :
            ( a , b , c ) = test_number
            x , y = test_number
            dxy = min ( x , y )
            ab = min ( a + b , c * 2 )
            ans = ab * dxy
            x -= dxy
            y -= dxy
            ans += min ( x * a , x * 2 * c )
            ans += min ( y * b , y * 2 * c )
            stream.write ( ans )
    class FasterScanner ( object ) :
        def __init__ ( self ) :
            self.rfile = StringIO ( )
            self.buffer = StringIO ( )
            self.bufpointer = self.rfile.tell ( )
            self.buflength = self.buflength
        def has_next_byte ( self ) :
            if self.bufpointer < self.buflength :
                return True
            self.bufpointer = 0
            try :
                self.buflength = self.rfile.tell ( )
            except AttributeError :
                pass
            return ( self.buflength > self.buflength )
        def read ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = self.n
            minus = False
            b = self.readByte ( )
            if b == '-' :
                minus = True
                b = self.readByte ( )
            if b < '0' or b > sys.byteorder [ : - 1 ] :
                raise ValueError
            while self.hasNext ( ) :
                n += 1
            return n
    return Main
