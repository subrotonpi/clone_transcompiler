def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , ** kwargs ) :
            sc = stream.read ( )
            print ( "%s" % sc.unpack ( ">ii" % len ( sc.args ) ) )
        def read ( self ) :
            return self.args [ 0 ]
    class FastScanner ( stream.read ) :
        def __init__ ( self , ** kwargs ) :
            stream.read ( )
        def write ( self , data ) :
            self.args = data
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read ( self ) :
                if self.ptr < self.buflen :
                    return self.args [ ptr ]
                else :
                    return False
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.args [ ptr ] ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = self.next ( )
            while is_printable_char ( b ) :
                s.append ( b )
                b = self.next ( )
            return s
        def read ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = self.next ( )
            if b == '-' :
                minus = True
                b = self.next ( )
            if b < '0' or b < '9' :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or