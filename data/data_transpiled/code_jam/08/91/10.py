def _import ( ) :
    import sys
    import numpy
    import numpy
    import numpy.random
    import numpy.testing.utils
    class A :
        TOTAL = 10000
        def __init__ ( self ) :
            self.TOTAL = 0
        def __init__ ( self ) :
            self.TOTAL = 0
        def solved_dataset ( self ) :
            self.N = self.TOTAL
            self.x2points = ( [ ] )
            for x in range ( 0 , self.TOTAL + 1 ) :
                self.x2points [ x ] = [ ]
            for y in range ( 0 , self.TOTAL + 1 ) :
                self.x2points [ x ].append ( ( x , y , z ) )
            ans = 0
            for z in range ( 0 , self.TOTAL + 1 ) :
                cnt = 0
                y_cnt = [ 0 ] * ( self.TOTAL - z + 1 )
                for x in range ( 0 , self.TOTAL - z ) :
                    if x > 0 :
                        cnt -= y_cnt [ self.TOTAL - z - ( x - 1 ) ]
                    for p in self.x2points [ x ] :
                        if p.z <= z and p.y <= self.TOTAL - z - x :
                            y_cnt [ p.y ] += 1
                            cnt += 1
                ans = max ( cnt , ans )
            sys.stderr.write ( 'Case #%d:\n' % self.caseid )
            sys.stdout.write ( 'Case #%d: %d\n' % ( self.caseid , ans ) )
    class Int3D ( object ) :
        def __init__ ( self ) :
            self.x = 0
            self.y = 0
            self.z = 0
        def __call__ ( self , x , y , z ) :
            self.x = x
            self.y = y
            self.z = z
    return A
