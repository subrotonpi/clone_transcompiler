def import Scanner , Printer , *
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.pr = Printer ( sys.stdout )
        self.solve ( )
    def solve ( self ) :
        n = self.sc.nextInt ( )
        k = self.sc.nextInt ( )
        dp = [ [ 1 ] * ( k + 1 ) for i in range ( 0 , k + 1 ) ]
        dp2 = [ [ 1 ] * ( k + 1 ) for i in range ( 0 , n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            p = float ( 1 ) / ( n - i + 1 )
            for j in range ( 0 , k + 1 ) :
                dp [ j ] [ i ] = dp [ j ] [ i - 1 ] * ( 1 - p )
                dp2 [ j ] [ i ] = dp2 [ j ] [ i - 1 ] * ( 1 - p )
                tmp = 0
                if j > 0 :
                    tmp = dp2 [ j - 1 ] [ i - 1 ] * p
                else :
                    pass
                dp [ j ] [ i ] += max ( tmp , dp [ j ] [ i - 1 ] * p )
                dp2 [ j ] [ i ] += max ( tmp , dp [ j ] [ i - 1 ] * p )
        self.pr.write ( "%.7f\n" % dp [ k ] [ n ] )
    def main ( self ) :
        sc = Scanner ( )
        pr = Printer ( sys.stdout )
        self.solve ( )
        self.pr.close ( )
        sc.close ( )
    class Printer ( PrintWriter ) :
        def __init__ ( self ) :
            Printer ( self )
