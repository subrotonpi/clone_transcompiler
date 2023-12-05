def import import struct
from struct import Struct
class Main ( Struct ) :
    def __init__ ( self ) :
        sc = Struct ( )
        n = sc.size
        t = struct.unpack ( ">i" , sc.read ( 4 ) )
        tmp = t [ 0 ]
        for i in range ( n ) :
            tmp = gcd ( tmp , t [ i ] )
        print ( tmp )
    def gcd ( a , b ) :
        max = max ( a , b )
        min = min ( a , b )
        while max % min != 0 :
            max = max % min
            tmp = max
            max = min
            min = tmp
        a = Struct ( str ( a ) )
        b = Struct ( str ( b ) )
        b = Struct ( str ( b ) )
        b = Struct ( str ( b ) )
        tmp = Struct ( str ( min ) )
        return struct.unpack ( tmp )
