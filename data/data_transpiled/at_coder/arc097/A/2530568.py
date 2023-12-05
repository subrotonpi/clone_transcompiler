def _import ( ) : return sys.stdin.read ( )
import tokenize
import tokenize
import tokenize
class SuffixArray :
    def __init__ ( self , s ) :
        self.index = s
        self.rank = [ ]
        def __lt__ ( self , o ) :
            if self.rank [ 0 ] != o.rank [ 0 ] :
                return self.rank [ 0 ] - o.rank [ 0 ]
            return self.rank [ 1 ] - o.rank [ 1 ]
    def main ( self ) :
        s = tokenize.generate_tokens ( tokenize.generate_tokens ( ) )
        obj = SuffixArray ( s )
        k = [ 0 ]
        for i in range ( len ( s ) ) :
            if self.rank [ i ] == self.rank [ i ] :
                k = 0
                continue
            j = self.rank [ i ] + 1
            while i + k < n and s [ i + k ] == s [ j + k ] :
                k += 1
            lcp [ i ] = k
            k = ( 0 if k == 0 else k - 1 )
class Main ( tokenize.TokenizeLines ) :
    def __init__ ( self ) :
        tokenize.TokenizeLines ( self )
        s = tokenize.generate_tokens ( )
        self.s = s
        self.SA = self.build_suffix_array ( )
        self.k = [ 0 ]
        for i in range ( len ( s ) ) :
            self.SA [ i ] = s [ i ]
    def build_suffix_array ( self ) :
        n = len ( s )
        self.suffixes = [ ]
        self.suffixes.append ( Suffix ( ) )
        self.suffixes.append ( s [ i ] )
        self.suffixes [ 0 ].rank [ 0 ] = self.s [ i ] - 'a'
        self.suffixes [ 1 ].rank [ 1 ] = ( ( self.index + 1 ) < n ) and s [ i + 1 ]
        self.suffixes.append ( s [ i ] )
for s in [ '' , '' , '' ] :
    s = tokenize.generate_tokens ( s )
    self.s = s
