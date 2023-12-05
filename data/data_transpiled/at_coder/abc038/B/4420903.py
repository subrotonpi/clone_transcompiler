def _import ( ) :
    from sys import stdin
    from io import BytesIO
    class Main ( ) :
        def solve ( self ) :
            h1 , w1 , h2 , w2 = randint ( 0 , 10 ) , randint ( 0 , 10 ) , randint ( 0 , 10 )
            if h1 == h2 or h1 == w2 or w1 == h2 or w1 == w2 :
                self.out.write ( "YES" )
            else :
                self.out.write ( "NO" )
    class Main ( ) :
        def __init__ ( self , * args ) :
            self.out = sys.stdout
            super ( Main , self ).__init__ ( * args )
            self.out.flush ( )
    maxInt , minInt = sys.maxint , sys.maxint
    mod = 1000000007
    def max ( * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def min ( * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    f = stdin
    buffer = BytesIO ( )
    length , p = 0 , 0
    def has_next_byte ( ) :
        if p < length :
            return True
        else :
            p = 0
            try :
                length = f.read ( p )
            except :
                pass
            if length == 0 :
                return False
            return True
    def read_byte ( ) :
        if has_next_byte ( ) == True :
            return buffer.getvalue ( )
        p += 1
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( ) :
        while has_next_byte ( ) and not is_printable ( buffer.getvalue ( ) ) :
            p += 1
    def __next__ ( ) :
        skip ( )
        return has_next_byte ( )
    def next ( ) :
        ar = [ ]
        temp = read_byte ( )
        while is_printable ( temp ) :
            ar.append ( temp )
            temp = read_byte ( )
        return ar
    def __next__ ( ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( next ( ) )
        return ar
