def import _unionfind
class Main ( object ) :
    def __init__ ( self , n ) :
        self.parent = [ ]
        self.number = [ ]
        for i in range ( 1 , n + 1 ) :
            self.set ( i )
    def __init__ ( self , n ) :
        self.parent.append ( n )
        self.number.append ( 1 )
    def find ( self , i ) :
        if i == self.parent [ i ] :
            return self.parent [ i ]
        else :
            return self.parent [ i ] = self.find ( self.parent [ i ] )
    def same ( self , x ) :
        return self.find ( x ) == self.find ( y )
    def unite ( self , x ) :
        xroot = self.find ( x )
        yroot = self.find ( y )
        if xroot == yroot :
            return
        else :
            self.parent [ yroot ] = xroot
            self.number [ xroot ] += self.number [ yroot ]
    def getnumber ( self , i ) :
        return self.number [ self.find ( i ) ]
def main ( ) :
    with open ( "/proc/sys/argv" , "r" ) as f :
        n = f.readline ( ).strip ( )
        m = f.readline ( ).strip ( )
        A = [ i for i in range ( m ) ]
        B = [ i for i in range ( m ) ]
        u = _unionfind ( n )
        ans = [ long ( n ) * ( n - 1 ) / 2 ]
        if m != 1 :
            for i in range ( m - 1 , - 1 , - 1 ) :
                if u.same ( A [ i ] , B [ i ] ) :
                    ans.append ( ans [ i + 1 ] )
                else :
                    ans.append ( ans [ i + 1 ] - u.getnumber ( A [ i ] ) * u.getnumber ( B [ i ] ) )
                    u.unite ( A [ i ] , B [ i ] )
        for i in range ( 1 , m + 1 ) :
            print ( ans )