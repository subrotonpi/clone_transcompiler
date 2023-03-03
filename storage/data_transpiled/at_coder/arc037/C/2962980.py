def import _main
class Main ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def count ( v ) :
        res = 0
        for i in range ( self.n ) :
            l , r = - 1 , n
            while r - l > 1 :
                c = ( l + r ) // 2
                if a [ i ] * b [ c ] <= v :
                    l = c
                else :
                    r = c
            res += r
        return res
    def main ( ) :
        sc = _main ( )
        n , k = sc.regs [ 0 ]
        a = [ sc.regs [ 1 ] for i in range ( n ) ]
        b = [ sc.regs [ 2 ] for i in range ( n ) ]
        a.sort ( )
        b.sort ( )
        l , r = 0 , int ( n ) // 2
        while r - l > 1 :
            c = ( l + r ) // 2
            if count ( c ) < k :
                l = c
            else :
                r = c
        print ( r )
