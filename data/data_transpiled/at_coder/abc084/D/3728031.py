def _import ( ) :
    from sys import stdin
    from struct import Struct , calcsize , unpack
    class Main ( Struct ) :
        def __init__ ( self ) :
            sc = Struct ( '' )
            n = 100000
            arr = [ ]
            for i in range ( 2 , n + 1 ) :
                if arr [ i ] :
                    continue
                for j in range ( i + i , n + i + 1 ) :
                    arr.append ( True )
            sum = [ ]
            for i in range ( 2 , n + 1 ) :
                sum.append ( sum [ i - 1 ] + ( ( i % 2 and not arr [ i ] and not arr [ ( i + 1 ) // 2 ] ) ) )
            Q = unpack ( '>L' , arr [ i ] )
            for i in range ( Q ) :
                L , R = unpack ( '>L' , arr [ i ] )
                print ( sum [ R ] - sum [ L - 1 ] )
    class FastScanner ( Struct ) :
        def __init__ ( self , stream ) :
            Struct ( '' )
            self.stream = stream
            self.stream._buffer = [ ]
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try : self.buflen = stream.read ( self.ptr )
                    except AttributeError : pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr == '-' :
                    return self.ptr
                else : return - 1
        def is_printable_char ( self ) :
            return 33 <= self.ptr <= 126
        def __iter__ ( self ) :
            while self.ptr != 0 :
                yield self.ptr
    return Main ( )
