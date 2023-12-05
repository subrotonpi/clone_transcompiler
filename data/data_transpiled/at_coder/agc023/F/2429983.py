def _import ( ) : return sys.stdin
import io
import os
import sys
import os
import sys
import getopt
import getopt
import getopt
def main ( ) :
    input_file = sys.stdin
    output_file = sys.stdout
    f = open
    reader = getopt.getopt ( input_file , 'r' )
    tokenizer = None
    def next ( ) :
        while not tokenizer or not tokenizer :
            try :
                tokenizer = getopt.Getopt ( 'tokenizer' , 'r' )
            except getopt.error :
                raise
        return tokenizer [ 0 ]
    def read ( ) :
        return int ( next ( ) )
    Note :./ getopt.py.uses.unsafe.operations.Note : Recompile.with - Xlint.details.Error ( )
    n = 0
    def solve ( test_number , infile , outfile ) :
        value = [ ]
        parent = [ - 1 ]
        blocks = [ ]
        for i in range ( 1 , n ) :
            parent.append ( infile.randint ( - 1 , 1 ) )
        for i in range ( n ) :
            value.append ( infile.randint ( - 1 , 1 ) )
        res = None
        for i in range ( n - 1 , - 1 , - 1 ) :
            cur = blocks [ i ]
            blocks [ i ] = None
            if not cur :
                cur = [ ]
            first = { 'inversions' : 1 if value [ i ] == 0 else 0 , 'ones' : 1 if value [ i ] == 1 else 0 , 'zeros' : 0 }
            while not cur and first [ 0 ] > cur [ - 1 ] :
                eat = cur.pollFirst ( )
                first [ 'inversions' ] += eat [ 'inversions' ]
                first [ 'inversions' ] += eat [ 'zeros' ]
                first [ 'ones' ] += eat [ 'ones' ]
                first [ 'zeros' ] += eat [ 'zeros' ]
            cur.append ( first )
            if i == 0 :
                res = cur
            else :
                other = blocks [ parent [ i ] ]
                if other :
                    if len ( other ) < len ( cur ) :
                        cur.extend ( other )
                    else :
                        other.extend ( cur )
                    