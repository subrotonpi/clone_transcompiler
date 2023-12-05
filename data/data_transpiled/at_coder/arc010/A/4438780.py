def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1 )
        def read ( self ) :
            stream.seek ( 0 )
            N = stream.read ( 1 )
            M = stream.read ( 1 )
            A = stream.read ( 1 )
            B = stream.read ( 1 )
            for i in range ( 1 , M + 1 ) :
                if N <= A :
                    N += B
                c = stream.read ( 1 )
                if N < c :
                    print ( i )
                    return
                else :
                    N -= c
            print ( 'complete' )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1 )
        def read ( self ) :
            stream.seek ( 0 )
            ptr = 0
            buflen = 0
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = 0
                    try :
                        buflen = stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if ptr < buflen :
                    return self.ptr
                else :
                    ptr = ptr
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( ) :
                while has_next_byte ( ) and not is_printable_char ( self.ptr ) :
                    ptr += 1
                return False
            def __next__ ( self ) :
                return self.ptr
            def __next__ ( self ) :
                if not hasNext ( ) :
                    raise StopIteration
                lines = [ ]
                b = read_byte ( self )
                while is_printable_char ( b ) :
                    lines.append ( b )
                    b = read_byte ( self )
                return lines
        def __next__ ( self ) :
            if not hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_byte ( self )
            if b == '-' :
                minus = True
                b = read_byte ( self )
            if b