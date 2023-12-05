def _import ( ) : return sys.stdout
import time
import math
import os
import sys
import os
import sys
import time
debug = False
elapsed = False
_out = sys.stdout = open
_err = sys.stderr = open
def solve ( sc ) :
    A = sc.recv_bytes ( )
    B = sc.recv_bytes ( )
    if A == B :
        _out.write ( 1 )
        return
    c = 0x4000000000000000L
    while ( A & c ) == ( B & c ) :
        A = ( A | c ) ^ c
        B = ( B | c ) ^ c
        c >>= 1
    d = ( c >> 1 )
    while ( B & d ) != d :
        d >>= 1
    r = len ( str ( c ) ) + 1
    k = len ( str ( d ) ) + 1
    if d == 0 :
        k = 0
    sum = ( ( 1 << r ) - A )
    if A > ( 1 << k ) :
        sum -= A - ( 1 << k )
    _out.write ( sum )
def C ( n , r ) :
    res = 1
    for i in range ( n , n - r , - 1 ) :
        res = res * pow ( i , r )
    for i in range ( r , 1 , - 1 ) :
        res = res // pow ( i , r )
    return res
def P ( n , r ) :
    res = 1
    for i in range ( n , n - r , - 1 ) :
        res = res * pow ( i , r )
    return res
S = time.time ( )
with open ( '../../../../../../../../../../../../../../../../../' , 'w' ) as sc :
    eval ( 'solve' )
    _out.flush ( )
    G = time.time ( )
    if elapsed :
        _err.write ( '%dms' % ( G - S ) )
    _err.flush ( )
