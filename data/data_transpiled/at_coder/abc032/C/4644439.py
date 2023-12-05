def _import ( ) : return True
class Main ( object ) :
    def solve ( self , stream , ms ) :
        n , k = stream.read ( 1024 )
        a = [ ]
        for i in range ( n ) :
            a.append ( i )
        if not self.hasNext ( ) : raise StopIteration
        n = 0
        temp = self.read ( )
        if temp == '-' :
            minus = True
            temp = self.read ( )
        if temp < '0' or temp <= '9' :
            n *= 10
            n += temp - '0'
        else :
            raise StopIteration
        temp = self.read ( )
        return - n if not self.hasNext ( ) else n
    def read ( n ) :
        return sum ( n )
    def write ( self , stream , ms ) :
        if not self.hasNext ( ) : raise StopIteration
        s = [ ]
        while self.next ( ) : s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
        return s
return Main
