def import import struct
from collections import defaultdict
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = urandom ( )
    def __getitem__ ( self , key ) :
        return self.sc.__getitem__ ( key )
    def __setitem__ ( self , key , value ) :
        self.sc.__setitem__ ( key , value )
    def __iter__ ( self ) :
        for i in range ( self.n ) :
            a = struct.unpack ( ">i" , self.sc.recv ( 1 ) ) [ 0 ]
            while a % 2 == 0 :
                a //= 2
            self.d [ a ] = 0
        print ( len ( self.d ) )
