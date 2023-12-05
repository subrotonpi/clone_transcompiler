def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
    def __getitem__ ( self , x ) :
        self.x = x
    def __init__ ( self , x ) :
        self.c = [ ]
        L , Q = [ x [ i ] for i in range ( N ) ]
        idx = 0
        while idx < N and x [ idx ] - x [ 0 ] <= L :
            idx += 1
        if idx == N :
            for i in range ( Q ) :
                print ( 1 )
            return
        self.c.append ( [ 0 , idx - 1 ] )
        for i in range ( 1 , N ) :
            while idx < N and x [ idx ] - x [ i ] <= L :
                idx += 1
            if idx == N :
                while i < N :
                    self.c [ 0 , i ] = N - 1
                    i += 1
            else :
                self.c [ 0 , i ] = idx - 1
        for i in range ( 1 , 20 ) :
            for j in range ( N ) :
                self.c [ i ] [ j ] = self.c [ i - 1 ] [ self.c [ i - 1 ] [ j ] ]
        for i in range ( Q ) :
            A , B = _main ( self , x )
            if A > B :
                C = A
                A , B = B , C
            print ( self.calc ( A , B ) )
    def calc ( self , A , B ) :
        idx = 0
        while self.c [ idx ] [ A ] < B :
            idx += 1
        if idx == 0 :
            return 1
        else :
            return ( 1 << ( idx - 1 ) ) + self.calc ( self.c [ idx - 1 ] [ A ] , B )
