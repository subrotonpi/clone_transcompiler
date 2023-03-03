def _import ( ) : return next ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = FastScanner ( )
        N = sc.__next__ ( )
        print ( min ( N // 10 * 100 + N % 10 * 15 , ( ( N + 9 ) // 10 ) * 100 ) )
    def __next__ ( self ) :
        ret = [ ]
        for i in range ( self.n ) :
            ret.append ( randint ( 0 , N ) )
        return ret
    def __next__ ( self ) :
        return next ( )
    def __init__ ( self , * args ) :
        self.debug = None
    def __init__ ( self , * args ) :
        self.ptr = None
        self.buflen = None
        self.buffer = None
        self.eos = False
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = None
            try :
                if self.debug is not None :
                    self.buflen = len ( self.debug )
                    self.buffer = self.debug.encode ( "utf-8" )
                    self.debug = ""
                    self.eos = True
                else :
                    self.buflen = self.buffer.read ( self.buflen )
            except EOFError :
                pass
            if self.buflen < 0 :
                self.eos = True
                return False
            elif self.buflen == 0 :
                return False
    def readByte ( self ) :
        if self.has_next_byte ( ) :
            return self.buffer [ self.ptr ]
        else :
            return - 1
    def isPrintableChar ( self ) :
        return 33 <= self.peek ( )
    def skipUnprintable ( self ) :
        while self.has_next_byte ( ) and not isPrintableChar ( self.buffer [ self.ptr ] ) :
            self.ptr += 1
    def isEOS ( self ) :
        return self.eos
    def hasNext ( self ) :
        return hasNext ( )
    def next ( self ) :
        if self.hasNext ( ) :
            raise StopIteration
        n = 0
        minus = False
        b = readByte ( )
        if