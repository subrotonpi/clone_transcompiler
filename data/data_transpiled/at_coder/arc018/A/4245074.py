def _import ( ) :
    from sys import stdin as s
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , sc ) :
            s._sc = sc
            self.Height = s.get ( 'Height' )
            BMI = s.get ( 'BMI' )
            print ( BMI * self.Height * self.Height / 10000 )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self , ptr = 0 ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.stream.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = ptr
                try :
                    buflen = self.stream.read ( self.ptr )
                except AttributeError :
                    pass
                if self.ptr <= 0 :
                    return False
        def isPrintableChar ( self ) :
            return 33 <= self.ptr <= 126
        def skipUnprintable ( self ) :
            while self.ptr < 0 and not isPrintableChar ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr , self.ptr , self.pos
    def __next__ ( self ) :
        if not self.hasNext :
            raise StopIteration
        s = FastScanner ( )
        b = self.next
        while b == '-' :
            minus = True
            b = self.next
        if b < '0' or '9' < b :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not isPrintableChar ( b ) :
                return ( - n ) * ( - n )
            else :
                raise StopIteration
            b = self.next
    return Main ( )
