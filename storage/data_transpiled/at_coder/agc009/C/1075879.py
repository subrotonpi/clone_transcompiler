def _import ( ) : return sys.stdin
import tokenize
import tokenize
import tokenize
import tokenize
import os
import tokenize
import tokenize
import os
import os
class Main ( tokenize.Tokenizer ) :
    def __init__ ( self , stream ) :
        tokenize.Tokenizer.__init__ ( self , stream )
        self.stream = stream
        self.output_file = sys.stdout
        self.stream = open ( self.stream , 'w' )
        self.stream = stream
        self.stream.close ( )
    def sum ( self , r ) :
        if self.stream is None or not self.stream :
            return
        self.stream = tokenize.Tokenizer.__init__ ( self , stream )
        self.stream.close ( )
        self.stream = stream
        self.stream.close ( )
    def solve ( self , test_number , self , stream ) :
        n = self.stream.tell ( )
        A = self.stream.read ( )
        B = self.stream.read ( )
        s = [ - 1 for i in range ( 1 , n + 1 ) ]
        last_A = self.calc_last_fitting ( s , A )
        last_B = self.calc_last_fitting ( s , B )
        t0 = Tree ( n + 1 )
        t1 = Tree ( n + 1 )
        t0.add ( 0 , 1 )
        for i in range ( 1 , n + 1 ) :
            u = last_A [ i ]
            v = last_B [ i ]
            su = t1.sum ( 0 , u )
            sv = t0.sum ( 0 , v )
            if u != i - 1 :
                t0.clear ( )
            if v != i - 1 :
                t1.clear ( )
            t0.add ( i - 1 , su )
            t1.add ( i - 1 , sv )
        ans = 0
        ans = ( ans + t0.sum ( 0 , n - 1 ) ) % MOD
        ans = ( ans + t1.sum ( 0 , n - 1 ) ) % MOD
        self.stream.write ( ans )
