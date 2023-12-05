def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.nextInt ( )
        self.a = [ ]
        for i in range ( n ) :
            self.a.append ( sc.nextInt ( ) )
    def main ( self ) :
        if self.a [ 0 ] != 0 :
            print ( - 1 )
            return
        cnt = 0
        for i in range ( 1 , n ) :
            if self.a [ i - 1 ] < self.a [ i ] :
                if self.a [ i ] - self.a [ i - 1 ] != 1 :
                    print ( - 1 )
                    return
                cnt += 1
            else :
                cnt += self.a [ i ]
        print ( cnt )
    def main ( self ) :
        with open ( "/tmp/main.py" , "r" ) as sc :
            return Main ( )
