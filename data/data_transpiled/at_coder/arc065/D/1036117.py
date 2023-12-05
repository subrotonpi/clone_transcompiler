def _import ( ) : return sys.stdin.read ( 2048 )
class Main ( object ) :
    MOD = int ( 1e9 ) + 7
    def __init__ ( self ) :
        self.MOD = int ( 1e9 ) + 7
    def solve ( self ) :
        self.N = randint ( 0 , 2048 )
        self.M = randint ( 0 , 2048 )
        ch = next ( self ) [ 0 ]
        self.l = [ randint ( 0 , 1 ) for _ in range ( self.M ) ]
        self.r = [ randint ( 0 , 1 ) for _ in range ( self.M ) ]
        self.l = [ ]
        self.r = [ ]
        for _ in range ( self.M ) :
            self.l.append ( randint ( 0 , 1 ) )
        self.r.append ( ch )
    def __next__ ( self ) :
        if self.M <= self.M :
            raise StopIteration
        self.l = [ ]
        self.r = [ ]
        for _ in range ( self.M ) :
            self.l.append ( randint ( 0 , 1 ) )
        self.r.append ( ch )
        self.r.append ( ch )
    def __next__ ( self ) :
        if self.M <= self.M :
            return
        self.l = [ ]
        self.r = [ ]
        for _ in range ( self.M ) :
            self.l.append ( randint ( 0 , 1 ) )
        self.r.append ( ch )
        self.r.append ( ch )
    def __next__ ( self ) :
        if self.M <= self.M :
            return
        self.l = [ ]
        self.r = [ ]
        for _ in range ( self.M ) :
            self.l.append ( randint ( 0 , 1 ) )
        self.r.append ( ch )
        self.r.append ( ch )
    def __next__ ( self ) :
        if self.M <= self.M :
            return
        self.next = __next__
