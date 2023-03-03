def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
        self.x = 0
        self.a = 0
        self.p = 0
        self.map = { }
    def input ( self ) :
        with open ( self.input , 'r' ) as f :
            self.N = int ( f.read ( ) )
            self.M = int ( f.read ( ) )
            self.x = int ( f.read ( ) )
            self.a = int ( f.read ( ) )
            self.p = int ( f.read ( ) )
            self.map = [ ]
            for i in range ( self.N ) :
                for j in range ( self.M ) :
                    if i == 0 and j == 0 :
                        self.map [ i ] [ j ] = x
                    else :
                        if j == 0 :
                            self.map [ i ] [ j ] = ( self.map [ i - 1 ] [ self.M - 1 ] + self.a ) % p
                        else :
                            self.map [ i ] [ j ] = ( self.map [ i ] [ j - 1 ] + self.a ) % p
    def main ( self ) :
        self.input ( )
        for i in range ( self.N ) :
            self.hashmap [ i ] = [ ]
        self.temp.sort ( )
        if self.a % self.p == 0 :
            if self.map [ 0 ] [ 1 ] >= x :
                print ( 0 )
            else :
                print ( 2 * ( self.N - 1 ) )
        else :
            ans = 0
            for i in range ( self.N ) :
                for j in range ( self.M ) :
                    col = self.temp.index ( self.map [ i ] [ j ] ) / self.M
                    ans += abs ( i - col )
                    arraylist = self.hashmap [ col ]
                    arraylist.append ( j )
                    self.hashmap [ col ] = arraylist
        for i in range ( self.N ) :
            arraylist = self.hashmap [ i ]
            count =