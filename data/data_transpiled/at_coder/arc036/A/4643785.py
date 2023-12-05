def _ _ main _ _ '
import random
import sys
class Main ( object ) :
    def solve ( self , stream , ms ) :
        n , lower = ord ( stream.read ( 1 ) ) , ord ( stream.read ( 1 ) )
        sum = [ 0 ] * 1024
        sum [ 0 ] = 0
        for i in range ( 1 , n + 1 ) :
            sum [ i ] = sum [ i - 1 ] + ord ( stream.read ( 1 ) )
        for i in range ( 3 , n + 1 ) :
            if not self.hasNext ( ) : raise StopIteration
        n = 0
        while self.hasNext ( ) :
            n = ord ( stream.read ( 1 ) )
        if n < ord ( '-' ) :
            return True
        if self.hasNext ( ) :
            return True
        if self.hasNext ( ) :
            return True
        if self.hasNext ( ) :
            return True
        if self.hasNext ( ) :
            return False
        n += ord ( stream.read ( 1 ) )
    def read ( self ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        try :
            stream.write ( self.read ( 1 ) )
        except :
            pass
        return stream.read ( 1 )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
    def write ( self , stream , ms ) :
        return self.next ( )
