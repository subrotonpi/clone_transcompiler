def import import struct
from os import urandom
from os import urandom
class Main ( object ) :
    def __init__ ( self ) :
        self.s = urandom ( 256 )
        self.n = int ( self.n )
        self.k = int ( self.k )
        self.t = [ [ ] for i in range ( self.n ) ]
        self.s.close ( )
        ret = self.dfs ( self.n , self.k , self.t , [ ] )
        if ret :
            self.print ( "Found" )
        else :
            self.print ( "Nothing" )
    def dfs ( self , n , k , t , lst ) :
        if len ( lst ) == self.n :
            xor = 0
            for val in lst :
                xor = xor ^ val
            if xor == 0 :
                return True
            else :
                return False
        for j in range ( self.k ) :
            list2 = [ t [ i ] [ j ] for i in lst ]
            ret = self.dfs ( self , self.n , self.k , self.t , list2 )
            if ret :
                return True
        return False
return Main ( )
