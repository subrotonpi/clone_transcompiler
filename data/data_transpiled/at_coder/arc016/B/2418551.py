def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.dx = [ - 1 , 1 ]
        self.dy = [ 0 , 0 ]
        self.n = self.n
    def main ( self ) :
        with open ( "/proc/self/" , "r" ) as f :
            n = len ( f.read ( ) )
            s = [ ]
            for i in range ( self.n ) :
                s.append ( f.read ( ).decode ( "utf-8" ) )
            ans = 0
            for i in range ( self.n ) :
                for j in range ( 9 ) :
                    if s [ i ] [ j ] == "o" :
                        ans += 1
                        self.dfs ( i , j )
                    elif s [ i ] [ j ] == "x" :
                        ans += 1
                        s [ i ] [ j ] = "."
            print ( ans )
    def dfs ( self , x , y ) :
        for i in range ( 2 ) :
            nx = x + self.dx [ i ]
            ny = y + self.dy [ i ]
            if 0 <= nx < self.n and 0 <= ny < 9 and s [ nx ] [ ny ] == "o" :
                s [ nx ] [ ny ] = "."
                self.dfs ( nx , ny )
        return
