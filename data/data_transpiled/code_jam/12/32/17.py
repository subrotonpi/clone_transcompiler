def _import ( ) : return
class B ( object ) :
    def __init__ ( self ) :
        self.D = float ( 'inf' )
        self.N , self.A = 0 , 0 , 0
    def __init__ ( self , D ) :
        self.D = float ( 'inf' )
        self.N = self.N
        self.A = float ( 'inf' )
        self.t = [ ]
        self.x = [ ]
        self.a = [ ]
        self.A = [ ]
        def solve1 ( a ) :
            opt = math.sqrt ( ( 2 * self.D ) / ( a ) )
            return opt
        def solve2 ( a ) :
            opt0 = math.sqrt ( ( 2 * self.D ) / ( a ) )
            if self.x >= self.D :
                opt = opt0
            else :
                car = ( self.D - self.x ) * self.t [ 1 ] / ( self.x [ 1 ] - self.x [ 0 ] )
                if car <= opt0 :
                    opt = opt0
                else :
                    opt = car
            return opt
        def solve ( self ) :
            return ''
        def answer ( self ) :
            if self.N == 1 :
                opt = solve1 ( self.a )
            else :
                opt = solve2 ( self.a )
            answer += '\n' + '%.8f' % opt
            return answer
    def main ( self , args ) :
        be = open ( 'B-small.in' , 'r' )
        ki = open ( 'B-small.out' , 'w' )
        self.T = len ( be.readlines ( ) )
        be.close ( )
        for i in range ( 1 , T + 1 ) :
            self.D = be.read ( )
            self.N = be.read ( )
            self.A = be.read ( )
            for j in range ( self.N ) :
                self.t [ j ] = be.read ( )
                self.x [ j ] = be.read ( )
            for j in range ( self.A ) :
                self.a [ j ] = be.read ( )
            