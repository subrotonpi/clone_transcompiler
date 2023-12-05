def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        command = [ 'A' , 'B' , 'X' , 'Y' ]
        s = self.s
        c = [ ]
        for i in range ( self.N ) :
            c.append ( s [ i ] )
    ans = 2000
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                for l in range ( 4 ) :
                    L = [ command [ i ] , command [ j ] ]
                    R = [ command [ k ] , command [ l ] ]
                    count = 0
                    index = 0
                    while index < N :
                        if index + 1 < N :
                            if ( L [ 0 ] == c [ index ] and L [ 1 ] == c [ index + 1 ] ) or ( R [ 0 ] == c [ index ] and R [ 1 ] == c [ index + 1 ] ) :
                                index += 2
                            else :
                                index += 1
                        else :
                            index += 1
                        count += 1
                    ans = min ( ans , count )
    print ( ans )
