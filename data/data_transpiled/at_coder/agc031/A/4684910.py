def import import sys
import string
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.mod = 100000 + 10 , 1000000007
    def __init__ ( self ) :
        self.N = self.N
        self.mod = self.mod
    def __init__ ( self ) :
        self.N = self.N
        self.cnt = [ 0 ] * 30
    def read ( self ) :
        inp = string.split ( self.N )
        self.n = inp [ 0 ]
        self.s = inp [ 1 ]
        for c in s :
            self.cnt [ c ] - 'a'
        res = 1
        for i in range ( 26 ) :
            res = res * ( self.cnt [ i ] + 1 ) % mod
        sys.stdout.write ( ( res + self.mod - 1 ) % mod )
