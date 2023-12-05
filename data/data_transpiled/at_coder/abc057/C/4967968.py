def _import ( ) : return ''
import os
import sys
import io
import os
import io
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.output_file = sys.stdout
        self.stdin = LightScanner ( self.rfile )
        self.stdout = LightWriter ( self.output_file )
        self.solver = CDigitsInMultiplication ( )
        self.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    def solve ( self , test_number , self , f ) :
        n = f.longs ( )
        ans = 100
        for i in range ( 1 , self.n * i + 1 ) :
            if n % i : continue
            j = n / i
            c = 0
            while j > 0 :
                j //= 10
                c += 1
            ans = min ( ans , c )
        self.stdout.ansln ( ans )
    def readline ( self ) :
        self.rfile = None
        self.readline = None
        self.readline = None
        self.string = None
        if self.string is None or not self.string [ 0 ] :
            try :
                self.string = self.string [ 0 ]
            except IndexError :
                raise StopIteration
        return self.string [ 0 ]
    def readline ( self ) :
        try :
            self.stdout = open ( self.output_file , 'w' )
        except IOError as e :
            raise StopIteration
        return self.stdout
    class AutoFlush ( AutoFlush ) :
        def __init__ ( self ) :
            self.autoflush = False
            self.breaked = True
        def write ( self , s ) :
            try :
                self.write ( s )
                self.newline = '\n'
            except IOError as e :
                raise StopIteration
        def flush ( self ) :
            self.flush ( )
            self.close ( )
    return Main ( )
