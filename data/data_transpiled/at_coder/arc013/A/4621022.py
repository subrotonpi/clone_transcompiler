def _import ( * args ) : return _import ( * args )
import sys
import math
class Main ( object ) :
    def solve ( self , f , out ) :
        a , b = args [ 0 ] , args [ 1 ]
        x = ord ( a [ 0 ] )
        if not self.hasNext ( ) : raise StopIteration
        minus = False
        temp = self.read ( 1024 )
        if temp == '-' :
            minus = True
            temp = self.read ( 1024 )
        if temp < '9' or temp < '9' :
            raise ValueError
        n = ord ( temp )
        while self.hasNext ( ) :
            if self.read ( 1024 ) == temp :
                n += 33
            else :
                n += 126
        if not self.hasNext ( ) :
            raise StopIteration
        s = [ ]
        t = self.read ( 1024 )
        while self.hasNext ( ) :
            s.append ( t )
        return s
    def write ( self , s ) :
        s = [ ]
        for i in range ( len ( s ) ) :
            s.append ( s [ i ] )
        return s
    def read ( self , n ) :
        return self.read ( n )
    def write ( self , s ) :
        s = [ ]
        for i in range ( len ( s ) ) :
            s.append ( s [ i ] )
        return s
    def write ( self , s ) :
        s.append ( s [ 0 ] )
    def write ( self , s ) :
        s.append ( s [ 0 ] )
