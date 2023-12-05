def _import ( ) :
    from sys import stdin as stream
    from binascii import b2a_hex
    class Main ( object ) :
        def __init__ ( self , stream ) :
            stream.next = stream
        def read ( self ) :
            return int ( stream.read ( ) )
        def write ( self , b ) :
            stream.next = b
            ans = 0
            for i in range ( 3 ) :
                s , e = ord ( b ) , ord ( b )
                ans += s // 10 ** e
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self , ptr = 0 ) :
            if ptr < self.stream.tell ( ) :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.stream.tell ( ) )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.stream.tell ( ) :
                return self.stream.read ( ptr )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.tell ( ) and not is_printable_char ( self.stream.read ( self.stream.tell ( ) ) ) :
                self.stream.seek ( 0 )
            return True
        def readline ( self ) :
            if not self.stream.tell ( ) :
                raise StopIteration
            s = [ ]
            b = self.stream.read ( 1 )
            while self.stream.tell ( ) :
                s.append ( b )
                b = self.stream.read ( 1 )
            return s
        def readline ( self ) :
            if not self.stream.tell ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = self.stream.read ( 1 )
            if b == '-' :
                minus = True
                b = self.stream.read ( 1 )
            if self.stream.tell ( ) :
                n += 1
            return n
            