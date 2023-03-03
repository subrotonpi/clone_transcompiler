def import readline
import readline
import sys
import readline
import math
class Main ( readline ) :
    def solve ( self , f , g ) :
        n , m = readline ( ) , readline ( )
        for i in range ( 1 , n + 1 ) :
            if i != m :
                g.write ( i )
                return - n if n else n
        def write ( self , * ar ) :
            print ( " ".join ( map ( str , ar ) ) )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.read = stream
        self.buffer = ''
        self.length , p = 0 , 0
    def readline ( self ) :
        if self.p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( self.p )
            except :
                pass
            if self.length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( self.p )
            except :
                pass
            if self.length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.p < self.length :
            return True
        else :
            return False
    def write ( self , stream , g ) :
        if self.p < self.length :
            return False
        return write ( self , stream , g )
    def readline ( self ) :
        if not self.hasNext :
            raise StopIteration
        s = [ ]
        t = self.read ( )
        while self.hasNext :
            s.append ( t )
            t = self.read ( )
        return s
    def write ( self , stream , g ) :
        self.write ( stream , g )
        return write ( stream , g )
