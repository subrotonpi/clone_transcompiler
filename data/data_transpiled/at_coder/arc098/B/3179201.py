def import import struct
import sys
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        self.n = struct.Struct ( 'B' )
        self.a = struct.Struct ( 'B' )
        self.left = 0
        self.sum , self.xor = 0 , 0
        for right in range ( self.n ) :
            while ( self.xor ^ self.a [ right ] ) != ( self.xor + self.a [ right ] ) :
                self.xor ^= self.a [ left ]
                self.left += 1
            self.xor ^= self.a [ right ]
            self.sum += self.right - self.left + 1
        print ( self.sum )
