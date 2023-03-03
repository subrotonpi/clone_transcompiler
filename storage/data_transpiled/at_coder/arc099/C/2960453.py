def _import ( ) : return sys.maxsize
import getopt
class Main :
    def __init__ ( self ) :
        self.col = [ ]
        self.adj = [ ]
        self.visited = [ ]
        inf = int ( 1e4 )
        def __init__ ( self , u ) :
            self.ans = pair ( self.col [ u ] )
            for v in self.visited :
                if not self.adj [ u ] [ v ] :
                    continue
                if self.col [ v ] == - 1 :
                    self.col [ v ] = 1 - self.col [ u ]
                    self.ans.merge ( self.color ( v ) )
                elif self.col [ v ] == self.col [ u ] :
                    return ( inf , inf )
    Note :./ Main.python.uses.unsafe.operations.with - Xlint :
    for details in details.operations :
        with open ( "/" + details.file , "r" ) as f :
            n , m = getopt.getopt ( f.read ( ) , "" )
            self.adj = [ ]
            self.visited = [ ]
            for i in range ( n ) :
                [ adj [ i ] , i ] = True
            for j in range ( m ) :
                u , v = getopt.getopt ( f.read ( ) , "" )
                self.adj [ u ] [ v ] = False
    pairs = [ ]
    cc = 1
    reachable = [ [ True ] * ( n + 1 ) for i in range ( n + 1 ) ]
    reachable [ 0 ] [ 0 ] = True
    col = [ ]
    [ [ ] for i in range ( n ) if col [ i ] == - 1 ]
    for i in range ( 0 , n ) :
        A , B = i , n - i
        ans = min ( ans , A * ( n - 1 ) + B * ( n - 1 ) )
    cc -= 1
    ans = n * 1 * ( n - 1 )
    for i in range ( 0 , n ) :
        if reachable [ cc - 1 ] [ i ] :
            reachable [ cc ] [ i + p.S ] = reachable [ cc ] [ i + p.T ] = True
        cc -= 1
    