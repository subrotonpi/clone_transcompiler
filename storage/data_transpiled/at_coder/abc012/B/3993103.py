def _import ( ) :
    from sys import stdin as stream
    class Main ( stream.Stream ) :
        def read ( self ) :
            sc = stream.read ( 1 )
            N = sc.count ( '-' )
            s = N % 60
            N /= 60
            m = N % 60
            h = N / 60
            if h < 10 :
                print ( 0 , end = ' ' )
            print ( h , end = ' ' )
            if m < 10 :
                print ( 0 , end = ' ' )
            print ( m , end = ' ' )
            if s < 10 :
                print ( 0 , end = ' ' )
            print ( s , end = ' ' )
    class FastScanner ( stream.Stream ) :
        def read ( self ) :
            if not hasNext ( self ) : raise StopIteration
            n = 0
            if self.stream.read ( 1 ) == '-' :
                return - n
            elif not is_printable_char ( self.stream.read ( 1 ) ) :
                return int ( self.stream.read ( 1 ) )
            else :
                return - n
        def read ( self ) :
            if self.stream.read ( 1 ) == '-' :
                return self.stream.read ( 1 )
            else :
                ptr = 0
                try :
                    buflen = stream.read ( self.stream.read ( self.stream.size ( ) ) )
                except AttributeError :
                    pass
                if self.stream.read ( 1 ) == '-' :
                    return - n
                else :
                    return - n
        def write ( self , data ) :
            if self.stream.read ( 1 ) == '-' :
                return data
            else :
                return data
    def read ( self ) :
        if self.stream.read ( 1 ) == '-' :
            return - n
        else :
            return - n
