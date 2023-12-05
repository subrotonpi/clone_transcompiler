def import import sys , pickle , dump
import pickle
import sys
import pickle
import pickle
import sys
import pickle
import pickle
import sys
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.debug = False
        self.MOD = 1_000_000_007
    def solve ( ) :
        n = len ( self.stdin )
        m = len ( self.stdin )
        x = [ ]
        y = [ ]
        sumX , sumY = 0 , 0
        for i in range ( n ) :
            x.append ( pickle.dumps ( self.stdin , 1 ) )
            if i != 0 :
                sumX = ( sumX + ( x [ i ] - x [ i - 1 ] ) * i % MOD * ( n - i ) % MOD ) % MOD
        for i in range ( m ) :
            y.append ( pickle.dumps ( self.stdin , 1 ) )
            if i != 0 :
                sumY = ( sumY + ( y [ i ] - y [ i - 1 ] ) * i % MOD * ( m - i ) % MOD ) % MOD
        print ( sumX * sumY % MOD )
    def main ( ) :
        debug = sys.argv [ 1 ] > 0
        start = time.clock ( )
        self.solve ( )
        pickle.dump ( sys.stdin , sys.stdout )
        end = time.clock ( )
        dump ( ( end - start ) / 1000000 , " ms" )
        sys.stdout.flush ( )
    def dump ( * o ) :
        if debug :
            print ( * o , file = sys.stderr )
