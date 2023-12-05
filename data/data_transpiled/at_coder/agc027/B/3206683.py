def import import struct
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.x , self.ans = struct.unpack ( '>i' , self.x )
    def read ( self ) :
        return struct.unpack ( '>i' , self.x ) [ 0 ]
    def write ( self , n ) :
        ps = [ ps [ i ] + struct.unpack ( '>i' , self.x ) [ 0 ] for i in range ( n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            ca = 2 * ( ps [ n ] - ps [ n - i ] ) + i * x
            for j in range ( 0 , n - i * j ) :
                b = ( 2 * j + 3 ) * ( ps [ n - i * j ] - ps [ max ( n - i * ( j + 1 ) , 0 ) ] )
                if struct.unpack ( '>i' , self.x ) [ 0 ] - b < ca :
                    ca = struct.unpack ( '>i' , self.x ) [ 0 ]
                    break
                ca += b
            ans = min ( ca , ans )
        print ( ans , n * x )
    def read ( self ) :
        return struct.unpack ( '>i' , self.x ) [ 0 ]
    def write ( self , n ) :
        while not n or not n :
            try :
                s = struct.unpack ( '>i' , self.x )
            except struct.error :
                pass
            else :
                s = s [ 0 ]
        return s
