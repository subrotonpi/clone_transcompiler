def _import ( ) :
    from sys import stdin as stream
    from itertools import repeat
    def isPrime ( i ) :
        if i == 0 :
            return False
        k = 0
        while k < N :
            if isPrime ( i * 5 + 6 ) :
                yield i * 5 + 6
                k += 1
            i += 1
    def isPrime ( i ) :
        for j in range ( 2 , i ** 2 + 1 ) :
            if i % j == 0 :
                return False
        return True
    class FastScanner ( stream.Scanner ) :
        def __init__ ( self , stream , ptr = 0 , buflen = 0 ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readByte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = stream.read ( ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def skipUnprintable ( ) :
            while ptr < buflen and not isPrintableChar ( buffer [ ptr ] ) :
                ptr += 1
        def hasNext ( ) :
            skipUnprintable ( )
            return ptr < buflen
        def next ( ) :
            if not hasNext ( ) :
                raise StopIteration
            yield next ( )
    n = 0
    minus = False
    b = readByte ( )
    if b == '-' :
        minus = True
        b = readByte ( )
    if b < '0' or '9' < b :
        raise ValueError
    while True :
        if '0' <= b <= '9' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not isPrintableChar ( b ) :
            return int ( minus )
        else :
            raise ValueError
