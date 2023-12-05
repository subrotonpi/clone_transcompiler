def _import ( ) : return [ int ( x ) for x in range ( 0 , len ( x ) ) ]
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.M = 0
        self.F = [ ]
        self.MOD = 1_000_000_007
    def main ( self ) :
        sc = FastScanner ( )
        self.N = sc.nextInt ( )
        self.M = sc.nextInt ( )
        self.F = sc.nextIntArray ( N )
        print ( self.solve ( ) )
    def solve ( self ) :
        dp = [ ]
        rui = [ ]
        next = [ ]
        for i in range ( self.M + 1 ) :
            if i == 0 :
                break
            else :
                dp.append ( 1 )
                div = self.N
                rui.append ( 1 )
                for i in range ( self.N - 1 , - 1 , - 1 ) :
                    flavor_next = next [ self.F [ i ] ]
                    if flavor_next != - 1 and flavor_next < div :
                        div = flavor_next
                dp.append ( ( rui [ i + 1 ] - rui [ div + 1 ] + self.MOD ) % MOD )
                next [ self.F [ i ] ] = i
                rui.append ( ( dp [ i ] + rui [ i + 1 ] ) % MOD )
        return dp
    @ staticmethod
    def readline ( ) :
        if not isinstance ( readline , list ) or not isinstance ( readline , tuple ) :
            try :
                readline = readline ( )
            except EOFError :
                pass
        return readline ( )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        return next ( )
    def __next__ ( self ) :
        return int ( next ( ) )
