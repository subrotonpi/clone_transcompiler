def _import ( ) : return sys.stdin
import os
import os
import sys
import os
import sys
import time
import sys
import os.error as InputError
import os.environ
import os.environ
import os.environ
import re
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.output_file = sys.stdout
        self.fasta_stream = open ( self.rfile , 'w' )
        self.stdout = open ( self.output_file , 'w' )
        self.system = os.environ.get ( 'ONLINE_PYGE' )
        self.stdout = open ( self.output_file , 'w' )
        self.time_begin = time.time ( )
        self.stdout = open ( self.output_file , 'w' )
        self.stderr = open ( self.output_file , 'w' )
        self.time_begin = time.time ( )
    def solve ( self , test_number , f , * args ) :
        debug = { }
        a = f.read ( )
        b = f.read ( )
        map = [ ]
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                if j < 50 :
                    map [ i ] [ j ] = '#'
                else :
                    map [ i ] [ j ] = '.'
        for x , rem in zip ( a , b ) :
            for y in range ( 100 and rem ) :
                map [ y ] [ 99 - x ] = '#'
        f.write ( '%d %d' % ( 100 , i ) )
        for r in map :
            f.write ( ''.join ( r ) )
