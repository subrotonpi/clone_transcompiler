def import import struct
from os import sys
from os import urandom
from io import StringIO
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.stdout = StringIO ( )
        n , k = sc.size
        a = [ ]
        idx = 0
        for i in range ( n ) :
            a.append ( sc.read ( ) )
            if a [ i ] == 1 :
                idx = i
    ans = n
    x = k - 1
    for i in range ( max ( idx - k , 1 ) - 1 , min ( idx + k , n ) ) :
        curr = 1 + ( i + x - 1 ) // x
        tmp = n - ( i + k )
        curr += ( tmp + x - 1 ) // x
        ans = min ( ans , curr )
    print ( ans )
    print ( "\n" )
