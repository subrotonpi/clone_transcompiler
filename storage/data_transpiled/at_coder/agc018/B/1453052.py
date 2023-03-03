def _import ( ) : return _FastScanner ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        A = sc.__next__ ( )
        flg = [ ]
        ret = [ ]
        for k in range ( M ) :
            count = [ ]
            for i in range ( N ) :
                for j in range ( M ) :
                    m = A [ i ] [ j ]
                    if not flg [ m ] :
                        count [ m ] += 1
                        break
            max = 0
            max_idx = 0
            for i in range ( 1 , M ) :
                if max < count [ i ] :
                    max = count [ i ]
                    max_idx = i
            flg [ max_idx ] = True
            ret = min ( max , ret )
        print ( ret )
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = debug
        self.ptr = 0
        self.buflen = 0
        self.buffer = ''
        self.eos = False
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    if self.debug :
                        self.buflen = len ( self.debug )
                        self.buffer = self.debug.encode ( 'utf-8' )
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
        def readByte ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
        def isPrintableChar ( self ) :
            while self._hasPrintableChar ( self ) and not self.isPrintableChar ( self.buffer [ ptr ] ) :
                ptr += 1
            return False
