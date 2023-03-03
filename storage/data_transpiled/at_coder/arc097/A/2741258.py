def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = 0 , 0
        self.a = [ ]
        self.mod_P = 1000000007
    def main ( self ) :
        with open ( self.n ) as infile :
            s = infile.read ( )
        self.k = self.k
        self.seen = set ( )
        pq = [ ]
        s = [ ]
        for i in range ( len ( s ) ) :
            lim = i + k + 1 if i + k + 1 < len ( s ) + 1 else len ( s ) + 1
            for j in range ( i + 1 , lim ) :
                sub = s [ i : j ]
                if sub not in self.seen :
                    pq.append ( sub )
                    self.seen.add ( sub )
        for i in range ( k - 1 ) :
            pq.pop ( )
        print ( pq.peek ( ) )
    def print ( self ) :
        print ( self.s )
    def print ( self ) :
        print ( self.i )
class P ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
class E ( object ) :
    def __init__ ( self , l , r , d ) :
        self.l = l
        self.r = r
        self.d = d
return Main
