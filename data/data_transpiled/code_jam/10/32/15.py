def import _csv
import os
import csv
import math
import os
import math
import os
import sys
class B ( object ) :
    input , output = os.path.split ( __file__ )
    def __init__ ( self ) :
        self.input , self.output = os.path.split ( self.input )
        with open ( self.output , 'w' ) as f :
            TestCases = len ( f.readlines ( ) )
            for Case in range ( 1 , TestCases + 1 ) :
                f.write ( "Case #%d: " % Case )
                L , P , C = map ( int , f.readlines ( ) )
                f.write ( "%f" % L )
                f.write ( "%f" % P )
                f.write ( "\n" )
    def f ( self , L , P , C ) :
        if P <= C * L :
            return 0
        x = 1.0 * P / L
        n = int ( math.ceil ( log ( x , C ) ) )
        return int ( math.ceil ( log ( n , 2 ) ) )
    def log ( self , x , c ) :
        return math.log ( x ) / math.log ( c )
    def __init__ ( self ) :
        B.__init__ ( self )
