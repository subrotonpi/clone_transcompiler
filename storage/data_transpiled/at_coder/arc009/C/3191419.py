def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import sys
import time
MOD = 1_777_777_777
def main ( ) :
    fc = readline.readline
    N = fc ( )
    K = fc ( )
    N %= MOD
    print ( solve ( ) )
def solve ( ) :
    return int ( int ( comb ( N , K ) * montmort ( K ) ) % MOD )
def comb ( n , k ) :
    if k > n - k :
        k = int ( n - k )
    if k == 0 :
        return 1
    a = 1
    for i in range ( k ) :
        a = a * ( ( n - i ) % MOD ) % MOD
    b = pow ( fact ( k ) , MOD - 2 )
    return int ( a * b % MOD )
def fact ( n ) :
    ret = 1
    for i in range ( 2 , n + 1 ) :
        ret = ret * i % MOD
    return int ( ret )
def montmort ( n ) :
    if n == 1 :
        return 0
    if n == 2 :
        return 1
    m1 = 1
    m2 = 0
    m = - 1
    for i in range ( 3 , n + 1 ) :
        m = ( i - 1 ) * ( m1 + m2 ) % MOD
        m2 = m1
        m1 = m
    return int ( m )
def pow ( base , exp ) :
    if exp == 0 :
        return 1
    ans = 1
    base %= MOD
    while exp > 0 :
        if exp & 1 == 1 :
            ans = ans * base % MOD
        base = int ( long ( base ) * base % MOD )
        exp = exp >> 1
    return int ( ans )
from readline.readline import readline
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
from readline.parse_and_bind import parse_and_bind
