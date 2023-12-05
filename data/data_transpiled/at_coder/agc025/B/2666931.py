def _import ( ) : return _sys.stdin.readline ( )
import readline
import sys
import os
import sys
class Main ( ) :
    def next ( ) :
        while not sys.stdin.readline ( ) or not sys.stdin.readline ( ) :
            try :
                sys.stdin.readline ( )
            except EOFError :
                pass
        return int ( sys.stdin.readline ( ) )
    def next ( ) :
        return float ( sys.stdin.readline ( ) )
    def next ( ) :
        sc = readline.readline ( )
        n , a , b , k = sc.next ( )
        solve ( )
    def solve ( ) :
        c = Combination ( 300000 , MOD )
        ans = 0
        for i in range ( 0 , n + 1 ) :
            if k < a * i : break
            if ( k - a * i ) % b == 0 :
                jl = ( k - a * i ) // b
                if jl > n :
                    continue
                j = int ( jl )
                ans += c.comb ( n , i ) * c.comb ( n , j ) % MOD
                ans %= MOD
        print ( ans )
    class Combination ( ) :
        def __init__ ( self , max , mod ) :
            self.mod = mod
            self.facts = [ ]
            self.invs = [ ]
            self.inv_facts = [ ]
        def comb ( self , n ) :
            self.facts.append ( int ( self.facts [ n ] ) )
            self.inv_facts.append ( int ( self.inv_facts [ n ] ) )
        def comb ( self , n ) :
            if self.k < 0 or self.k > n : return 0
            return self.facts [ n ] * self.inv_facts [ self.k ] % mod * int ( self.inv_facts [ self.k ] )
