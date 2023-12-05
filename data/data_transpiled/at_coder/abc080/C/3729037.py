def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        nb_pattern = 1023
        benefits = [ ]
        n = self.raw_input ( )
        self.raw_input ( )
        fss = [ ]
        for i in range ( n ) :
            fs = self.raw_input ( ).split ( )
            fint = [ int ( f ) for f in fs ]
            fss.append ( fint )
        pss = [ ]
        for i in range ( n ) :
            ps = self.raw_input ( ).split ( )
            pint = [ int ( p ) for p in ps ]
            pss.append ( pint )
        for i in range ( n ) :
            for j in range ( 1 , nb_pattern + 1 ) :
                count = 0
                for k in range ( 10 ) :
                    if ( j & ( 1 << k ) ) and fss [ i ] [ k ] == 1 :
                        count += 1
                benefits [ j - 1 ] += pss [ i ] [ count ]
        self.max = max ( benefits )
    return Main
