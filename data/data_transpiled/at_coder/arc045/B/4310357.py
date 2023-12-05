def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = self.n
        self.m = self.m
        arr = [ ]
        arr_s = [ ]
        arr_t = [ ]
        for i in range ( 1 , m + 1 ) :
            arr_s.append ( self.n )
            arr_t.append ( self.m )
            arr [ arr_s [ i ] ] += 1
            if arr_t [ i ] != n :
                arr [ arr_t [ i ] + 1 ] -= 1
        arr_x = [ ]
        for i in range ( 1 , n + 1 ) :
            arr [ i ] += arr [ i - 1 ]
            arr_x.append ( arr_x [ i - 1 ] )
            if arr [ i ] < 2 :
                arr_x.append ( i )
        count = 0
        lst = [ ]
        for i in range ( 1 , m + 1 ) :
            if arr_x [ arr_t [ i ] ] - arr_x [ arr_s [ i ] - 1 ] == 0 :
                count += 1
                lst.append ( i )
        lst = [ ]
        lst.append ( count )
        for x in lst :
            lst.append ( x )
        sys.stdout.write ( '\n'.join ( lst ) )
