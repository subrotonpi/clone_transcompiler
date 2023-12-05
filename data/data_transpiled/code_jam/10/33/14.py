def main ( args ) :
    import sys
    import struct
    class MainAza ( object ) :
        def __init__ ( self ) :
            self.A , self.N , self.M , self.D = struct.unpack ( '>i' , sys.stdin.read ( 4 ) )
        def encode ( C ) :
            self.T = struct.unpack ( '>i' , C ) [ 0 ]
            if self.C <= '9' : h = C - 'A' + 10
            for i in range ( self.N ) :
                self.A [ i ] = self.A [ i ] [ j ] ^ ( ( i + j ) % 2 )
        def check ( self , x , y ) :
            for i in range ( self.N - self.N + 1 ) :
                if self.A [ i ] [ j ] < self.check ( x , y ) : return False
            return True
        def check ( self , x , y ) :
            self.A = [ self.A [ i ] [ j ] for j in range ( self.M - self.N + 1 ) ]
            self.N = self.N
            self.M = self.N
            self.A = [ self.A [ i ] [ j ] for j in range ( self.M // 4 ) ]
            self.D = [ self.D [ i ] [ j ] for j in range ( self.N ) ]
    a = min ( self.N , self.M )
    all = self.N * self.M
    found = 0
    for a in range ( self.N ) :
        flag = search ( a )
        if flag : found += 1
        else :
            if found :
                self.X.append ( ( a , found ) )
                all -= self.a * self.found
            a -= 1
            found = 0
    if all :
        self.X.append ( ( 1 , all ) )
    print ( "Case #%d: %d\n" % ( self.t + 1 , len ( self.X ) ) )
    for i in range ( self.N ) :
        print ( "%d %d\n" % ( self.A [ i ] [ i ] , self.n ) )
        