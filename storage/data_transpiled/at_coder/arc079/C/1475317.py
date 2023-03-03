def _import ( ) :
    from sys import stdin
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.stream = BytesIO ( )
        def read ( self ) :
            sc = FastScanner ( )
            N = sc.randint ( 1 , 10 )
            a = sc.read_long_list ( N )
            count = 0
            flg = True
            while flg :
                now = 0
                for i in range ( self.stream.count ) :
                    if a [ i ] >= N :
                        x = a [ i ] // N
                        a [ i ] -= x * ( N + 1 )
                        now += x
                count += now
                flg = False
                for i in range ( self.stream.count ) :
                    a [ i ] += now
                    if a [ i ] >= N :
                        flg = True
            print ( count )
    class FastScanner ( object ) :
        def __init__ ( self , debug = None ) :
            self.debug = None
            self.stream = sys.stdin
            self.ptr = 0
            self.buflen = 0
            self.buffer = BytesIO ( )
            self.eos = False
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        if self.debug :
                            self.buflen = len ( self.debug )
                            self.buffer = self.debug.getvalue ( )
                            self.debug = ""
                            self.eos = True
                        else :
                            self.buflen = len ( self.buffer )
                    except TypeError :
                        pass
                    if self.buflen < 0 :
                        self.eos = True
                        return False
                    elif self.buflen == 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.has_next_byte ( ) :
                    return self.buffer [ ptr ]
                else :
                    return False
        def read_char ( self ) :
            return chr ( self.char )
    return FastScanner ( )
