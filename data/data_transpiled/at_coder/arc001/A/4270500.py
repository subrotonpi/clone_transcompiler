def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __next__ ( self ) :
            sc = stream._FastScanner ( )
            N = sc.__next__ ( )
            S = sc.next ( )
            n = [ ]
            for i in range ( 4 ) :
                if '0' <= b <= '9' :
                    n *= 10
                    n += [ i - '0' ]
                elif b == - 1 or not is_printable_char ( b ) :
                    return int ( - n )
                else :
                    raise ValueError
            b = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream._buffer = [ ]
        def __next__ ( self ) :
            if self.ptr < len ( stream._buffer ) :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream._buffer [ 0 ]
                except IndexError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            if self.ptr < len ( stream._buffer ) :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream._buffer [ ptr ]
                except IndexError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            return 33 <= ord ( self.ptr ) <= 126
        def skip_unprintable ( self ) :
            while self.ptr < len ( stream._buffer ) and not is_printable_char ( stream._buffer [ ptr ] ) :
                ptr += 1
            return False
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = read_byte ( )
            while self.ptr < len ( stream._buffer ) :
                s.append ( b )
                b = read_byte ( )
            return s
    return Main ( )
