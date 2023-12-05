def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1 )
            stream.seek ( 0 )
        def read ( self ) :
            if not stream.read ( 1 ) :
                stream.seek ( 0 )
            N = stream.read ( 1 )
            M = stream.read ( 1 )
            num = [ ]
            for i in range ( M ) :
                if '0' <= i <= '9' :
                    n *= 10
                elif i == - 1 or not is_printable_char ( i ) :
                    return int ( - n )
                else :
                    raise ValueError ( )
            b = stream.read ( 1 )
            for i in range ( N ) :
                if i % 2 == 1 :
                    print ( 'NO' )
                    return
            print ( 'YES' )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
        def read ( self ) :
            self.stream.seek ( 0 )
            ptr = stream.tell ( )
            buflen = stream.tell ( )
            def has_next_byte ( ) :
                if ptr < buflen :
                    return True
                else :
                    ptr = stream.tell ( )
                    try :
                        buflen = stream.read ( len ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.tell ( ) ) ) ) ) )
                    except EOFError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( ) :
                while has_next_byte ( ) and not is_printable_char ( c ) :
                    ptr += 1
                return False
            def next ( self ) :
                return self.stream.read ( ptr )
        def read ( self ) :
            if not stream.read ( 1 ) :
                stream.seek ( 0 )
                return False
            else :
                stream.seek ( 0 )
                return True
    return Main ( )
