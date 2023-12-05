def _import ( ) : return [ a , b ]
import math
import os
import sys
class Logging :
    def gcd ( a , b ) : return a if b == 0 else gcd ( b , a % b )
    def __init__ ( self , dx , dy ) :
        self.dx , self.dy = a , b
        self.dx , self.dy = self.dx , self.dy
    def _vector_mul ( self , v ) :
        self.dx , self.dy = self.dx , self.dy
        return self.dx , self.dy
    def _vector_mul ( self , v ) :
        with open ( "test.txt" , "r" ) as f :
            tests = f.readlines ( )
            for t in tests :
                self.dx , self.dy = self.dx , self.dy
    def _vector_mul ( self , v ) :
        return self.dx * self.dy - self.dx * v.dy
    def _vector_mul ( self , v ) :
        if self == v : return True
        if not hasattr ( self , '_vector_mul' ) or self.__class__ != type ( v ) : return False
        vector = self._vector_mul ( v )
        if self.dx != vector.dx : return False
        return dy == vector.dy
    def _vector_mul ( self , v ) :
        result = int ( self.dx ^ ( self.dx >> 32 ) )
        result = 31 * result + int ( self.dy ^ ( self.dy >> 32 ) )
        return result
    def _like_ATAN2 ( self , v1 , v2 ) :
        if v1 == v2 : return 0
        if v1.dy == 0 and v1.dx > 0 : return - 1
        if v1.dy > 0 and v2.dy < 0 : return - 1
        if v1.dy < 0 and v2.dy > 0 : return 1
        if v2.dy == 0 and v2.dx > 0 : return 1
        return sum ( v1 * v2 for v2 in v2 )
