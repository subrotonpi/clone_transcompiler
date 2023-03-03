def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = int ( sc.readline ( ) )
        s = sc.readline ( ).split ( )
        self.set = set ( )
        for i in range ( N ) :
            A = int ( s [ i ] )
            while A % 2 == 0 :
                A /= 2
            self.set.add ( A )
        print ( len ( self.set ) )
