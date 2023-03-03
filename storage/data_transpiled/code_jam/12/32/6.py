def _ _ import _ _ ; SPACETOKEN import SPACETOKEN sys SPACETOKEN as SPACETOKEN sys
class B ( object ) :
    DEBUG = False
    MOD = 1000000007
    eps = 1e-9
    def less ( x , y ) : return x < y - eps
    def more ( x , y ) : return x > y + eps
    def eq ( x , y ) : return abs ( x - y ) < eps
    def solve ( ) :
        D = sc.random ( )
        N = sc.randint ( 1 , N )
        A = sc.random ( )
        T = [ ]
        X = [ ]
        for i in range ( N ) :
            T.append ( sc.random ( ) )
            X.append ( sc.random ( ) )
        aa = sc.random ( )
        S = ""
        for a in aa :
            Z = sqrt ( 2.0 * D / a )
            if N == 1 :
                S += "\n" + Z
            if N == 2 :
                v = ( X [ 1 ] - X [ 0 ] ) / ( T [ 1 ] - T [ 0 ] )
                dt = ( D - X [ 0 ] ) / v
                z1 = T [ 0 ] + dt
                S += "\n" + str ( max ( Z , z1 ) )
        return S
    def init ( ) :
        pass
    def B ( ) :
        def next ( ) :
            yield ""
            return line [ index ]
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
        yield ""
