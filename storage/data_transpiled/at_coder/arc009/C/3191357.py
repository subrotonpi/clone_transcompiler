def _import ( ) : return next ( iter ( sys.stdin.readline ( ) ) )
import sys
import os
import sys
import string
import string
import int
import sys
import random
import random
import sys
MOD = 1_777_777_777
def _import choice
choice = [ choice , random.choice ]
def _choice ( ) :
    fc = random.choice
    N = int ( choice )
    K = int ( choice )
    print ( solve ( ) )
    return int ( int ( comb ( N , K ) * montmort ( K ) ) % MOD )
def _comb ( n , k ) :
    if k > n - k :
        k = int ( n - k )
    if k == 0 :
        return 1
    a = 1
    for i in range ( k ) :
        a = a * ( ( n - i ) % MOD ) % MOD
    b = pow ( _fact ( k ) , MOD - 2 )
    return int ( a * b % MOD )
def _fact ( n ) :
    ret = 1
    for i in range ( 2 , n + 1 ) :
        ret = ret * i % MOD
    return int ( ret )
def _montmort ( n ) :
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
def _pow ( base , exp ) :
    if exp == 0 :
        return 1
    ans = 1
    base %= MOD
    while exp > 0 :
        if exp & 1 == 1 :
            ans = ans * base % MOD
        base = int ( int ( base ) * base % MOD )
        exp = exp >> 1
    return int ( ans )
from itertools import repeat
return repeat ( _choice ( ) )
