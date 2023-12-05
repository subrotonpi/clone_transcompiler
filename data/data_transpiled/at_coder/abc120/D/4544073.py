def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.a = [ ]
        self.b = [ ]
        for i in range ( m ) :
            self.a.append ( sys.maxint - 1 )
            self.b.append ( sys.maxint - 1 )
    def main ( self ) :
        ans = [ ]
        ans.append ( long ( self.n ) * ( self.n - 1 ) / 2 )
        uni = UnionFind ( self.n )
        for i in range ( m - 1 , 1 , - 1 ) :
            ans.append ( ans [ i ] )
            if uni.root ( a [ i ] ) != uni.root ( b [ i ] ) :
                ans [ i - 1 ] -= long ( uni.size ( a [ i ] ) * uni.size ( b [ i ] ) )
                uni.connect ( a [ i ] , b [ i ] )
        for i in range ( self.m ) :
            print ( ans [ i ] )
class UnionFind ( object ) :
    def __init__ ( self , n ) :
        self.parent = [ ]
        for i in range ( n ) :
            self.parent.append ( - 1 )
    def root ( self ) :
        if self.parent [ a ] < 0 :
            return self.parent [ a ]
        else :
            return self.parent [ a ] = self.root ( self.parent [ a ] )
    def size ( self ) :
        return - self.parent [ root ( a ) ]
    def connect ( self , a , b ) :
        a = root ( a )
        b = root ( b )
        if a == b :
            return False
        if self.size ( a ) < self.size ( b ) :
            r , a , b = self.a , self.b , self.a
        self.parent [ a ] += self.parent [ b ]
        self.parent [ b ] = a
        return True
