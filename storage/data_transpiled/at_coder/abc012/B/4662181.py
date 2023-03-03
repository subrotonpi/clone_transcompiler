def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.ans = long ( self.ans )
    def run ( self ) :
        sc = _main ( )
        self.N = sc.number
        a = N / 3600
        b = N % 3600 / 60
        c = N % 60
        print ( "%02d:%02d:%02d" % ( a , b , c ) )
        print ( )
