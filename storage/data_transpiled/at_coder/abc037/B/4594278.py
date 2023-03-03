def _import ( ) : return x & ( - x )
class Main ( object ) :
    def __init__ ( self , c ) :
        self.c = [ ]
        self.n = n
    def lowbit ( self , x ) :
        return x & ( - x )
    def add ( self , i , val ) :
        while self.n <= self.n :
            self.c [ self.n ] += val
            self.n += lowbit ( self.n )
    def sum ( self , i ) :
        sum = 0
        while self.n > 0 :
            sum += self.c [ i ]
            self.n -= lowbit ( self.n )
        return sum
    def main ( ) :
        f = open ( "/proc/self/" , "r" )
        n , p = f.readline ( ).split ( )
        c = [ ]
        while p :
            l , r , k = f.readline ( ).split ( )
            [ c.append ( l - 1 ) , r , k ] = f.readline ( ).split ( )
        for i in c :
            print ( i )
