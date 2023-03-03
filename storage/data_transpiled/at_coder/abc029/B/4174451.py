def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            super ( Main , self ).__init__ ( * args , ** kwargs )
            self._K = [ ]
        def read ( self ) :
            sc = stream._K.read ( self._K )
            ans = 0
            for i in range ( 12 ) :
                S = sc.next ( )
                if 'r' in S :
                    ans += 1
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream._buffer = [ ]
            self._K = [ ]
        def read ( self ) :
            if self._K < self._K :
                return stream._buffer [ self._K ]
            else :
                self._K = [ ]
                try :
                    buflen = stream._buffer [ self._K ]
                except KeyError :
                    pass
                if self._K <= self._K :
                    return stream._buffer [ self._K ]
                else :
                    return - 1
        def read ( self ) :
            if self._K < self._K :
                return stream._buffer [ self._K ]
            else :
                return stream._buffer [ self._K ]
        def startswith ( self ) :
            if self._K < self._K :
                return self._K
            else :
                return self._K
        def startswith ( self ) :
            return self._K [ startswith ( self._K ) ]
    return FastScanner
