def _import ( ) : return _import ( )
class Main :
    def __init__ ( self ) :
        self.sc = FastScanner ( )
        self.logfile = sys.stdout
    def solve ( ) :
        N = self.sc.randint ( 0 , 10 )
        P = self.sc.randint ( 0 , N )
        A = [ ]
        for i in range ( N ) :
            A.append ( self.sc.randint ( 0 , N ) )
        if len ( [ i for i in A if i % 2 == 1 ] ) :
            self.logfile.write ( long ( pow ( 2 , N - 1 ) ) )
        else :
            if P == 0 :
                self.logfile.write ( long ( pow ( 2 , N ) ) )
            else :
                self.logfile.write ( 0 )
    class Point ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def __init__ ( self , * args ) :
            super ( Point , self ).__init__ ( * args )
            self.logfile.flush ( )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.buffer = f
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        self.buflen = len ( self.buffer )
                    except TypeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def readByte ( self ) :
                if self.ptr < self.buflen :
                    return self.buffer [ self.ptr ]
                else :
                    return - 1
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            if self.ptr == 0 :
                return True
            else :
                return self.ptr
