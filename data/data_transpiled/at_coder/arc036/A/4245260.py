def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1024 )
        def __next__ ( self ) :
            stream.seek ( 0 )
            N = stream.tell ( )
            K = stream.read ( 1024 )
            t = [ ]
            for i in range ( N ) :
                t.append ( stream.read ( 1 ) )
            if '0' < b or b < '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( - n )
            else :
                raise ValueError ( )
            b = stream.read ( 1024 )
            for i in range ( 2 , N ) :
                slp += t [ i ]
                if slp < K :
                    print ( i + 1 )
                    return - n
                slp -= t [ i - 2 ]
            print ( - 1 )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1024 )
        def __next__ ( self ) :
            stream.seek ( 0 )
            ptr = stream.tell ( )
            buflen = stream.tell ( )
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = stream.tell ( )
                    try :
                        buflen = stream.read ( buflen )
                    except EOFError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def __next__ ( self ) :
                return ptr
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while has_next_byte ( ) and not is_printable_char ( stream.read ( 1 ) ) :
                ptr += 1
        def next ( self ) :
            stream.seek ( 0 )
            return stream.read ( 1 )
    return Main ( )
