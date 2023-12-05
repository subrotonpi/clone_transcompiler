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
            n += 1
        return minus and n <= 126
    def read ( ) :
        return float ( self.read ( ) )
    def write ( self , stream , ms ) :
        if not self.hasNext ( ) : raise StopIteration
        s = [ ]
        while self.next ( ) :
            s.append ( self.read ( ) )
        return s
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
    def write ( self , stream , ms ) :
        s.append ( self.read ( ) )
