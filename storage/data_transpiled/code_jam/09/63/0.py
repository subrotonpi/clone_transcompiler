def _import ( ) : return time.time ( )
class C :
    TIME = True
    def __init__ ( self ) :
        self.TIME = True
    def solve ( self ) :
        self.M = 10007
    def write ( self , o ) :
        self.n , self.m = ( self.time ( ) - self.time ( ) ) * 1e-3
        self.sys.stderr.write ( "%03d/%03d %.3f/%.3f" % ( o , self.on , t / ( self.o - 1 ) * self.on ) )
        self.sys.stdout.flush ( )
    def debug ( * os ) :
        print ( deepcopy ( os ) )
    def run ( self ) :
        self.sys.stderr.write ( "%s: %s\n" % ( self.n , self.m ) )
    crt = { }
    s = ""
    for i in range ( self.m ) :
        s += "a"
    crt [ s ] = 1
    for i in range ( self.n ) :
        for j in range ( self.m ) :
            next = { }
            for k , v in crt.items ( ) :
                if self.cs [ i ] [ j ] == "." :
                    for c in ch [ j ] if c == "z" or ( j == 0 or self.cs [ i ] [ j ] >= self.ch [ j - 1 ] ) :
                        ch [ j ] = c
                        self.add ( next , str ( ch ) , v )
                else :
                    if self.cs [ i ] [ j ] >= self.ch [ j ] and ( j == 0 or self.cs [ i ] [ j ] >= self.ch [ j - 1 ] ) :
                        ch [ j ] = self.cs [ i ] [ j ]
                        self.add ( next , str ( ch ) , v )
            crt = next
    res = 0
    for i in crt.values ( ) :
        res = ( res + i ) % M
    print ( res )
