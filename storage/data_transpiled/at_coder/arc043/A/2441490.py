def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.N , A , B = randint ( 0 , N ) , randint ( 0 , N )
        self.S = [ randint ( 0 , N ) for _ in range ( N ) ]
        min = float ( 'inf' )
        max = float ( 'inf' )
        for i in range ( N ) :
            min = min ( min , S [ i ] )
            max = max ( max , S [ i ] )
        E = max - min
        if E == 0 :
            self.out.write ( - 1 )
            return
        P = B / E
        sum = 0
        for i in range ( N ) :
            sum += S [ i ] * P
        avg = sum / N
        Q = A - avg
        self.out.write ( P + '' + Q )
    def main ( self ) :
        self.out.flush ( )
        with open ( '/dev/tty' , 'w' ) as f :
            f.write ( '' )
    def __init__ ( self , * args ) :
        self.out.flush ( )
        super ( Main , self ).__init__ ( * args )
    def read ( self ) :
        self.out.seek ( 0 )
        return self.out.read ( )
    def has_next_byte ( self ) :
        if self.p < self.buflen :
            return True
        self.p = 0
        try :
            self.buflen = self.buflen
        except AttributeError :
            pass
        if self.buflen <= 0 :
            return False
        return True
    def __iter__ ( self ) :
        for i in self.iter ( "" ) :
            yield i
