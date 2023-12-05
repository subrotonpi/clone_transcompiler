def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.M , self.R = 1 << 29 , 1 << 29
        self.d = [ ]
        self.r = [ ]
        self.used = [ ]
    def main ( self ) :
        import sys
        sys.stdout.write ( "\n" )
        sys.stdout.flush ( )
    def main ( self ) :
        A , B , C = sys.stdin.read ( ).split ( " " )
        N = self.N
        M = self.M
        R = self.R
        for i in range ( 1 , N + 1 ) :
            for j in range ( 1 , N + 1 ) :
                if i != j :
                    d [ i ] [ j ] = INF
        for i in range ( 1 , R + 1 ) :
            r.append ( self.r [ i ] )
        for i in range ( 1 , M + 1 ) :
            A = self.A
            B = self.B
            C = self.C
            if d [ A ] [ B ] > C :
                d [ A ] [ B ] = d [ B ] [ A ] = C
        for k in range ( 1 , N + 1 ) :
            for i in range ( 1 , N + 1 ) :
                for j in range ( 1 , N + 1 ) :
                    if d [ i ] [ j ] > d [ i ] [ k ] + d [ k ] [ j ] :
                        d [ i ] [ j ] = d [ i ] [ k ] + d [ k ] [ j ]
        res = INF
        self.dfs ( 1 , - 1 , 0 )
        print ( res )
    def dfs ( self , c , las , dist ) :
        if c == R + 1 :
            if res > dist :
                res = dist
            return
        for i in range ( 1 , R + 1 ) :
            if not used [ i ] :
                self.used [ i ] = True
                if las == - 1 :
                    self.dfs ( c + 1 , i , 0 )
                else :
                    self.dfs ( c + 1 , i , dist + d [