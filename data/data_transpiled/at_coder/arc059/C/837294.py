def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import struct
P = 1_000_000_007
def get_sums ( from_number , to_number , c ) :
    a = [ ]
    a.append ( 1 )
    ret = [ ]
    for i in range ( 0 , c + 1 ) :
        if i != 0 :
            for j in range ( from_number , to_number + 1 ) :
                a [ j - from_number ] = int ( long ( a [ j - from_number ] ) * j % P )
        for j in range ( 0 , to_number - from_number + 1 ) :
            ret.append ( ( ret [ i ] + a [ j ] ) % P )
    return ret
def solve ( ) :
    n = randint ( 0 , c + 1 )
    dp = [ 1 ] * c + [ 0 ]
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        low.append ( randint ( 0 , c + 1 ) )
        high.append ( randint ( 0 , c + 1 ) )
    for i in range ( n ) :
        sums = get_sums ( low [ i ] , high [ i ] , c )
        nxt = [ 0 ] * c + [ 0 ]
        for from_number in range ( 0 , c + 1 ) :
            for to_number in range ( from_number , to_number + 1 ) :
                nxt [ to_number ] += int ( long ( dp [ from_number ] * sums [ to_number ] ) % P )
                nxt [ to_number ] %= P
        dp = nxt
    readline.write ( dp )
def main ( ) :
    readline.write ( sys.stdin.readline ( ) )
    readline.flush ( )
    return
