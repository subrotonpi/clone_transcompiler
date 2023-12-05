def import _readline
import readline
import readline
import readline
import sys
import readline
import readline
MOD = 1000000007
def main ( ) :
    sc = readline.get_scanner ( )
    a , b , c = sc.next ( ) , sc.next ( )
    solve ( )
    def solve ( ) :
        ab = a * b % MOD
        ac = a * c % MOD
        bc = b * c % MOD
        r = ( bc - ac + MOD ) % MOD * inverse ( ( ab - bc + ac + MOD ) % MOD , MOD ) % MOD
        c = ( bc - ab + MOD ) % MOD * inverse ( ( ab - bc + ac + MOD ) % MOD , MOD ) % MOD
        print ( r , c )
    def inverse ( num , mod ) :
        return pow ( num , mod - 2 , mod )
    def pow ( x , n , mod ) :
        ans = 1
        while n :
            if n & 1 == 1 :
                ans = ans * x % MOD
            x = x * x % MOD
            n >>= 1
        return ans
    class Fastreadline ( ) :
        def readline ( self ) :
            while not isinstance ( self , readline.file ) or not isinstance ( self , readline.file ) :
                try :
                    s = readline.file ( self.filename )
                except IOError :
                    pass
                else :
                    s = [ ]
            return s
        def readline ( self ) :
            while not isinstance ( self , readline.file ) or not isinstance ( self , readline.file ) :
                try :
                    s = readline.file ( self.filename )
                except IOError :
                    pass
                else :
                    s = [ ]
                return s
    return Fastreadline
