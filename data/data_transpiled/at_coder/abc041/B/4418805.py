def import sys , random
import struct
class Main ( object ) :
    def solve ( self ) :
        a , b , c = randint ( 0 , 10 ) , randint ( 0 , 10 ) , randint ( 0 , 10 )
        out.write ( a * b % mod * c % mod )
    def main ( self ) :
        self.out = sys.stdout
        super ( Main , self ).solve ( )
        self.out.flush ( )
    def maxInt ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def minInt ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def maxInt ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def minInt ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def read ( self , p = 0 ) :
        if p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.read ( p )
            except :
                pass
            if not length :
                return False
        return True
    def readByte ( self ) :
        if self.hasNextByte ( ) == True :
            return self.data [ p ]
        return - 1
    def isPrintable ( self , n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.hasNextByte ( ) and not isPrintable ( self.data [ p ] ) :
            p += 1
        return False
    def hasNext ( self ) :
        skip ( )
        return self.hasNextByte ( )
    def next ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        lines = [ ]
        temp = readByte ( )
        while self.isPrintable ( temp ) :
            lines.append ( temp )
            temp = readByte ( )
        return ''.join ( lines )
    def readInt ( self ) :
        return random.randint ( 0 , 1 )
    def nextInt ( self ) :
        return random.randint ( 0 , 1 )
    def readInt ( self ) :
        return readInt ( )
        