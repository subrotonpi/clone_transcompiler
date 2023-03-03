def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.M = _main.get ( 'N' , 0 ) , _main.get ( 'M' , 0 )
    def main ( self ) :
        sc = _main.get ( 'sc' , 0 )
        self.N = sc.N
        self.M = sc.M
        for b in [ 0 , 1 ] :
            for a in range ( 0 , N - b ) :
                if a * 2 + b * 3 + ( N - a - b ) * 4 == self.M :
                    ans = "%d %d %d" % ( a , b , N - a - b )
        print ( ans )
