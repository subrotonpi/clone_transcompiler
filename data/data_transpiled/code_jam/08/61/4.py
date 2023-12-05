def main ( argv ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = len ( argv )
            for i in range ( 1 , n + 1 ) :
                print ( "Case #%d:\n" % i )
                self.solve ( )
        def solve ( self ) :
            n = len ( argv )
            x = [ ]
            h_min = 1000000
            h_max = 1
            w_min = 1000000
            w_max = 1
            count = 0
            for i in range ( n ) :
                h , w , x = getopt.getopt ( argv [ i ] , "" )
                self.x = x
                self.h , self.w = h , w , x == "BIRD"
                if self.x == "BIRD" :
                    self.x = x
                if self.x == "BIRD" :
                    if h < h_min :
                        h_min = h
                    if h > h_max :
                        h_max = h
                    if w < w_min :
                        w_min = w
                    if w > w_max :
                        w_max = w
                    count += 1
    m = len ( argv )
    for i in range ( m ) :
        h , w = getopt.getopt ( argv [ i ] , "" )
        if count == 0 :
            flag = False
            for j in range ( n ) :
                if argv [ j ] [ 0 ] == h and argv [ j ] [ 1 ] == w :
                    flag = True
            if flag :
                print ( "NOT BIRD" )
            else :
                print ( "UNKNOWN" )
        else :
            if h >= h_min and h <= h_max and w >= w_min and w <= w_max :
                print ( "BIRD" )
            else :
                flag = False
                tmph = [ ]
                tmpw = [ ]
    return Main ( )
