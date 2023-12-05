def _import ( ) : return _import ( )
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Set
import Map
import OrderedDict
import TreeSet
class Main ( object ) :
    def __init__ ( self , val ) :
        Scanner.open ( )
        n = self.n
        a = Queue.Queue ( )
        if a [ mid ] > val :
            return _upper_bound ( a , l , mid , val )
        else :
            return _lower_bound ( a , l , mid , val )
    def lower_bound ( self , val ) :
        if r - l == 1 :
            return r
        mid = ( l + r ) // 2
        if a [ mid ] < val :
            return _lower_bound ( a , mid , val )
        else :
            return _lower_bound ( a , l , mid , val )
class Pair ( object ) :
    def __init__ ( self , a , b ) :
        self.x , self.y = a , b
    def __eq__ ( self , other ) :
        if self is other : return True
        if not isinstance ( other , Pair ) : return False
        p = other.x
        return x == p.x and y == p.y
    def __lt__ ( self , other ) :
        return ( y == self.y ) * - 1
class UnionFind ( UnionFind ) :
    def __init__ ( self , size ) :
        self.parent = [ ]
        self.size = size
    def unite ( self , x , y ) :
        x = root ( x )
        y = root ( y )
        if x != y :
            if self.parent [ y ] < self.parent [ x ] :
                tmp = self.parent [ y ]
                self.parent [ x ] = tmp
            self.parent [ x ] += self.parent [ y ]
            self.parent [ y ] = x
            return True
        return False
    def same ( self , x , y ) :
        return root ( x ) == root ( y )
    def root ( self ) :
        return self.parent [ 0 ]
