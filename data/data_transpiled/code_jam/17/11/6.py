def import _solve
class A ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.T = len ( f )
        for C in range ( 1 , T + 1 ) :
            print ( "Case #%d:" % C )
            self.solve ( )
    def solve ( self ) :
        R , C = self.R , self.C
        cake = [ ]
        for i in range ( R ) :
            cake.append ( self.f.read ( i ).decode ( 'utf-8' ) )
        for i in range ( R ) :
            in_row = False
            r = '?'
            for j in range ( C ) :
                if cake [ i ] [ j ] != '?' :
                    in_row = True
                    if r == '?' :
                        r = cake [ i ] [ j ]
            if in_row :
                for j in range ( C ) :
                    if cake [ i ] [ j ] == '?' :
                        cake [ i ] [ j ] = r
                    else :
                        r = cake [ i ] [ j ]
        start = - 1
        for i in range ( R ) :
            if cake [ i ] [ 0 ] != '?' :
                start = i
                break
        for i in range ( R ) :
            if cake [ i ] [ 0 ] != '?' :
                start = i
            else :
                for j in range ( C ) :
                    cake [ i ] [ j ] = cake [ start ] [ j ]
    print_cake ( cake )
    def print_cake ( self ) :
        for i in range ( R ) :
            for j in range ( C ) :
                print ( i , j )
            print ( )
