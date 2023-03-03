def googlejam ( ) :
    import math
    import re
    import os
    import os
    import os
    import math
    import math
    import math
    import os
    import sys
    class CenterofMass ( object ) :
        def __init__ ( self ) :
            f = open ( 'c:\-large.in.txt' )
            pr = open ( 'C:\-blarge.txt' , 'w' )
            self.T = int ( f.readline ( ).strip ( ) )
            for i in range ( self.T ) :
                self.N = int ( f.readline ( ).strip ( ) )
                x = [ ]
                y = [ ]
                z = [ ]
                vx = [ ]
                vy = [ ]
                vz = [ ]
                for j in range ( self.N ) :
                    t = re.split ( '[ ]+' , f.readline ( ).strip ( ) )
                    x.append ( float ( t [ 0 ] ) )
                    y.append ( float ( t [ 1 ] ) )
                    z.append ( float ( t [ 2 ] ) )
                    vx.append ( float ( t [ 3 ] ) )
                    vy.append ( float ( t [ 4 ] ) )
                    vz.append ( float ( t [ 5 ] ) )
                r = self.solve ( x , y , z , vx , vy , vz )
                pr.write ( 'Case #%d: %d %d\n' % ( self.N + 1 , r.d , r.t ) )
            pr.close ( )
    return CenterofMass
