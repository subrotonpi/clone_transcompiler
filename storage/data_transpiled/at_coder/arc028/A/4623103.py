def _import ( ) : return
import sys
class Main ( object ) :
    def solve ( self , f , out ) :
        n , a , b = next ( self ) , next ( self ) , next ( self )
        i = - 1
        while n > 0 :
            i += 1
            if i % 2 == 0 :
                n -= a
            else :
                n -= b
        out.write ( ' '.join ( map ( str , ar ) ) )
    def write ( self , * ar ) :
        print ( * ar )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.read = stream
        self.stream = stream
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( self.stream.tell ( ) )
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , * ar ) :
        if not self.hasNext ( ) : raise StopIteration
        minus = False
        temp = self.read ( )
        if temp == '-' :
            minus = True
            temp = self.read ( )
        if temp < '9' :
            n *= 10
        else :
            n -= 1
        return minus
    def write ( self , * ar ) :
        self.stream.seek ( 0 )
        self.stream.write ( self.stream.read ( ) )
    def read ( self , stream ) :
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( self.stream.tell ( ) )
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , * ar ) :
        self.stream.seek ( 0 )
        self.stream.write ( self.stream.read ( ) )
        return self.stream.read ( self.stream.tell ( ) )
