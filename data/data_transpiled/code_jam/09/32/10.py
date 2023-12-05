def _center_of_mass ( ) :
    import math
    import os
    import sys
    import os
    import math
    import math
    import os
    import math
    import math
    import math
    import os
    import sys
    import math
    import sys
    import math
    import sys
    import math
    import sys
    import os
    import sys
    import math
    import sys
    import math
    import sys
    T = int ( sys.stdin.readline ( ) )
    for case_num in range ( 1 , T + 1 ) :
        N = int ( sys.stdin.readline ( ) )
        xPos = None
        yPos = None
        zPos = None
        xVel = None
        yVel = None
        zVel = None
        for line in sys.stdin.readline ( ).split ( ) :
            line = line.strip ( )
            xPos += float ( line )
            yPos += float ( line )
            zPos += float ( line )
            xVel += float ( line )
            yVel += float ( line )
            zVel += float ( line )
        xPos /= float ( N )
        yPos /= float ( N )
        zPos /= float ( N )
        xVel /= float ( N )
        yVel /= float ( N )
        zVel /= float ( N )
        if xVel == 0.0 and yVel == 0.0 and zVel == 0.0 :
            time = None
            distance = math.sqrt ( xPos * xPos + yPos * yPos + zPos * zPos )
        else :
            time = - ( xPos * xVel + yPos * yVel + zPos * zVel ) / ( xVel * xVel + yVel * yVel + zVel * zVel )
            if time < 0 : time = 0
            x_new = xPos + time * xVel
            y_new = yPos + time * yVel
            z_new = zPos + time * zVel
            distance = math.sqrt ( x_new * xVel + y_new * yVel + z_new * zVel )
        sys.stdout.write ( "Case #%d: %f %f\n" % ( case_num , distance , time ) )
    sys.stdout.flush ( )
    sys.exit ( 0 )
