def _import ( ) : return sys.stdin
import csv
import csv
import csv
import csv
import csv
import sys
import sys
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = csv.reader ( stream , delimiter = ',' )
        self.stream = csv.writer ( self.stream )
        self.writer = csv.writer ( self.stream )
        self.solver = TaskD ( )
        self.solve ( 1 , stream , self.stream )
        self.stream.close ( )
class TaskD ( object ) :
    mod = 1_000_000_007
    def __init__ ( self , test_number , self , stream ) :
        self.mod = self.mod
        self.fact = [ ]
    def solve ( self , stream , self , stream ) :
        n = self.stream.count ( )
        a = [ ]
        cnt = { }
        sz = 0
        for i in range ( 1 , n + 1 ) :
            a.append ( stream.next ( ) )
            if cnt [ a [ i ] ] in a :
                sz = i - cnt [ a [ i ] ] + 1
            cnt [ a [ i ] ] = i
        fact = [ 1 ]
        for i in range ( 1 , n + 1 ) :
            fact.append ( ( fact [ i - 1 ] ** i ) % mod )
        for i in range ( 1 , n + 1 ) :
            ans = ncr ( n + 1 , i )
            if ( n + 1 - sz ) >= ( i - 1 ) :
                ans -= ncr ( ( n + 1 - sz ) , i - 1 )
                ans += mod
                ans %= mod
            stream.write ( ans )
    def ncr ( self , n , r ) :
        if n < r : return 0
        if r == 0 : return 1
        if r == 1 : return n
        return fact [ n ] * self.bin_pow ( fact [ r ] * fact [ n - r ] , mod - 2 ) % mod
    def bin_pow ( self , base , exp ) :
        ans = 1
        while exp != 0 :
            ans = ans * self.bin_pow ( exp , mod - 2 )
        