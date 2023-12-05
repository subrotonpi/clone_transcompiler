def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.nextInt ( )
        self.p = [ ]
        for i in range ( n ) :
            self.p.append ( sc.nextInt ( ) )
        cnt = 0
        for i in range ( n - 1 ) :
            if self.p [ i ] == i + 1 :
                cnt += 1
                self.p [ i ] , self.p [ i + 1 ] = self.p [ i + 1 ] , i + 1
        if self.p [ n - 1 ] == n :
            cnt += 1
        print ( cnt )
    def main ( self ) :
        with open ( "/proc/main.txt" , "r" ) as f :
            return Main ( )
