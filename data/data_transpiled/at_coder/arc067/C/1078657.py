def _import ( ) : return sys.stdin
import os
import os
import sys
import os
import shlex
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = sys.stdin
        self.stream = sys.stdout
        self.stream = stream
        self.stream = sys.stdout
        self.stream = stream
        self.stream.write ( self.stream.read ( ) )
        self.stream.write ( self.stream.write ( self.stream.read ( ) ) )
        self.stream.write ( self.stream.write ( self.stream.write ( self.stream.read ( ) ) ) )
        self.stream.write ( self.stream.write ( self.stream.write ( self.stream.write ( self.stream.read ( ) ) ) ) )
        self.stream.read ( )
        self.stream.read ( 32768 )
    def __next__ ( self ) :
        while self.stream.readline ( ).startswith ( '\n' ) or not self.stream.readline ( ).startswith ( '\n' ) :
            self.stream.readline ( )
    def solve ( self , test_number , stream , self ) :
        n = self.stream.readline ( ).split ( ) [ 1 ]
        A = self.stream.readline ( ).split ( ) [ 0 ]
        B = self.stream.readline ( ).split ( ) [ 1 ]
        C = self.stream.readline ( ).split ( ) [ 0 ]
        D = self.stream.readline ( ).split ( ) [ 1 ]
        dp = [ ]
        binom = [ ]
        coef = [ ]
        fac = [ ]
        inv = [ ]
        for i in range ( 0 , n + 1 ) :
            dp.append ( [ ] )
        for i in range ( 1 , n + 1 ) :
            for j in range ( 0 , B + 1 ) :
                for k in range ( 0 , C + 1 ) :
                    dp [ i ].append ( dp [ i ] [ j ] + dp [ i - k ] * coef [ j ] [ k ] % mod * binom [ i ] [ j ] % mod )
            for j in range ( 0 , D + 1 ) :
                dp [ j ].append