def import import sys
import os
import sys
class SolutionD ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.out = sys.stdout
    def doable ( self , demo , C , value ) :
        for ( d , v ) in demo.descend ( ) :
            if value % d == 0 and value / d <= C :
                return True
            value -= min ( value / d , C ) * d
        return False
    def solve ( self ) :
        C , D , V = self.scan ( )
        demo = [ self.scan ( ) for _ in range ( D ) ]
        value = 1
        while value <= V :
            if value in self.demo :
                value = value * ( C + 1 )
            elif not doable ( self , C , value ) :
                self.demo.append ( value )
                value = value * ( C + 1 )
            else :
                sum = 0
                for t in self.demo :
                    if t <= value :
                        sum += C * t
                value = max ( value + 1 , sum )
        self.out.write ( "%d\n" % ( len ( self.demo ) - D ) )
    def main ( self ) :
        T = self.scan ( ) [ 0 ]
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % i , end = ' ' )
            solve ( self )
