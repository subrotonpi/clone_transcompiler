def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ans , self.s = '' , ''
    def main ( self ) :
        sc = _main ( self )
        k , s = sc.split ( )
        ans = 0
        for i in range ( 0 , k ) :
            for j in range ( 0 , k ) :
                z = s - i - j
                if 0 <= z <= k :
                    ans += 1
        print ( ans )
