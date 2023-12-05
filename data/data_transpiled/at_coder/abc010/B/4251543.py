def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.n = sc.nextInt ( )
        ans = 0
        for i in range ( n ) :
            a = sc.nextInt ( )
            while a % 2 != 1 or a % 3 == 2 :
                a -= 1
                ans += 1
        print ( ans )
