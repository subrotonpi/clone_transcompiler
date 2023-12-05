def import _diamond
class Diamond ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.T = sc.randint ( 0 , 1 )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %d" % ( i , self.T ) )
    def get_upper ( self , size ) :
        return self.T + 1
    def get_lower ( self , size ) :
        if size < 2 :
            return self.T - 1
        return 2 * size - 1
    def solve_case ( self ) :
        K = self.K
        dia = [ ]
        for i in range ( 2 * K - 1 ) :
            [ first , second ] = self.get_lower ( i , K )
            for j in range ( self.get_upper ( i , K ) ) :
                dia.append ( [ first + 2 * j ] + chr ( ord ( self.T ) + ord ( self.T ) + ord ( self.T ) ) )
        for size in range ( K ) :
            ok = False
            for row in range ( 2 * size - 1 ) :
                for col in range ( 2 * size - 1 ) :
                    match = True
                    for i in range ( 2 * K - 1 ) and match :
                        for j in range ( self.get_lower ( i , K ) , self.get_upper ( i , K ) + 2 ) :
                            r , c = i + row , j + col
                            if self.valid ( r , c , size ) :
                                c_inv = 2 * size - 2 - c
                                r_inv = 2 * size - 2 - r
                                if self.test ( i , c_inv - col , K , dia [ i , j ] , dia ) and self.test ( r_inv - row , j , K , dia [ i , j ] , dia ) and self.test ( r_inv - row , c_inv - col , K , dia [ i , j ] , dia ) :
                                    continue
                            else :
                                match = False
                                break
                if ok :
                    return self.T * size - K * K
        return Diamond
