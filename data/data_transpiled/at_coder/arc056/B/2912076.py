def _ _ new _ _ ( ) : return findSet ( x ) == findSet ( y )
def get_size ( x ) : return cnt [ findSet ( x ) ]
class P ( Comparable ) :
    def __init__ ( self , f , t ) :
        self.f = f
        self.t = t
    def __init__ ( self , o ) :
        self.f = o.f
        self.t = o.t
    def make_set ( self , x ) :
        self.f = x
        self.rank = [ ]
        self.cnt = [ ]
        for j in range ( self.size ) :
            self.make_set ( j )
    def link ( self , x ) :
        self.rank [ x ] = 1
    def randint ( self , y ) :
        self.rank [ x ] = y
    def randint ( self , y ) :
        self.rank [ x ] = y
    def uniform ( self , x ) :
        self.rank [ x ] += 1
    def uniform ( self , y ) :
        return float ( self.rank [ x ] )
    def next_arange ( self , n ) :
        res = [ ]
        for i in range ( self.n ) :
            res.append ( randint ( self , x ) )
        return res
    def next_intarray_dec ( self , n ) :
        res = [ ]
        for i in range ( self.n ) :
            res.append ( randint ( self , n ) )
        return res
    def next_intarray_dec ( self , n ) :
        res = [ ]
        for i in range ( self.n ) :
            res.append ( randint ( self , n ) )
        return res
    def next_intarray_dec ( self , n ) :
        res = [ ]
        for i in range ( self.n ) :
            res.append ( randint ( self , n ) )
        return res
    def make_set ( self , x ) :
        self.f = x
        self.t = x
        self.cnt = [ ]
        return [ ]
