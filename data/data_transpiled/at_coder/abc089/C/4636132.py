def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.count = 0
            self.count += self.count_r * self.count_c * self.count_h
            self.count += self.count_a * self.count_c * self.count_h
            self.count += self.count_a * self.count_r * self.count_c
            self.count += self.count_m * self.count_c * self.count_h
            self.count += self.count_m * self.count_r * self.count_h
            self.count += self.count_m * self.count_c * self.count_h
            self.count += self.count_m * self.count_c * self.count_h
            self.count += self.count_m * self.count_c * self.count_h
    def main ( ) :
        sc = open ( "/proc/stations/" , "r" )
        N = sc.readlines ( )
        names = [ ]
        self.count_m = 0
        self.count_a = 0
        self.count_r = 0
        self.count_c = 0
        self.count_h = 0
        I = [ ]
        for name in sc.readlines ( ) :
            I.append ( name [ 0 ] )
        for k in range ( N ) :
            if I [ k ] == "M" :
                self.count_m += 1
            elif I [ k ] == "A" :
                self.count_a += 1
            elif I [ k ] == "R" :
                self.count_r += 1
            elif I [ k ] == "C" :
                self.count_c += 1
            elif I [ k ] == "H" :
                self.count_h += 1
        print ( Examine ( self.count_m , self.count_a , self.count_r , self.count_c , self.count_h ) )
        sc.close ( )
    return Main
