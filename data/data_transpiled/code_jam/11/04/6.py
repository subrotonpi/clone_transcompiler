def import import sys
class GoroSort ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.nb_case = self.nb_case
    for num_case in range ( 1 , nb_case + 1 ) :
        self.s.readline ( )
        size = self.s.readline ( )
        self.s.readline ( )
        array = [ ]
        array_reverse = [ ]
        for i in range ( size ) :
            v = self.s.readline ( ) - 1
            array.append ( v )
            array_reverse.append ( i )
        n = 0
        for i in array_reverse :
            if array [ i ] != i :
                n += 1
        print ( "Case #" , end = " " )
        print ( num_case , end = " " )
        print ( ": " , end = " " )
        print ( n , end = " " )
        print ( ".000000" )
