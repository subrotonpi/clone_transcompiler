def _import ( ) : return _raw_input
import sys
import os
import sys
import os
import __builtin__
import __builtin__
import sys
class Main ( ) :
    MOD = 1000000007
    def __init__ ( self ) :
        sc = sys.stdin
        A = sc.randint ( 0 , 100 )
        B = sc.randint ( 0 , 100 )
        C = sc.randint ( 0 , 100 )
        div = _inverse ( get_mod ( A * ( B + C ) - B * C ) )
        c = get_mod ( get_mod ( B * ( C - A ) ) * div )
        r = get_mod ( get_mod ( C * ( B - A ) ) * div )
        self.pl ( "%s %s" % ( r , c ) )
    def get_power ( a , n ) :
        if n == 0 :
            return 1
        elif n % 2 == 0 :
            return get_power ( get_power ( a ** a ) , n // 2 )
        else :
            return get_power ( a * get_power ( a , n - 1 ) )
    def get_inverse ( a ) :
        return get_power ( a , MOD - 2 )
    def get_mod ( a ) :
        if a >= 0 :
            return a % MOD
        else :
            return MOD + a % MOD
    def pl ( x ) :
        print ( x )
    def pl ( ) :
        print ( )
    def p ( x ) :
        print ( x , end = '' )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = [ ]
                except IndexError :
                    raise __builtin__
            return self.tokens [ 0 ]
        def randint ( self ) :
            return int ( self.tokens [ 1 ] )
        def long ( self ) :
            return long ( self.tokens [ 1 ] )
        def uniform ( self , self , size ) :
            return uniform ( size , size )
return Main ( )
