def _import ( ) :
    from sys import stdin as stream
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            sc = stream.read
            N = sc.randint ( 0 , 2 )
            for i in range ( 2 , N + 1 ) :
                if N % i == 0 :
                    print ( "NO" )
                    return
            print ( "YES" )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            stream.seek ( 0 )
        def read ( self , ptr = 0 ) :
            if ptr < self.buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.buflen )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.hasNextByte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def skipUnprintable ( self ) :
            while self.hasNextByte ( ) and not isPrintableChar ( self.buffer [ ptr ] ) :
                ptr += 1
        def hasNext ( self ) :
            skipUnprintable ( self )
            return self.hasNextByte ( )
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = readByte ( )
            while self.hasNext ( ) :
                s.append ( b )
                b = readByte ( )
            return s
        def readInt ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = readByte ( )
            if b == '-' :
                minus = True
                b = readByte ( )
            if b < '0' or b <= '9' :
                raise ValueError
            while self.hasNext ( ) :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not isPrintableChar ( b ) :
                    return ( - n )