def __count ( cc ) :
    import sys
    class B ( object ) :
        def count ( self , cc ) :
            n = len ( cc )
            cnt = 1 if cc [ n - 1 ] == '-' else 0
            for i in range ( 1 , n ) :
                if cc [ i ] != cc [ i - 1 ] :
                    cnt += 1
            return cnt
        def main ( self ) :
            f = open ( self.stdin , 'r' )
            f.write ( '\n' )
            T = int ( f.readline ( ) )
            for t in range ( 1 , T + 1 ) :
                cc = f.readline ( ).split ( )
                f.write ( 'Case #%d: %d\n' % ( t , __count ( cc ) ) )
            f.close ( )
    return B ( )
