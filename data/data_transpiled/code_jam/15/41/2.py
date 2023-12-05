def _solve ( ) : return int ( next ( iter ( sys.stdin.readline ( ) ) ) )
class A :
    def __init__ ( self ) :
        self.n = randint ( 1 , 10000 )
        self.m = randint ( 1 , 10000 )
        self.dir = [ ]
        for s in next ( iter ( sys.stdin.readline ( ) ) ) :
            for i in range ( m ) :
                self.dir [ i ] [ i ] = '^v<>'.index ( s [ i ] )
        self.dx = [ 0 , 0 , - 1 , 1 ]
        self.dy = [ - 1 , 1 , 0 , 0 ]
        res = 0
        for i in range ( n ) :
            for j in range ( m ) :
                if self.dir [ i ] [ j ] in dir :
                    d = self.dir [ i ] [ j ]
                    if not go ( n , m , self.dir , self.dx [ d ] , self.dy [ d ] , i , j ) :
                        ok = 0
                        for dd in range ( 4 ) :
                            if go ( n , m , self.dir , self.dx [ dd ] , self.dy [ dd ] , i , j ) :
                                ok = 1
                        if ok :
                            res += 1
                        else :
                            return 'IMPOSSIBLE'
        return '' , res
    def go ( self , n , m , self , dir , dx , dy , i , j ) :
        ii = i + self.dy
        jj = j + self.dx
        while ii >= 0 and ii < n and jj >= 0 and jj < m :
            if self.dir [ ii ] [ jj ] in dir :
                return True
            ii += self.dy
            jj += self.dx
        return False
    def solve ( self ) :
        n = randint ( 1 , 10000 )
        for i in range ( n ) :
            res = _solve_test ( )
            print ( "Case #%d: %s" % ( i + 1 , res ) )
            print ( "Case #%d: %s" % ( i + 1 , res ) )
        return res
