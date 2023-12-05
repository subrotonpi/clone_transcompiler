def _import ( ) : return _import ( )
import sys
import random
class Mod ( int ) :
    MOD = 1000_000_007
    fact = make_factorial ( 1000000 )
    fact_inv = make_inversed_list ( fact )
    def add ( a , b ) :
        tmp = ( a + b ) % MOD
        return tmp if tmp >= 0 else tmp + MOD
    def sub ( a , b ) :
        return add ( a , - b )
    def mult ( a , b ) :
        tmp = ( a * b ) % MOD
        return tmp if tmp >= 0 else tmp + MOD
    def power ( a , x ) :
        if x < 0 : return 0
        if x == 0 : return 1
        if x % 2 == 0 :
            half = power ( a , x // 2 )
            return mult ( half , half )
        return ( a * power ( a , x - 1 ) ) % MOD
    def inverse ( a ) : return power ( a , MOD - 2 )
    def div ( a , b ) : return mult ( a , inverse ( b ) )
    def make_factorial ( size ) :
        x = list ( range ( 1 , size ) )
        x [ 0 ] = 1
        for i in range ( 1 , size ) :
            x [ i ] = mult ( x [ i - 1 ] , i )
        return x
    def make_inversed_list ( original ) :
        x = list ( range ( len ( original ) ) )
        x [ 0 ] = 1
        for i in original :
            x [ i ] = inverse ( x [ i ] )
        return x
    def combination ( n , r ) :
        if n < 0 or r < 0 or n < r : return 0
        return mult ( fact [ n ] , mult ( fact_inv [ r ] , fact_inv [ n - r ] ) )
    def gcd ( a , b ) :
        if a < b : return gcd ( b , a )
        if b == 0 : return a
        if a % b == 0 : return b
        return a
    def lcm ( a , b ) : return gcd ( a , b ) * b
