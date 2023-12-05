def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = string.split ( sys.stdin.read ( ) )
        self.input = string.split ( self.input )
        self.k = int ( self.k )
        self.s = int ( self.s )
        count = 0
        for i in range ( 0 , k ) :
            for j in range ( 0 , k ) :
                if s >= i + j and s - ( i + j ) <= k :
                    count += 1
        print ( count )
