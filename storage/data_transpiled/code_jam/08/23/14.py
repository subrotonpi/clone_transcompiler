def aditsu.gcj.mousetrap ( ) :
    import os
    import sys
    import os.path
    import sys
    import os.path
    import sys
    import os.path
    import itertools
    class Mousetrap ( object ) :
        def get_path ( self , file ) :
            return 'src/%s/%s' % ( __name__ , file )
        def getfile ( self , file ) :
            return open ( getPath ( file ) )
        def getWriter ( self , file ) :
            return open ( getPath ( file ) , 'w' )
        def toInt ( self , s ) :
            return int ( s )
        def go ( self ) :
            f = getfile ( 'C-small-attempt0.in' )
            w = self.getWriter ( )
            t = toInt ( f.readline ( ) )
            for i in range ( t ) :
                k = toInt ( f.readline ( ) )
                with open ( f.readline ( ) ) as sc :
                    n = sc.readline ( ).split ( ) [ 1 ]
                    ind = [ sc.readline ( ) for i in range ( n ) ]
                    c = [ ]
                    q = - 1
                    s = [ ]
                    for j in range ( k ) :
                        m = j % ( k - j )
                        for x in range ( 0 , m ) :
                            do
                            q = ( q + 1 ) % k
                            if s [ q ] == 1 :
                                break
                        c.append ( j )
                        s.append ( 1 )
                    w.write ( 'Case #%d:' % ( i + 1 ) )
                    for j in range ( n ) :
                        w.write ( ' %d' % ( c [ ind [ j ] - 1 ] + 1 ) )
                    w.write ( '\n' )
                w.flush ( )
    return Mousetrap ( )
