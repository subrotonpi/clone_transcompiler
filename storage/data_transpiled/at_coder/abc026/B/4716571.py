def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.PI = 3.1415926535
    def __call__ ( self , * args ) :
        sc = _main.raw_input ( )
        N = sc.__next__ ( )
        lst = [ ]
        for i in range ( N ) :
            R = sc.__next__ ( )
            lst.append ( R )
        lst.sort ( key = lambda x : x [ 1 ] )
        ans = 0
        for i in range ( N ) :
            if i % 2 == 0 :
                ans += PI * lst [ i ] ** 2
            else :
                ans -= PI * lst [ i ] ** 2
        print ( ans )
