def _import ( ) : return sys.stdout.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.out = sys.stdout
    def main ( self , args ) :
        N = ni ( )
        A = ni ( )
        x = na ( N )
        dp = [ [ ] for i in range ( 1 , N + 1 ) ]
        dp [ 0 ] [ 0 ] [ 0 ] = 1
        for i in range ( 1 , N + 1 ) :
            if not hasNext ( ) :
                raise StopIteration
            n = 0
            b = readByte ( )
            if b == '-' :
                minus = True
                b = readByte ( )
            elif b < '9' :
                raise StopIteration
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not isPrintableChar ( b ) :
                    return - n if minus else n
                else :
                    raise StopIteration
                b = readByte ( )
    def __next__ ( self ) :
        raise StopIteration
    def ni ( self ) :
        return sc ( )
    def nl ( self ) :
        return sc ( )
    def na ( self , n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nal ( self , n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nd ( self ) :
        return float ( next ( ) )
class FastScanner ( object ) :
    def __init__ ( self , buffer = sys.stdin ) :
        self.buffer = sys.stdin.read ( 1024 )
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < buflen :
                return True
            return False
    def __next__ ( self ) :
        return True
return Main
