def _import ( * args ) : return _import ( None , File , '' , 1 << 20 )
class File ( object ) :
    def __init__ ( self , * args ) :
        super ( File , self ).__init__ ( * args )
    def __init__ ( self , * args ) :
        super ( File , self ).__init__ ( * args )
        self.out = open ( File ( '%s.in' % ( self.name , ) ) , 'w' )
        self.TEST = int ( self.input.readline ( ) )
        for test in range ( 1 , self.TEST + 1 ) :
            print ( 'Running on testcase #%d' % test )
            self.solve ( test )
        self.input.close ( )
        self.out.close ( )
    def solve ( self ) :
        args = self.tokens ( )
        n , m = randint ( 1 , self.n ) , randint ( 1 , self.m )
        self.set = set ( [ '/' ] )
        for i in range ( n ) :
            s = self.input.readline ( )
            self.add ( s )
        res = 0
        for i in range ( m ) :
            s = self.input.readline ( )
            res += find ( s )
        self.gcj ( test , '%s' % ( res ) )
    def add ( s ) :
        if not s : return
        self.add ( s )
        self.add ( s )
        self.add ( s )
    def find ( s ) :
        if not s : return
        self.write ( 'B' )
        if s in self.set : return
        self.set.add ( s )
        return 1 + find ( s [ 0 ] )
