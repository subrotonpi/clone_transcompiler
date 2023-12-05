def rueustas ( ) :
    import os
    import sys
    import os
    import string
    import string
    import string
    import itertools
    import dictionary
    import dictionary
    import itertools
    import string
    class ProbA ( object ) :
        def __init__ ( self ) :
            self.stdin = open ( 'a.in' , 'r' )
            self.stdout = open ( 'a.out' , 'w' )
            f = string.split ( string.strip ( '\n' ) )
            t_str = f.strip ( '\n' )
            T = int ( t_str )
            best = [ int ( 1 ) , int ( 0 ) ]
            for i in range ( 2 , 70 ) :
                best.append ( int ( i ) )
        def __init__ ( self ) :
            self.stdout = open ( 'a.out' , 'w' )
        def readline ( ) :
            return string.split ( string.strip ( '\n' ) ) [ 0 ]
    for t in range ( 1 , T + 1 ) :
        V = 0
        alien = readline ( ).strip ( )
        vals = dictionary.fromkeys ( )
        a = alien.split ( '' )
        max = 0
        for ( k , v ) in itertools.izip ( best , a ) :
            cc = string.lower ( k )
            if c not in vals :
                next = next ( iter ( v ) )
                if next [ 0 ] > max :
                    max = next [ 0 ]
                vals [ cc ] = next
        max += 1
        for c in a :
            V = V * max
            V = V + vals [ u'' ]
        f.write ( 'Case #%s: %.2r\n' % ( str ( t ) , V ) )
