def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream.seek ( 0 )
            stream.seek ( 0 )
        def read ( self ) :
            stream.seek ( 0 )
            N = stream.read ( 1 )
            S = stream.read ( 1 )
        def write ( self , s ) :
            stream.seek ( 0 )
            left = [ '' ]
            right = [ '' ]
            K = 0
            for i in range ( 1 , N ) :
                if len ( left ) + len ( right ) + 1 >= N :
                    K = i - 1
                    break
                if i % 3 == 1 :
                    left.append ( 'a' )
                    right.append ( 'c' )
                elif i % 3 == 2 :
                    left.append ( 'c' )
                    right.append ( 'a' )
                else :
                    left.append ( 'b' )
                    right.append ( 'b' )
            if S == left.reverse ( ) + 'b' + right :
                print ( K )
            else :
                print ( - 1 )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
        def write ( self , s ) :
            if self.stream.read ( self.stream.tell ( ) ) < self.stream.tell ( ) :
                raise StopIteration
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        s = [ ]
        b = self.stream.read ( 1 )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.stream.