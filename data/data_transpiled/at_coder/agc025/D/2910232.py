def _import ( ) :
    import sys
    import struct
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
        def __init__ ( self ) :
            self.d = { }
        def dx ( self , i , j , c , first , xy ) :
            if first :
                self.d [ y ] [ x ] = c % 2 + 1
            else :
                self.d [ y ] [ x ] = self.d [ y ] [ x ] * 2 + c % 2 + 1
            for l in xy :
                yy = int ( l / 1000000 )
                xx = int ( l % 1000000 )
                for i in range ( 4 ) :
                    yyy = y + yy * self.dy [ i ]
                    xxx = x + xx * self.dx [ i ]
                    if yyy < 0 or yyy >= 2 * self.n or xxx < 0 or xxx >= 2 * self.n :
                        continue
                    if first :
                        if self.d [ yyy ] [ xxx ] > 0 :
                            continue
                        self.dfs ( yyy , xxx , ( c + 1 ) % 2 , first , xy )
                    else :
                        if self.d [ yyy ] [ xxx ] > 2 :
                            continue
                        self.dfs ( yyy , xxx , ( c + 1 ) % 2 , first , xy )
    def main ( ) :
        sc = sys.stdin
        self.n = sc.n
        d1 , d2 = sc.split ( )
        self.d = { }
        sqrToseed = { }
        for i in range ( 0 , 2 ** i ) :
            if d1 - i in self.d :
                self.d [ i ] = long ( self.d [ i ] * 1000000 + self.d [ i ] )
        if d2 - i in self.d :
            self.d [ d2 - i ] = long ( self.d [ d2 - i ] )
    return Main ( )
