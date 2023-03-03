def _import ( ) : return sys.stdin.read ( )
import struct
import math
import struct
import struct
import sys
INPUT = ''
mod = 1_000_000_007
inf = struct.calcsize ( 'I' ) // 2
def solve ( ) :
    n , c = [ ] , [ ]
    p = 0
    for i in range ( n ) :
        c.append ( i )
    if b == '-' :
        minus = True
        b = read_char ( )
    else :
        minus = False
    for i in range ( n ) :
        c.append ( i )
    for i in range ( n ) :
        c [ i ] = i
    for i in range ( n ) :
        c [ i ] = i
    return minus , c
def tr ( * o ) :
    print ( [ i for i in o ] )
    return 1
x = [ ]
idx = 0
for i in range ( n ) :
    if i > 0 and c [ i ] == c [ i - 1 ] :
        continue
    x.append ( c [ i ] )
    idx += 1
dp = [ 0 ] * p
prev = [ 0 ] * 200001
prev.append ( i )
for i in range ( p ) :
    dp [ i ] = 1 if i == 0 else dp [ i - 1 ]
    if prev [ x [ i ] ] in prev :
        dp [ i ] += dp [ prev [ x [ i ] ] ]
    dp [ i ] %= mod
    prev [ x [ i ] ] = i
print ( dp [ p - 1 ] )
def run ( ) :
    stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    stdout = sys.stdout
    s = time.time ( )
    solve ( )
    stdout.flush ( )
    if not INPUT == '' :
        tr ( time.time ( ) - s + 'ms' )
def main ( ) :
    return sys.stdin
inbuf = sys.stdin
lenbuf , ptrbuf = 0 , 0
def readByte ( ) :
    if lenbuf == - 1 :
        raise InputError
    if ptrbuf >= lenbuf :
    