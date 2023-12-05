def import java.io.BufferedReader , os , sys , re , p , n , rank , count , count , count , args , text , count , ** kwargs ) :
    from io import BufferedReader , InputStreamReader
    from io import BufferedReader , BufferedReader
    from io import BufferedReader , BufferedReader
    from io import BufferedReader , BufferedReader
    class Main :
        def __init__ ( self , n ) :
            self.par = [ ]
            self.rank = [ ]
            for i in range ( n ) :
                self.par.append ( i )
                self.rank.append ( 1 )
        def find ( x ) :
            if x == self.par [ x ] :
                return x
            else :
                return self.par [ x ] = self.find ( x )
        def unite ( self , x , y ) :
            x = self.find ( x )
            y = self.find ( y )
            if x != y :
                if self.rank [ x ] < self.rank [ y ] :
                    self.par [ x ] = y
                else :
                    self.par [ y ] = x
                    if self.rank [ x ] == self.rank [ y ] :
                        self.rank [ x ] += 1
        def same ( self , x , y ) :
            return self.find ( x ) == self.find ( y )
        def count ( self ) :
            ret = 0
            for i in self.par :
                if i == self.find ( i ) :
                    ret += 1
            return ret
    def main ( ) :
        data = BufferedReader ( open ( "/proc/" + str ( n ) + "/" ) ).read ( ).split ( )
        n , m = map ( int , data )
        unif = UnionFind ( )
        unif.__init__ ( n )
        for i in range ( m ) :
            data = BufferedReader ( open ( "/proc/" + str ( n ) + "/" ) ).read ( ).split ( )
            a = int ( data [ 0 ] ) - 1
            b = int ( data [ 1 ] ) - 1
            if not unif.same ( a , b ) :
                unif.unite ( a , b )
        print ( un@@