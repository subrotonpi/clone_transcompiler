def _import ( ) : return sys.maxsize
import struct
class Pair :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
class DisjointSet ( object ) :
    def __init__ ( self , n ) :
        self.parent , self.size = [ ] , [ ]
        for i in range ( n + 1 ) :
            self.parent.append ( i )
            self.size.append ( 1 )
    def find ( u ) :
        if u == self.parent [ u ] : return u
        return self.parent [ u ] = find ( self.parent [ u ] )
    def merge ( u , v ) :
        u , v = find ( u ) , find ( v )
        if u == v : return - 1
        a , b = long ( self.size [ u ] ) , long ( self.size [ v ] )
        self.parent [ u ] = v
        self.size [ v ] += self.size [ u ]
        self.size [ u ] = 0
        return a * ( a - 1 ) / 2 + b * ( b - 1 ) / 2
    def get_size ( self ) :
        u = find ( u )
        return self.size [ u ]
class Main ( object ) :
    def __init__ ( self ) :
        s = open ( "/proc/sys/stdin" )
        n , m = s.readline ( ).split ( )
        edges = [ ]
        ans = [ ]
        for u , v in s.readlines ( ) :
            edges.append ( ( u , v ) )
        incon = long ( n ) * ( long ( n ) - 1 ) / 2
        dsu = DisjointSet ( n + 1 )
        for i in range ( m ) :
            ans.append ( incon )
            edge = edges [ m - i - 1 ]
            tmp = long ( dsu.merge ( edge [ 0 ] , edge [ 1 ] ) )
            if tmp == - 1 : continue
            incon += tmp
            size = long ( dsu.get_size ( edge [ 0 ] ) )
            self.size = size
return Main ( )
