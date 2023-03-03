def import import sys , string
class A ( object ) :
    def solve ( self ) :
        N = len ( sys.stdin.readline ( ).strip ( ) )
        s = [ ]
        X = 0
        for i in range ( N ) :
            s.append ( sys.stdin.readline ( ).strip ( ) )
            X += s [ i ]
        for i in range ( N ) :
            a = 0.0
            b = 1.0
            for q in range ( 100 ) :
                c = ( a + b ) / 2
                val = s [ i ] + c * X
                used = c * X
                for j in range ( N ) :
                    if i == j :
                        continue
                    if s [ j ] >= val :
                        continue
                    used += val - s [ j ]
                if used >= X :
                    b = c
                else :
                    a = c
            print ( ' %.6f' % ( 100 * a ).replace ( ',' , '.' ) , end = ' ' )
        print ( )
    def main ( self ) :
        T = len ( sys.stdin.readline ( ).strip ( ) )
        for i in range ( 1 , T + 1 ) :
            print ( 'Case #%d:' % i , end = ' ' )
            with open ( 'A.solve','w' ) as f :
                f.write ( '\n' )
