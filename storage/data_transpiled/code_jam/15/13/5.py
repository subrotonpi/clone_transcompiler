def _ ( ) : return np.array ( [ [ - 1 , - 1 ] , [ - 1 , - 1 ] , [ 1 , 1 ] , [ 1 , 1 ] , [ 1 , 1 ] ] )
class C ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
        self.T = self.T
        for zz in range ( 1 , T + 1 ) :
            self.N = self.N
            P = [ Point ( self.x , self.y ) for self in self.P ]
            print ( "Case #%d:\n" % self.zz )
            for i in range ( self.N ) :
                R = [ ]
                for j in range ( self.N ) :
                    if j == i :
                        continue
                    R.append ( P [ j ].sub ( P [ i ] ) )
                R.sort ( )
                for j in range ( self.N - 1 ) :
                    R.append ( R [ j ] )
                ans = self.N - 1
                end = 1
                for j in range ( self.N - 1 ) :
                    while end < j + self.N - 1 :
                        ccw , dot = R [ end ].dot ( R [ j ].rotate ( ) )
                        if ccw < 0 :
                            break
                        if ccw == 0 :
                            if dot < 0 :
                                break
                            if end >= self.N - 1 :
                                break
                        end += 1
                ans = min ( ans , end - self.N - 1 )
            if ans == self.N :
                print ( self.N , " ".join ( P ) )
                raise
            print ( "%d\n" % ans )
    eps = 1e-12
    def eq ( a , b ) :
        return abs ( a - b ) < eps
    class Point ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def sub ( self , p ) :
            return Point ( self.x , self.y )
    return C
