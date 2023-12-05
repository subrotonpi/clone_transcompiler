def import _scanner
import os
class Solution3 ( object ) :
    def __init__ ( self ) :
        self.In = sys.stdin
        self.N = sys.maxint
        self.m = sys.maxint
        self.X = sys.maxint
        self.Y = sys.maxint
        self.Z = sys.maxint
        self.A = [ ]
        self.B = [ ]
        self.Mem = [ ]
        self.MOD = 1000000007L
        def fx ( pos ) :
            r = self.Mem [ pos ]
            if r > 0 : return r - 1
            r = 1
            x = self.B [ pos ]
            for i in range ( pos + 1 , self.n ) :
                if self.B [ i ] <= x : continue
                r = ( r + fx ( i ) ) % MOD
            r = r % MOD
            self.Mem.append ( r + 1 )
            return r
        def case ( self , num ) :
            self.n = self.In.raw_input ( )
            self.m = self.In.raw_input ( )
            self.X = self.In.raw_input ( )
            self.Y = self.In.raw_input ( )
            self.Z = self.In.raw_input ( )
            A = [ ]
            for i in range ( self.m ) :
                A.append ( self.In.raw_input ( ) )
            B = [ ]
            for i in range ( self.n ) :
                j = int ( i % self.m )
                B.append ( A [ j ] )
                A [ j ] = ( ( ( X * A [ j ] ) % Z ) + ( ( Y * ( i + 1 ) ) % Z ) ) % Z
            self.Mem = [ ]
            r = 0
            for i in range ( self.n ) : r = ( r + fx ( i ) ) % MOD
            print ( 'Case #%d: %d' % ( self.num , r ) )
    def main ( self ) :
        try :
            filename = 'C-small-attempt0.in'
            self.In = open ( filename , 'r' )
            try :
                self.N = sys.maxint
                for num in range ( 1 , self.N + 1 ) :
                    self.case ( num