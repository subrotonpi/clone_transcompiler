def googlejam ( ) :
    import os
    import math
    import os
    import os
    import math
    import os
    import os
    import sys
    import os
    import math
    import re
    class WateringPlants ( object ) :
        def __init__ ( self ) :
            self.x = [ ]
            self.y = [ ]
            self.r = [ 2 ]
        def main ( self ) :
            f = open ( 'c:\-D-small-attempt0.in.txt' , 'r' )
            pr = open ( 'C:\-D-small0.out.txt' , 'w' )
            self.T = int ( f.readline ( ).strip ( ) )
            for i in range ( self.T ) :
                N = int ( f.readline ( ).strip ( ) )
                self.x = [ ]
                self.y = [ ]
                self.r = [ ]
                for j in range ( self.N ) :
                    temp = re.split ( '[ ]+' , f.readline ( ).strip ( ) )
                    self.x.append ( int ( temp [ 0 ] ) )
                    self.y.append ( int ( temp [ 1 ] ) )
                    self.r.append ( int ( temp [ 2 ] ) )
                if self.N == 1 :
                    pr.write ( 'Case #%d: %f\n' % ( self.i + 1 , self.r [ 0 ] ) )
                elif self.N == 2 :
                    pr.write ( 'Case #%d: %f\n' % ( self.i + 1 , self.r [ 0 ] ) )
                else :
                    result = self.findmin ( 0 )
                    for j in range ( 1 , self.N ) :
                        if result > self.findmin ( j ) :
                            result = self.findmin ( j )
                    pr.write ( 'Case #%d: %f\n' % ( self.i + 1 , result ) )
            pr.close ( )
    return WateringPlants ( )
