def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , * args , ** kwargs ) :
            super ( Main , self ).__init__ ( * args , ** kwargs )
            sc = stream.read ( 1 )
            N = sc.randint ( 0 , 1000000000 )
            min = min ( min , abs ( i - N // i ) + N % i )
            print ( min )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.read ( 1 )
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
        def read ( self ) :
            if self.stream.read ( 1 ) < self.stream.tell ( ) :
                return self.stream.read ( )
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( self.stream.tell ( ) )
                except IOError :
                    pass
                if self.stream.tell ( ) <= 0 :
                    return self.stream.read ( self.stream.tell ( ) )
        def read ( self ) :
            if self.stream.tell ( ) == 0 :
                return self.stream.read ( self.stream.tell ( ) )
            else :
                return self.stream.read ( self.stream.tell ( ) )
        def startswith ( self ) :
            return self.stream.read ( self.stream.tell ( ) )
        def startswith ( self ) :
            return self.stream.read ( self.stream.tell ( ) )
        def startswith ( self ) :
            return self.stream.read ( self.stream.tell ( ) )
        def startswith ( self ) :
            return self.stream.read ( self.stream.tell ( ) )
