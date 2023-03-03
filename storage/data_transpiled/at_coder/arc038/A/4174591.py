def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
        self.K = [ ]
    def read ( self ) :
        sc = _fast_read ( )
        N = sc.read ( 1 )
        A = [ ]
        for i in range ( N ) :
            A.append ( sc.read ( 1 ) )
        A.sort ( )
        ans = 0
        for i in range ( N - 1 , - 2 , - 1 ) :
            ans += A [ i ]
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
    def write ( self , data ) :
        self.stream.seek ( 0 )
        ptr = 0
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        while self.stream.read ( 1 ) :
            if self.stream.read ( 1 ) < self.stream.tell ( ) :
                return self.stream.read ( )
            else :
                ptr = 0
                try :
                    self.stream.read ( self.stream.tell ( ) )
                except IOError :
                    pass
                if self.stream.read ( 1 ) <= self.stream.tell ( ) :
                    return self.stream.read ( self.stream.tell ( ) )
                else :
                    return self.stream.read ( self.stream.tell ( ) )
    def read ( self ) :
        if self.stream.read ( 1 ) < self.stream.tell ( ) :
            return self.stream.read ( self.stream.tell ( ) )
        else :
            return self.stream.read ( self.stream.tell ( ) )
    def read ( self ) :
        if self.stream.read ( 1 ) < self.stream.tell ( ) :
            return self.stream.read ( self.stream.tell ( ) )
        else :
            return self.stream.read ( self.stream.tell ( ) )
