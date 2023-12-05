def _ _ main _ _ ( ) : return sys.stdin.readline ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.scn = FastReader ( )
        self.out = StringIO ( )
        self.INPUT = ''
    def solve ( ) :
        n = self.scn.randint ( 1 , 10 )
        self.s = [ ]
        u , v = self.skip ( )
        if self.n % 2 == 1 :
            v -= 1
        self.s = self.read ( )
        self.s = [ ]
        while self.s.startswith ( ' ' ) or self.s.startswith ( '-' ) :
            self.s.append ( self.s )
        self.s = [ ]
        for i in range ( self.n ) :
            self.s.append ( self.read ( 1 ) )
        self.s.append ( self.s )
    def next_matrix ( self , n ) :
        self.s.append ( self.read ( 1 ) )
    def next_arange ( self , m ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self ) :
        self.s.append ( self.read ( 1 ) )
    def run ( self ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( 1 ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( n ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( n ) )
    def next_array ( self , n ) :
        self.s.append ( self.read ( n ) )
    def next_array ( self , n ) :
        self.s.