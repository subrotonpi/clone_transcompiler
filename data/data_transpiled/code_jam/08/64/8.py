def _ ( ) : return 'YES'
class D :
    def __init__ ( self ) :
        self.graph = [ ]
        self.graph2 = [ ]
    def read ( self ) :
        self.N = self.N
        self.graph = [ ]
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                self.graph [ i ].append ( False )
        for i in range ( self.N - 1 ) :
            a = self.N - 1
            b = self.N - 1
        return a
    def gcd ( a , b ) :
        while b > 0 :
            tmp = a % b
            a = b
            b = tmp
        return b
    def __init__ ( self ) :
        self.con = sys.stderr
        sys.stderr.write ( 'Read from (empty for stdin/stdout):' )
        stdin = sys.stdin
        if len ( stdin ) == 0 :
            self.stdin = sys.stdin
        else :
            pos = stdin.rfind ( '.' )
            stdin = stdin [ : pos ]
        stdin = stdin [ pos : ]
        for i in range ( self.N - 1 ) :
            a = self.N - 1
            b = self.N - 1
            self.graph [ a ] [ b ] = True
    M = self.M
    graph2 = [ ]
    for i in range ( M ) :
        for j in range ( self.N ) :
            graph2 [ i ] [ j ] = False
    def work ( self ) :
        map = [ ]
        used = [ ]
        for i in range ( self.N ) :
            used.append ( False )
        ans = fill ( map , 0 )
    def fill ( self , pos ) :
        if pos == self.M : return check ( self )
        for i in range ( self.N ) :
            if not used [ i ] :
                map [ pos ] = i
                used [ i ] = True
                if fill ( map , pos + 1 ) : return True
                used [ i ] = False
        return False
    def check ( self ) :
        for i in range ( self.M ) :
        