def _import ( ) : return [ ]
import os
import sys
import random
import time
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.L , X , Y , S , D = rd ( )
        if X >= Y :
            self.out.append ( ( L + D - S ) % L / ( Y + X ) )
        else :
            self.out.append ( min ( ( L + D - S ) % L / ( Y + X ) , ( L + S - D ) % L / ( Y - X ) ) )
    def main ( self ) :
        f = open ( "/dev/null" , "r" )
        f.write ( "\n" )
        tok = random.choice ( [ "" ] )
        solve ( )
        f.close ( )
    def rs ( ) :
        while not tok :
            tok = random.choice ( [ " " ] )
        return tok
    def ri ( ) : return int ( rs ( ) )
    def rl ( ) : return long ( rs ( ) )
    def rd ( ) : return float ( rs ( ) )
    def rsa ( n ) :
        res = [ ]
        for i in range ( n ) :
            res.append ( rs ( ) )
        return res
    def ria ( n ) : return ri ( )
    def rla ( n ) : return rla ( n )
    def rla ( n ) : return rla ( n )
    def solve ( ) :
        for i in range ( n ) :
            res = [ rl ( i ) for i in range ( n ) ]
            return res
