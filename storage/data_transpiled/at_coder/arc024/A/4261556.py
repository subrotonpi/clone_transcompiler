def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1 )
        def read ( self ) :
            if not stream.read ( 1 ) :
                stream.read ( 1 )
            L = stream.read ( 1 )
            R = stream.read ( 1 )
            h = [ 0 ] * 101
            for i in range ( L ) :
                l = stream.read ( 1 )
                h [ l ] += 1
            ans = 0
            for i in range ( R ) :
                r = stream.read ( 1 )
                if r > 0 :
                    ans += 1
                h [ r ] -= 1
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.read ( 1 )
        def read ( self ) :
            if self.ptr < self.buflen :
                return stream.read ( self.ptr )
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return stream.read ( self.ptr )
                else :
                    return stream.read ( self.ptr )
        def write ( self , data ) :
            if self.ptr < self.buflen :
                return stream.read ( self.ptr )
            else :
                return stream.read ( self.ptr )
        def read ( self ) :
            return stream.read ( self.ptr )
        def write ( self , data ) :
            if not stream.read ( self.ptr ) :
                stream.write ( data )
        def read ( self ) :
            stream.read ( self.ptr )
            return stream.read ( self.ptr )
    def read ( self ) :
        stream.read ( self.ptr )
        return stream.read ( self.ptr )
return Main ( )
