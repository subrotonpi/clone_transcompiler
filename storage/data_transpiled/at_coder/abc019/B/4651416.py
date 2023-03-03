def _import ( ) : return - n if - n else n
class Main ( ) :
    def __next__ ( self ) :
        s = self.next ( )
        pre = s [ 0 ]
        cnt = 1
        ans = ""
        for c in s [ 1 : ] :
            if pre == c :
                cnt += 1
            else :
                ans += str ( pre ) + str ( cnt )
                cnt = 1
            if i == len ( s ) - 1 :
                ans += str ( c ) + str ( cnt )
            pre = c
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , buffer ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.buflen
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = ptr
                try :
                    self.ptr += self.buflen
                except AttributeError :
                    pass
                if self.ptr <= 0 :
                    return False
                return True
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            while self.ptr < 0 and not isPrintableChar ( self.ptr ) :
                self.ptr += 1
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            yield self.ptr
    def __next__ ( self ) :
        n = 0
        minus = False
        b = readByte ( self )
        if b == '-' :
            minus = True
            b = readByte ( self )
        if b < '0' or '9' < b :
            raise StopIteration
        while True :
            if b == - 1 :
                break
            if b == - 1 :
                break
return Main ( )
