def rueustas ( ) :
    import math
    import os
    import os
    import math
    import os
    import locale
    import os
    import math
    import locale
    class ProbB ( object ) :
        def __init__ ( self ) :
            self.f = open ( 'b.in' , 'r' )
            self.f = open ( 'b.out' , 'w' )
            self.f = open ( 'b.in' , 'r' )
            self.f.write ( '\n' )
            self.f.close ( )
    t_str = str ( sys.stdin.readline ( ) )
    T = int ( t_str )
    for t in range ( 1 , T + 1 ) :
        n_str = str ( sys.stdin.readline ( ) )
        N = int ( n_str )
        sx = sy = sz = svx = svy = svz = 0
        for n in range ( N ) :
            co = self.f.readline ( ).strip ( ).split ( )
            x , y , z , vx , vy , vz = map ( int , co [ 0 ].split ( ) )
            sx += x
            sy += y
            sz += z
            svx += vx
            svy += vy
            svz += vz
        b = ( sx * svx ) + ( sy * svy ) + ( sz * svz )
        a = ( svx * svx ) + ( svy * svy ) + ( svz * svz )
        ti = 0.0
        if a != 0 :
            ti = ( - b + 0.0 ) / ( a + 0.0 )
        if ti < 0.0 :
            ti = 0.0
        l2 = ( sx + ti * svx ) ** 2 + ( sz + ti * svz ) ** 2 + ( sy + ti * svy ) ** 2
        l = math.sqrt ( l2 ) / N
        self.f.write ( 'Case #%s: %s\n' % ( str ( t ) , ' '.join ( l ) ) )
