def _import ( ) : return True
import sys
import io
import sys
import struct
import sys
import os
import sys
import struct
import sys
import os
import sys
import set
import struct
import sys
from struct import calcsize
from struct import calcsize
from struct import calcsize
INF = 1000000007
def read ( ptr ) :
    if ptr < 0 and not isPrintableChar ( ptr ) : ptr += 1
    return ptr
def bfs ( start ) :
    if not hasNext ( ) : raise StopIteration
    n = 0
    if b == '-' :
        minus = True
        b = read_byte ( )
    else :
        n = read_byte ( )
    return n
def bfs ( n ) :
    if n < 0 or n <= '9' :
        raise ValueError
    while n < 0 :
        goalFlg = False
        next = set ( )
        for from _ in next :
            for to in graph [ n ] :
                if not gone [ to ] :
                    next.add ( to )
                    dp [ to ] = ( dp [ to ] + dp [ n ] ) % INF
                    if to == n : goalFlg = True
        if goalFlg : break
        next = set ( next )
        for i in next :
            gone [ i ] = True
    return ptr
def main ( ) :
    f = sys.stdout
    ( N , a , b , M ) = unpack ( '>i' , _read ( ptr ) )
    graph = [ ]
    for i in range ( N ) :
        graph.append ( ( 0 , 0 ) )
    if len ( graph ) <= 0 :
        return False
    ptr = 0
    dp = [ 0 ] * N
    for i in range ( M ) :
        x = read_byte ( ptr )
        y = read_byte ( ptr )
        graph [ x ] = y
        graph [ y ] = 1
        bfs ( a )
        f.write ( dp [ b ] )
        f.flush ( )
import StringIO
import struct
from struct import calcsize
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import calcsize
from struct import Struct
from struct import Struct
from struct import Struct
return Struct ( "" )
