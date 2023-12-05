def _import ( ) : return _readline
class Main ( object ) :
    def __init__ ( self , args ) :
        super ( Main , self ).__init__ ( )
        self.N = args.n
        x = args.n
        used = [ ]
        if x == 1 or x == 2 * N - 1 :
            self._print ( 'No' )
        else :
            self._print ( 'Yes' )
    def read ( self ) :
        if not self._has ( ) :
            raise StopIteration
        n = 0
        b = read_byte ( self )
        if b == '-' :
            self._print ( 'No' )
        else :
            self._print ( 'Yes' )
        if self.N == 2 :
            self._print ( '1 2 3' )
        else :
            a = [ ]
            a.append ( x )
            a.append ( x - 1 )
            a.append ( x + 1 )
            used.append ( 1 )
            if self._has ( ) :
                while self._used [ numpos ] == 1 :
                    numpos += 1
                self._print ( numpos )
                numpos += 1
            else :
                self._print ( a [ i ] )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
    def read ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( self.stream.read ( self.stream.read ( self.stream.tell ( ) ) ) )
