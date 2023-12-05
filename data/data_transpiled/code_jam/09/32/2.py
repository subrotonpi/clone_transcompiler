def main ( argv ) :
    import math
    import sys
    import numpy.random
    import sys
    tests = sys.argv [ 1 ]
    for t in range ( 1 , tests + 1 ) :
        n = sys.argv.index ( 'n' )
        x , y , z , dx , dy , dz = 0., 0., 0., 0., 0., 0.
        for i in range ( n ) :
            x += random.uniform ( - 1 , 1 )
            y += random.uniform ( - 1 , 1 )
            z += random.uniform ( - 1 , 1 )
            dx += random.uniform ( - 1 , 1 )
            dy += random.uniform ( - 1 , 1 )
            dz += random.uniform ( - 1 , 1 )
        x /= n
        y /= n
        z /= n
        dx /= n
        dy /= n
        dz /= n
        a = dx * dx + dy * dy + dz * dz
        b = 2 * ( dx * x + dy * y + dz * z )
        c = x * x + y * y + z * z
        if a == 0 and b == 0 :
            s = 0
        elif a == 0 and b / c > 0 :
            s = 0
        elif a == 0 :
            s = - c / b
        elif b / a > 0 :
            s = 0
        else :
            s = - b / a / 2
        v = a * s * s + b * s + c
        if v < 0 :
            v = 0
        v = math.sqrt ( v )
        sys.stderr.write ( t )
        sys.stdout.write ( "Case #%d: %.08f %.08f\n" % ( t , v , s ) )
