def _ _ main _ _ ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import time
MOD = 1000000007
def solve ( ) :
    N = readInt ( )
    A = readLong ( )
    B = readLong ( )
    a = readArrL ( N )
    if A == 1 :
        [ A ] = readInt ( )
    else :
        [ A ] = readInt ( )
    return [ A ]
def readArrL2 ( A , B ) :
    n = len ( A )
    for i in range ( N ) :
        [ A ] = readLong ( )
    return [ ]
def readArr2 ( A , B ) :
    n = len ( A )
    for i in range ( N ) :
        [ A ] = readLong ( )
    return [ ]
def readArr2 ( A , B ) :
    n = len ( A )
    for i in range ( N ) :
        [ A ] = readLong ( )
    return [ ]
j = 0
for j in range ( B ) :
    idx2 = 0
    min = float ( )
    for i in range ( N ) :
        if a [ i ] < min :
            idx2 = i
            min = min ( min , a [ i ] )
    if a [ idx2 ] * A >= a [ idx ] :
        break
    a [ idx2 ] = a [ idx2 ] * A
if j == B :
    [ A ] = readArr2 ( A , B )
else :
    M = B - j
    t = M % N
    s = M / N
    p = pow ( A , s + 1 )
    q = pow ( A , s )
    [ a ] = readArr2 ( A , B )
    for i in range ( t ) :
        print ( ( ( a [ int ( i ) ] * q ) % MOD ) , end = ' ' )
    for i in range ( t ) :
        print ( ( ( a [ int ( i ) ] * p ) % MOD ) , end = ' ' )
    print ( )
