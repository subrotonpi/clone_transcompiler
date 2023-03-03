def import scanner , is_printable , read_byte , parse_int , parse_int , parse_int , parse_int , parse_int , parse_int , parse_int , parse_int , ) :
    from string import string as str_bytes
    from string import ascii_letters
    from string import digits as digits
    N = len ( scanner ( ) )
    for i in range ( 1 , 9 ) :
        a = i * 100 + i * 10 + i
        if a >= N :
            print ( a )
            return
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.ptr = None
            self.buflen = None
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = None
                    try :
                        self.buflen = read_byte ( self.stream )
                    except UnicodeDecodeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return None
            def is_printable ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable ( self.stream [ self.ptr ] ) :
                    self.ptr += 1
            def next ( self ) :
                self.skip_unprintable ( )
                return self.ptr
            def decode ( self ) :
                if not self.stream :
                    raise StopIteration
                s = [ ]
                b = self.read_byte ( )
                while is_printable ( self.stream ) :
                    s.append ( b )
                    b = self.read_byte ( )
                return s
            def decode ( self ) :
                return parse_int ( self.stream )
    return FastScanner ( )
