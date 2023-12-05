def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def solve ( self , f , out ) :
        a = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                a [ i ].append ( f.read ( 1 ) )
        for i in range ( 4 ) :
            ar = [ ]
            for j in range ( 4 ) :
                ar.append ( randint ( 0 , n ) )
        for i in range ( 4 ) :
            if not self.hasNext ( ) :
                raise StopIteration
        temp = self.next ( )
        if temp == '-' :
            minus = True
            temp = self.next ( )
        if temp < '0' or temp <= '9' :
            n *= 10
        else :
            raise ValueError
        temp = self.next ( )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
        return minus
    def write ( self , * ar ) :
        print ( "\n".join ( map ( write , ar ) ) , file = sys.stdout )
    def main ( self ) :
        self.write ( "\n".join ( map ( write , ar ) ) , file = sys.stdout )
    def write ( self , * ar ) :
        print ( "\n".join ( map ( write , ar ) ) , file = sys.stdout )
    def read ( self , stream ) :
        if not self.hasNext ( ) :
            raise StopIteration
        s = [ ]
        for i in range ( 1024 ) :
            s.append ( stream.read ( i ) )
        return s
    def write ( self , stream ) :
        if self.hasNext ( ) :
            self.skip ( )
        return stream.read ( )
    def write ( self , stream ) :
        if self.hasNext ( ) :
            self.skip ( )
        return stream.read ( )
    def read ( self , stream ) :
        while self.hasNext ( ) :
            self.skip ( )
        return stream.read ( )
return Main ( )
