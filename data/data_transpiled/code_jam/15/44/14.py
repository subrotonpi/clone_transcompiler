def import _solve
class d ( object ) :
    MOD = 1000000007L
    DX = [ - 1 , 0 , 0 , 1 ]
    DY = [ 0 , - 1 , 1 , 0 ]
    def main ( self , grid ) :
        stdin = sys.stdin
        num_cases = len ( self.grid )
        for loop in range ( 1 , num_cases + 1 ) :
            r , c = self.grid [ loop ]
            if x < 0 or x >= r :
                continue
            val = self.grid [ x ] [ y ]
            if val == self.grid [ loop ] :
                self.index += 1
            if val == self.grid [ loop ] :
                self.index += 1
        if self.match > self.grid [ loop ] :
            return False
    def print ( self ) :
        for i in range ( len ( self.grid ) ) :
            x , y = self.grid [ i ]
            if x < 0 or x >= r :
                continue
            val = self.grid [ x ] [ y ]
            self.index = 0
            print ( "Case #%d: %s" % ( self.loop , self.grid [ i ] [ j ] ) )
    def solve ( self , r , c ) :
        grid = self.grid [ r ]
        ans = self.solve_rec ( grid , 0 , 0 )
        cnt = 0
        used = [ ]
        for i in range ( self.index ) :
            if not used [ i ] :
                cnt += 1
            for j in range ( self.index + 1 ) :
                if self.equal ( i , j , r , c ) :
                    used.append ( True )
        return cnt
    def equal ( self , i , j , r , c ) :
        for rot in range ( self.index ) :
            eq = True
            for a in range ( self.index ) :
                for b in range ( self.index ) :
                    if self.sols [ i ] [ a ] [ b ] != sols [ j ] [ ( b + rot ) % c ] :
                        eq = False
            if eq :
                return True
        return False
    def solve ( self , grid ) :