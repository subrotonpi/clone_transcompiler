def import _solve
class Solver :
    def __init__ ( self , x ) :
        self.x = x
        self.cache = [ [ - 1 for i in range ( 64 ) ] for j in range ( 64 ) ]
    def count ( index , rest , target ) :
        if self.cache [ index ] [ rest ] [ target ] >= 0 :
            return self.cache [ index ] [ rest ] [ target ]
        if rest == 0 and target > 0 :
            self.cache [ index ] [ rest ] [ target ] = 0
            return self.cache [ index ] [ rest ] [ target ]
        if rest == 0 and target == 0 :
            self.cache [ index ] [ rest ] [ target ] = 1
            return self.cache [ index ] [ rest ] [ target ]
        if len ( x ) - index < rest :
            self.cache [ index ] [ rest ] [ target ] = 0
            return self.cache [ index ] [ rest ] [ target ]
        self.cache [ index ] [ rest ] [ target ] = 0
        for i in range ( index , len ( x ) ) :
            if target - x [ i ] < 0 :
                continue
            self.cache [ index ] [ rest ] [ target ] += count ( i + 1 , rest - 1 , target - x [ i ] )
        return self.cache [ index ] [ rest ] [ target ]
    def solve ( a ) :
        sum = 0
        for i in range ( 1 , len ( x ) + 1 ) :
            sum += count ( 0 , i , a * i )
        return sum
class Main ( object ) :
    def __init__ ( self ) :
        s = raw_input ( )
        n , a = s.split ( " " )
        x = [ s.strip ( ) for s in x ]
        solver = Solver ( x )
        print ( solver.solve ( a ) )
