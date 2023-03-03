def _import ( ) : return [ ]
class Main ( ) :
    def __init__ ( self ) :
        sc = FastScanner ( )
        N = sc.__next__ ( )
        ans = [ [ ] for _ in range ( 30 ) ]
        for i in range ( 6 ) :
            ans [ 0 ].append ( i + 1 )
        for i in range ( 29 ) :
            for j in range ( 6 ) :
                ans [ i + 1 ].append ( ans [ i ] [ j ] )
            mode = i % 5
            ans [ i + 1 ].append ( ans [ i ] [ mode + 1 ] )
            ans [ i + 1 ].append ( ans [ i ] [ mode ] )
        N %= 30
        for i in range ( 6 ) :
            print ( ans [ N ] , i , end = ' ' )
        print ( )
    class FastScanner ( object ) :
        def __init__ ( self , buffer , ptr = 0 , buflen = 0 ) :
            self.buffer = buffer
            self.ptr = ptr
            self.buflen = buflen
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = self.ptr
                try :
                    self.buflen = self.buflen
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            if not self.ptr :
                raise StopIteration
            n = 0
            minus = False
            b = self.readByte ( )
            if b == '-' :
                minus = True
                b = self.readByte ( )
            if b == '-' :
                return False
            return True
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                return False
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return False
            return True
    return Main ( )
