def _import ( ) : return _import ( )
class Main ( object ) :
    def solve ( self , f ) :
        n = next ( f )
        niku = next ( n )
        min , min_dif = [ ] , 0
        for bit in range ( ( 1 << n ) ) :
            ar.append ( randint ( 0 , n ) )
        if not self.hasNext ( ) : raise StopIteration
        temp = self.read ( 1 )
        if temp == '-' :
            minus = True
            temp = self.read ( 1 )
        if temp < '0' or temp < '9' :
            n += temp - '0'
        else :
            n += 1
    def close ( ) :
        try :
            f.close ( )
        except :
            pass
    def write ( * ar ) :
        print ( "".join ( map ( str , ar ) ) , file = sys.stdout )
    def main ( self ) :
        self.write ( "\n".join ( map ( str , ar ) ) , file = sys.stdout )
    def solve ( self , f ) :
        f = open ( "/dev/null" , "w" )
        self.write ( "\n".join ( map ( str , f.readlines ( ) ) ) , file = sys.stdout )
    def write ( self , * ar ) :
        self.write ( "\n".join ( map ( str , ar ) ) , file = sys.stdout )
    def read ( self , stream ) :
        self.write ( stream )
    def has_next_byte ( self ) :
        if self.p < self.length : return True
        else :
            p = 0
            try :
                length = stream.read ( self.p )
            except :
                pass
            if self.length <= 0 : return False
        return True
    def write ( self , stream ) :
        self.write ( stream )
    def read ( self , stream ) :
        self.write ( stream )
