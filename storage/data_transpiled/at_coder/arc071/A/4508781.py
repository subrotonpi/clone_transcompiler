def _ _ main _ _ ( ) : return
class Main ( object ) :
    def solve ( ) :
        n = randint ( 0 , 26 )
        alphabet = [ ]
        s = next ( )
        for i in range ( len ( s ) ) :
            alphabet [ s [ i ] - 97 ] += 1
        for i in range ( n - 1 ) :
            s = next ( )
        if not next ( ) :
            raise StopIteration
        s = next ( )
        n = 0
        while is_printable ( s ) :
            if s [ i ] == '-' :
                minus = True
            else :
                s = next ( )
        if s [ i ] < '0' or s [ i ] < '9' :
            n *= 10
            n += s [ i ] - 97
        else :
            raise StopIteration
        s = next ( )
        n = 0
        while is_printable ( s ) :
            if s [ i ] <= '9' :
                n += 1
            else :
                n += 1
        return - n if n < 126 else n
    def read ( ) :
        return bytes ( )
    def write ( ) :
        return bytes ( )
    def write ( ) :
        return write
    def solve ( ) :
        return
    def write ( ) :
        return write
    def write ( ) :
        return write
    def write ( ) :
        return write
    def write ( ) :
        return write
    def write ( ) :
        return write
    def write ( ) :
        return write
    def write ( ) :
        return write
