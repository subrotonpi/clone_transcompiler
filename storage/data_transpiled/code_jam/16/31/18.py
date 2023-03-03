def _ _ main _ _ ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import os
    import sys
    class A_2_evacuation ( object ) :
        def count ( self , a ) :
            n = 0
            for y in a :
                if y == x :
                    n += 1
            return n
        def max ( self , a ) :
            t = - 1
            for y in a :
                t = max ( t , y )
            return t
        def solve ( self , sc , f ) :
            n = sc.__next__ ( )
            p = [ sc.__next__ ( ) for _ in range ( n ) ]
            a = [ ]
            while self.count ( p , 0 ) < n :
                m = max ( p )
                c = self.count ( p , m )
                e = 1 if c in [ 1 , 3 ] else 2
                k = 0
                for i in range ( n ) :
                    if p [ i ] == m :
                        a.append ( i )
                        p [ i ] -= 1
                        if k == e :
                            break
                for i in range ( e ) :
                    f.write ( chr ( ord ( a [ i ] ) + ord ( 'A' ) ) )
                f.write ( ' ' )
            f.write ( '\n' )
    def main ( self ) :
        fname = 'A-large'
        with open ( fname + '.in' , 'r' ) as sc :
            f = open ( fname + '.out' , 'w' )
            t = sc.__next__ ( )
            sc.__next__ ( )
            for i in range ( 1 , t + 1 ) :
                print ( i )
                f.write ( 'Case #%d: ' % i )
                A_2_evacuation ( ).solve ( sc , f )
            f.close ( )
    return main
