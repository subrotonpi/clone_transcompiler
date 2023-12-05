def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = string.strip ( sys.stdin )
        self.n = int ( self.n )
        self.input = string.strip ( sys.stdin )
        self.d = int ( self.d )
        self.x = int ( self.x )
        self.sum , self.count , self.index = 0 , 0 , 1
        for i in range ( self.n ) :
            self.sum = self.count = self.index = 1
            value = int ( self.value )
            while self.count <= self.d :
                self.sum += 1
                self.count = ( self.index * value ) + 1
                self.index += 1
            self.x += self.sum
        print ( self.x )
