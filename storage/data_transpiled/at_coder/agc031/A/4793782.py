def import sc
import sys
import string
import sys
import struct
import struct
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.n = sc.__next__ ( )
        self.ans = 1
        self.mod = 1000000007
        s = self.s
        map = { }
        for c in s :
            map [ c ] = map.get ( c , 0 ) + 1
        for k in map.values ( ) :
            ans = ( ans * ( k + 1 ) ) % mod
        print ( ( ans - 1 + self.mod ) % mod , file = sys.stdout )
    def write ( self , * args , ** kwargs ) :
        self.ans = ans
