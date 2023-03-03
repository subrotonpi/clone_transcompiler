def _import ( ) :
    from sys import stdin as stream
    from binascii import hexlify
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.stream = stream
        def read ( self ) :
            sc = stream.read
            N = sc.find ( '-' )
            A = sc.find ( 'A' )
            B = sc.find ( 'B' )
            N = N % ( A + B )
            if N == 0 :
                print ( 'Bug' )
                return
            if N <= A :
                print ( 'Ant' )
            else :
                print ( 'Bug' )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream = stream.read
        def read ( self ) :
            ptr = 0
            buflen = 0
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except UnicodeDecodeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( ) :
                while has_next_byte ( ) and not is_printable_char ( stream.read ( self.ptr ) ) :
                    ptr += 1
            def __iter__ ( self ) :
                return self.stream.__iter__ ( )
            def next ( self ) :
                if not hasNext ( ) :
                    raise StopIteration
                yield self.stream.read ( self.ptr )
        def read ( self ) :
            if not hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_byte ( )
            if b == '-' :
                minus = True
                b = read_byte ( )
            if b < '0' or '9' < b :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return int ( minus )
                else :
                    raise StopIteration
    return
    