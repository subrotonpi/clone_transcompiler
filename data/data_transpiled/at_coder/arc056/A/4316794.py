def import import min
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def run ( self ) :
        sc = Scanner ( )
        a = sc.next ( )
        b = sc.next ( )
        k = sc.next ( )
        l = sc.next ( )
        if a * l <= b :
            total = a * k
        else :
            total = min ( ( k / l ) * b + ( k % l ) * a , ( k / l + 1 ) * b )
        print ( total )
