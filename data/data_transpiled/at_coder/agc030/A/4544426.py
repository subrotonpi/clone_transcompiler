def _import ( ) :
    from math import factorial , int
    from io import BytesIO
    class Main ( ) :
        def solve ( self , f ) :
            a , b , c = ord ( 'a' ) , ord ( 'b' ) , ord ( 'c' )
            if a + b + 1 >= c : f.write ( b + c )
            else : f.write ( 2 * b + a + 1 )
        def factorial ( self ) :
            if self.i <= 1 :
                return 1
            else :
                return self.i * factorial ( self.i - 1 )
    def main ( ) :
        f = sys.stdin
        out = sys.stdout
        with f :
            return Main ( ).solve ( f , out )
        out.flush ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def has_next_byte ( self ) :
            if self.p < self.length :
                return True
            else :
                p = 0
                try :
                    length = stream.read ( self.p )
                except :
                    pass
                if length <= 0 :
                    return False
                return True
        def read_byte ( self ) :
            if self.has_next_byte ( ) == True :
                return self.stream.read ( self.p )
            return - 1
        def is_printable ( self , n ) :
            return 33 <= n <= 126
        def skip ( self ) :
            while self.has_next_byte ( ) and not is_printable ( self.stream.read ( self.p ) ) :
                p += 1
        def __next__ ( self ) :
            skip ( self )
            return self.stream.read ( self.p )
        def write ( self , stream ) :
            if not self.stream.read ( self.p ) :
                raise StopIteration
            s = [ ]
            t = read_byte ( )
            while self.is_printable ( t ) :
                s.append ( t )
                t = read_byte ( )
            return s
    return FastScanner ( ).solve ( )
