def import _readline
import readline
import readline
import readline
import sys
import random
import time
MOD = 1000000007
def main ( ) :
    sc = readline.get_scanner ( )
    n , m = sc.randint ( 0 , n )
    fs = [ sc.randint ( 0 , m - 1 ) for i in range ( n ) ]
    solve ( )
    dp = [ 1 ] * ( n + 1 )
    tastes = [ 0 ] * ( m + 1 )
    left = 0
    sum = dp [ 0 ]
    for i in range ( n ) :
        tastes [ fs [ i ] ] += 1
        while tastes [ fs [ i ] ] > 1 :
            tastes [ fs [ left ] ] -= 1
            sum -= dp [ left ]
            left += 1
            sum = ( sum + MOD ) % MOD
        dp [ i + 1 ] = sum
        sum += dp [ i + 1 ]
        sum %= MOD
    print ( dp [ n ] )
class Fastreadline :
    def __init__ ( self , f ) :
        readline.__init__ ( self )
        self.f = f
        self.tokens = [ ]
    def readline ( self ) :
        while not self.tokens or not self.tokens :
            try :
                del self.tokens [ - 1 ]
            except IndexError :
                pass
        return self.tokens [ 0 ]
    def randint ( self ) :
        return int ( self.tokens [ 0 ] )
    def long ( self ) :
        return long ( self.tokens [ 0 ] )
    def double ( self ) :
        return float ( self.tokens [ 0 ] )
    def readline ( self ) :
        data = ''
        try :
            data = readline.readline ( )
        except EOFError :
            pass
        return data
