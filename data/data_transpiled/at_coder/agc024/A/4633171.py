def _import ( ) : return _import ( )
import collections
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Queue
import Map
import OrderedDict
import Comparator
class Main :
    def __init__ ( self ) :
        self.mod = 1000000007
        self.size = 510000
        self.size = self.size
        self.size = self.size
        self.size = self.size
    def __init__ ( self , a , val ) :
        self.size = self.size
        self.size = self.size
    def unite ( self , x , y ) :
        self.size = self.size
        self.size = self.size
    def same ( self , x ) :
        return self.size
    def pow ( self , x , n ) :
        ans = 1
        while n > 0 :
            if self.n & 1 == 1 :
                ans = ans * x
                ans %= mod
            x = self.size * x % mod
            n >>= 1
        return ans
    def init_comb ( self ) :
        self.fac = self.finv [ 0 ] = self.inv [ 1 ] = self.inv [ 1 ] = 1
        for i in range ( 2 , self.size ) :
            self.fac [ i ] = self.fac [ i - 1 ] * i % mod
            self.inv [ i ] = self.mod - ( self.mod / i ) * self.inv [ int ( self.mod % i ) ] % mod
            self.finv [ i ] = self.finv [ i - 1 ] * self.inv [ i ] % mod
    def fact ( self , n ) :
        return self.fac [ n ] * self.finv [ k ] % mod * self.finv [ n - k ] % mod
