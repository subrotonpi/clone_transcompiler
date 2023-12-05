def import import sys , getopt , buf
mod = 998244353
memo = { }
comp_memo = { }
def atoi ( next ) :
    return int ( next )
def uniform ( ) :
    return float ( next )
def go ( s ) :
    if memo.has_key ( s ) :
        return memo [ s ]
    if len ( s ) == 0 :
        return 1
    result = 0
    for i in range ( 1 , 200 ) :
        result += ( 1 * compress ( s [ : i ] ) * go ( s [ i : ] ) % mod )
        if result >= mod :
            result -= mod
    result += go ( s [ 1 : ] ) * ( s [ 0 ] - '0' + 1 ) % mod
    if result >= mod :
        result -= mod
    memo [ s ] = result
    return result
def compress ( s ) :
    result = 0
    if comp_memo.has_key ( s ) :
        return comp_memo [ s ]
    for k in range ( 2 , len ( s ) + 1 ) :
        if len ( s ) % k == 0 :
            a = [ '0' ] * len ( s ) / k
            a.append ( '1' )
            for j in range ( len ( s ) ) :
                if s [ j ] == '0' :
                    a [ j % len ( a ) ] = '0'
            result += go ( ''.join ( a ) )
            if result >= mod :
                result -= mod
        comp_memo [ s ] = result
        return result
    def solve ( ) :
        out ( go ( sys.stdin.readline ( ) ) )
global sys , stdin , stdout
import os
from io import StringIO
from itertools import chain , repeat
from itertools import chain , repeat
for i in chain ( zip ( * map ( compress , sys.stdin.readline ( ) ) ) , repeat ( [ ] ) ) :
    if i % 2 == 0 :
        break
sys.stdout.write ( ''.join ( chain ( * repeat ( sys.stdin.readline ( ) ) ) ) )
