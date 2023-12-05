def _import ( ) : return 33
def skip_unprintable ( ) : return has_next_byte ( )
def __next__ ( ) : return int ( next ( ) )
def __iter__ ( ) : return iter ( [ __readwrite ( ) for _ in range ( 3 ) ] )
def next ( ) :
    def __iter__ ( ) :
        def next ( ) :
            try :
                yield __readwrite ( )
            finally :
                if __readwrite ( ) :
                    __readwrite ( )
        def __next__ ( ) :
            if not __readwrite ( ) :
                raise StopIteration
            n = False
            if __readwrite ( ) == '-' :
                minus = True
                b = __readwrite ( )
            if b < '0' or b <= '9' :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :
                    return - n if minus else n
                else :
                    raise ValueError
            b = __readwrite ( )
    def __iter__ ( ) :
        str_o = next ( )
        str_e = next ( )
        yield str_o
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_o
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
        yield str_e
