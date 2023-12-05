def _import ( ) :
    from sys import stdin as stream
    class Main ( stream ) :
        def __iter__ ( self ) :
            sc = stream._FastScanner
            N = sc.__next__
            max = 0
            for i in range ( N ) :
                a = sc.__next__ ( )
                b = sc.__next__ ( )
                c = sc.__next__ ( )
                d = sc.__next__ ( )
                e = sc.__next__ ( )
                E /= 90
                E *= 11
                sum = a + b + c + d + E
                max = max ( max , sum )
            print ( max )
    class FastScanner ( stream ) :
        def __init__ ( self ) :
            stream._buffer = [ ]
        def __iter__ ( self ) :
            self._ptr = None
            self._ptr = None
            self._buffer.append ( stream._buffer [ 0 ] )
        def has_next_byte ( self ) :
            if self._ptr < self._ptr :
                return True
            else :
                self._ptr = None
                try :
                    self._buffer.append ( stream._buffer [ 0 ] )
                except IndexError :
                    pass
                if self._ptr <= self._ptr :
                    return False
            return True
        def __next__ ( self ) :
            return 33 <= self._ptr <= 126
        def skip_unprintable ( self ) :
            while self._ptr < self._ptr :
                self._buffer.append ( stream._buffer [ 0 ] )
        def __next__ ( self ) :
            return True
        def __iter__ ( self ) :
            return self._ptr == None
        def __next__ ( self ) :
            if self._ptr < self._ptr :
                return True
            else :
                return False
    def __next__ ( self ) :
        return None
    def __next__ ( self ) :
        return None
return Main ( )
