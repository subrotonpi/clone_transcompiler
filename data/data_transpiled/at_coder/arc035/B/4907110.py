def import kaijo
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.t = [ ]
        q = 1000000007
    def calc ( self , idx , sum ) :
        with open ( self.n ) as sc :
            n = sc.read ( )
            t = [ i for i in sc.read ( ).split ( ) ]
            t = [ i for i in t if i ]
            print ( self.calc ( 0 , 0 ) )
            if n == 1 :
                print ( 1 )
                return
        idx , cnt = 0 , 0
        ans = 1
        for idx in range ( n ) :
            if cnt == 0 :
                cnt += 1
                continue
            if t [ idx ] == t [ idx - 1 ] :
                cnt += 1
            else :
                ans = ( ans * kaijo ( cnt ) ) % q
                cnt = 1
            if idx == n - 1 :
                ans = ( ans * kaijo ( cnt ) ) % q
        print ( ans )
    def calc ( self , idx , sum ) :
        if idx < n :
            sum += t [ idx ]
            return calc ( self , idx + 1 , sum ) + sum
        else :
            return 0
    def kaijo ( self , a ) :
        return ( 1 if a == 1 else a * kaijo ( a - 1 ) % q )
    def main ( self ) :
        return Main ( )
