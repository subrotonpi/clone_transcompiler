def _import ( ) : return next ( )
class Main :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    def read ( self ) :
        self.stdin = sys.stdin.read ( )
        self.stdout = sys.stdout.write
        self.stdout.write ( '! ' + str ( self.doit ( ) ) )
        self.stdout.flush ( )
    def power10 ( self ) :
        self.base = 1
        self.q = 9
        while not self.query ( self.q ) :
            self.q *= 10
            self.q += 9
            self.base *= 10
        return self.base
    def doit ( self ) :
        self.base = 1
        while self.query ( self.base ) :
            self.base *= 10
            if self.base >= 1e11 :
                return power10 ( self )
    K = base / 10
    geta = 999999999_999999999L
    dec = 17
    who = 0
    for k in range ( K , 1 , - 1 ) :
        B = int ( pow ( 10 , dec ) )
        min = ( k == K )
        max = 9
        while max - min > 1 :
            med = ( max + min ) / 2
            Q = geta - 9 * B + med * B
            if self.query ( Q ) :
                max = med
            else :
                min = med
        geta -= 9 * B
        geta += max * B
        who *= 10
        who += max
        dec -= 1
    def query ( self , n ) :
        self.stdout.write ( '? ' + str ( n ) )
        self.stdout.flush ( )
        return self.stdin.read ( )
    def debug ( self , * x ) :
        sys.stderr.write ( ''.join ( str ( x ) for x in x ) )
class Main ( ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdin.write ( ''.join ( str ( x ) for x in x ) )
    def readline ( self ) :
        self.stdin.close ( )
