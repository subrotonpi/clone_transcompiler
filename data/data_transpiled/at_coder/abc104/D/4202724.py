def _ _ main _ _ ( ) : return False
class Main ( object ) :
    def __init__ ( self ) :
        self.is_debug = False
        self.file_name = 'input.txt'
        self.sc = FastScanner ( )
        self.MOD = 1000000007
        self.INF = int ( self.MOD ) / 2
    def solve ( self ) :
        S = self.sc.next ( )
        self.m = 0
        self.S = self.time ( )
        self.sc = ( self.sc.next ( ) )
        self.G = self.time ( )
        if self.is_debug :
            self.print ( '---Debug' )
            self.print ( '%8d ms' % ( self.G - self.S ) )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.stream = ''
            self.stream.read = 1024
            self.ptr = 0
            self.buflen = 0
        def __init__ ( self ) :
            self.stream.read = self.stream.read
            self.buflen += 1
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.stream.read ( self.buflen )
                except IOError :
                    pass
                if self.buflen <= 0 :
                    return False
        def read ( self ) :
            if self.stream.read ( self.ptr ) == 'A' :
                self.stream.write ( self.pos )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def has_next_byte ( self ) :
            while self.stream.read ( self.ptr ) == '?' :
                self.stream.write ( self.pos )
        def __getitem__ ( self , i ) :
            if not self.stream.read ( self.ptr ) == 'B' :
                self.stream.write ( self.pos )
            else :
                return - 1
        def __getitem__ ( self , i ) :
            return self.pos
    def read ( self ) :
        return read (