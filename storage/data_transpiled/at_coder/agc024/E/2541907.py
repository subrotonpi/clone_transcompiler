def _import ( ) : return sys.stdin
import io
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import io
import tokenize
import tokenize
import tokenize
import sys
class Main ( ) :
    def __init__ ( self , stream ) :
        self.input_stream = sys.stdin
        self.output_file = sys.stdout
        self.input_stream = stream
        self.output_file = sys.stdout
        self.scanner = tokenize
        self.scanner = tokenize
        self.scanner = tokenize
        self.scanner = scanner
        self.scanner.next = None
    def __next__ ( self ) :
        try :
            self.scanner = tokenize
            self.next = next ( self.scanner )
        except StopIteration :
            raise
        return self.scanner
    def __next__ ( self ) :
        return int ( self.scanner.next )
class MathExtentions ( ESequenceGrowingHard ) :
    def __init__ ( self , maxn , MOD ) :
        self.MOD = 0
        self.k = 1
        self.n = 2
        self.numberOfSequencesOfSizeIwithElementBiggerThenJ = [ 1 ]
        self.sumValue = [ ]
        self.nChK = self.MathExtentions.PreComputeNK_MOD_Mod ( self.n , MOD )
        for j in range ( self.k , self.n - 1 , self.k ) :
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ [ 0 ] [ j ] = 1 % MOD
            self.numberOfSequencesOfSizeIwithElementBiggerThenJ [ 1 ] [ j ] = ( self.k - j ) % MOD
        self.sumValue.append ( [ 1 ] )
        self.sumValue.append ( [ 0 ] )
        self.sumValue.append ( [ 1 ] )
        self.sumValue.append ( [ 1 ] )
        self.sumValue.append ( [ 1 ] )
        self.sumValue.append ( [ 1 ] )
