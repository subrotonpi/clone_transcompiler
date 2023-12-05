def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def main ( self ) :
        sc = _main ( )
        k = sc.count ( )
        prev_a = 0
        a = 1
        prev_b = 1
        b = 1
        for i in range ( 2 , k + 1 ) :
            ta = prev_a + a
            tb = prev_b + b
            prev_a = a
            a = ta
            prev_b = b
            b = tb
        print ( a , b )
