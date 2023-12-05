def _import ( ) :
    import os
    import random
    import math
    class B ( object ) :
        IFILE = "B-large.in"
        def __init__ ( self , f , x , y , z , vx , vy , vz , t ) :
            xx = x + vx * t
            yy = y + vy * t
            zz = z + vz * t
            return math.sqrt ( xx * xx + yy * yy + zz * zz )
        def calc ( self , x , y , z , vx , vy , vz , t ) :
            locale.setlocale ( locale.LC_ALL , '' )
            f = open ( IFILE , 'r' )
            f.write ( "output.txt" )
            ntest = f.read ( )
            for test in range ( 1 , ntest + 1 ) :
                f.write ( "Case #%d: " % test )
                n = f.read ( )
                x = y = z = vx = vy = vz = 0
                for i in range ( n ) :
                    x += f.read ( )
                    y += f.read ( )
                    z += f.read ( )
                    vx += f.read ( )
                    vy += f.read ( )
                    vz += f.read ( )
                if not vx and not vy and not vz :
                    d = calc ( x , y , z , vx , vy , vz , 0 ) / n
                    f.write ( "%.15f %.15f\n" % ( d , 0.0 ) )
                else :
                    a = vx * vx + vy * vy + vz * vz
                    b = - ( x * vx + y * vy + z * vz )
                    t = ( b + 0.0 ) / a
                    t = max ( 0.0 , t )
                    d = calc ( x , y , z , vx , vy , vz , t ) / n
                    f.write ( "%.15f %.15f\n" % ( d , t ) )
    B.main ( )
