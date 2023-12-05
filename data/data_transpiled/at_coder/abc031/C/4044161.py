def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream.seek ( 0 )
            self.stream = stream.read ( 1024 )
        def read ( self ) :
            stream.seek ( 0 )
            self.stream.read ( 1 )
    N = int ( sys.stdin.read ( 1 ) )
    a = [ ]
    for i in range ( N ) :
        if '0' < i or '9' < i :
            raise ValueError ( )
        while True :
            if '0' <= i <= '9' :
                n *= 10
                n += i - '0'
            elif i == - 1 or not is_printable_char ( i ) :
                return - n if n else n
            else :
                raise ValueError ( )
        b = read_byte ( )
        if nl < int ( nl ) or nl > sys.maxint :
            raise ValueError ( )
        def read ( self ) :
            return float ( next ( a ) )
    def write ( self , b ) :
        self.stream.write ( b )
    def read ( self , b ) :
        if b == '-' :
            return b
        return b
    def write ( self , b ) :
        self.stream.write ( b )
    def write ( self , b ) :
        self.stream.write ( b )
    def read ( self , b ) :
        if b == '' :
            return b
        else :
            self.stream.write ( b )
    def write ( self , b ) :
        self.stream.write ( b )
    def write ( self , b ) :
        self.stream.write ( b )
    def read ( self , b ) :
        self.stream.write ( b )
    def write ( self , b ) :
        self.stream.write ( b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
    read ( self , b )
