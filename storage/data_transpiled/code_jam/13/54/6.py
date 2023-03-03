def import readline
import time
import sys
class D ( object ) :
    def __init__ ( self ) :
        self.init = readline ( ).decode ( 'ascii' )
        self.n = len ( self.init )
        self.prob = np.zeros ( 1 << self.n )
        self.gain = np.zeros ( 1 << self.n )
        init_mask = 0
        for i in range ( self.n ) :
            if self.init [ i ] == 'X' :
                init_mask |= 1 << i
        self.prob [ init_mask ] = 1
        for mask in range ( ( 1 << self.n ) - 1 ) :
            if self.prob [ mask ] == 0 :
                continue
            self.gain [ mask ] /= self.prob [ mask ]
            for where in range ( self.n ) :
                next = where
                cost = self.n
                while ( mask >> next & 1 ) == 1 :
                    next = ( next + 1 ) % self.n
                    cost -= 1
                self.prob [ mask | ( 1 << next ) ] += self.prob [ mask ] / n
                self.gain [ mask | ( 1 << next ) ] += float ( self.prob [ mask ] * ( cost + self.gain [ mask ] ) / n )
        self.out.write ( "%.15f\n" % self.gain [ ( 1 << self.n ) - 1 ] )
    def run ( self ) :
        try :
            tc = randint ( 0 , 1 << self.n )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( it )
                sys.stdout.write ( "Case #%d: " % it )
                self.solve ( )
        except :
            NOO ( self )
        finally :
            self.out.close ( )
global stdin , stdout
global ST
class NOO ( object ) :
    def __init__ ( self ) :
        self.init = readline ( ).decode ( 'ascii' )
        sys.exit ( 42 )
    def __next__ ( self ) :
        try :
            return int ( self.__next__ ( ) )
        except :
            return None
