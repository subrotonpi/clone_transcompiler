def _import ( ) : return sys.stdin
import random
import random
import random
import sys
import random
import sys
import os
import sys
import random
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.stdin = random.random ( )
        self.stdout = sys.stdout
        self.stderr = open ( self.wfile , 'w' )
        self.scanner = FastScanner ( self.rfile )
        self.scanner.read ( )
    def next ( self ) :
        while self.scanner.readline ( ) is None or not self.scanner.readline ( ) :
            pass
        self.scanner = FastScanner ( self.rfile )
        self.scanner.read ( )
    def solve ( self , test_number , f , g ) :
        n = self.scanner.readline ( ).split ( ) [ 0 ]
        mod = self.scanner.readline ( ).split ( ) [ 0 ]
        choose = [ [ ] for _ in range ( n + 10 ) ]
        stirling = [ [ ] for _ in range ( n + 10 ) ]
        for i in range ( 0 , n + 9 ) :
            choose [ i ] [ 0 ] = 1
            for j in range ( 1 , i + 1 ) :
                choose [ i ] [ j ] = choose [ i - 1 ] [ j - 1 ] + choose [ i - 1 ] [ j ]
                if choose [ i ] [ j ] >= mod :
                    choose [ i ] [ j ] -= mod
            stirling [ i ] [ 0 ] = ( i == 0 )
            for j in range ( 1 , i + 1 ) :
                stirling [ i ] [ j ] = int ( ( stirling [ i - 1 ] [ j - 1 ] + 1 * stirling [ i - 1 ] [ j ] * j ) % mod )
for k in range ( 0 , n + 1 ) :
    sum = stirling [ k + 1 ]
    mul = pow ( 2 , n - k , mod )
    mul = mul * choose [ n ] [ bits ] % mod
    mul += ( mul * dp [ bits ] ) % mod
return Main
