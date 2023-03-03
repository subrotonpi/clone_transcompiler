def import import string , glob
import sys
import string
import string
import struct
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.Scanner ( string.punctuation )
        s = sc.next ( )
        a = s.split ( )
        n = struct.unpack ( '>I' , a ) [ 0 ]
        rec = [ 0 ] * 26
        for w in a :
            rec [ w - 'a' ] += 1
        ans = 1 + n * ( n - 1 ) / 2
        for i in range ( 26 ) :
            ans -= rec [ i ] * ( rec [ i ] - 1 ) / 2
        print ( ans )
