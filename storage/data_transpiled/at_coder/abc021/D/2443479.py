def _comb_rep ( n , k ) : return comb ( n + k - 1 , k )
class Main ( object ) :
    def __init__ ( self ) :
        self.n = n
        self.k = k
        self.MOD = 1000000007
    def run ( self ) :
        sc = FastReader ( )
        self.n = sc.__next__ ( )
        self.k = sc.__next__ ( )
        self.solve ( )
    def solve ( self ) :
        c = Combination ( self.n + k , MOD )
        print ( c.comb_rep ( n , k ) )
    class FastReader ( object ) :
        def readline ( self ) :
            while not self.n or not self.k.startswith ( "#" ) :
                try :
                    self.next ( )
                except StopIteration :
                    pass
            return self.next ( )
        def __next__ ( self ) :
            return int ( self.next ( ) )
        def __next__ ( self ) :
            return long ( self.next ( ) )
        def __next__ ( self ) :
            return float ( self.next ( ) )
        def readline ( self ) :
            data = ""
            try :
                data = self.next ( )
            except StopIteration :
                pass
            return data
    def comb ( self , max , mod ) :
        self.mod = mod
        self.facts = [ ]
        self.invs = [ ]
        self.inv_facts = [ 1 ]
        for i in range ( 2 , max + 1 ) :
            self.invs.append ( int ( self.mod % i ) * ( mod - self.mod / i ) % mod )
        self.facts.append ( 1 )
        self.inv_facts.append ( 1 )
        for i in range ( 1 , max + 1 ) :
            self.facts [ i ] = int ( self.facts [ i - 1 ] * self.i % mod )
            self.inv_facts [ i ] = int ( self.inv_facts [ i - 1 ] * self.i ) % mod
return Main ( )
