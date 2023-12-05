def import import sys
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        data = [ ]
        for i in range ( self.n ) :
            data.append ( sc.read ( ) )
        cnt = 0
        for b in range ( self.n ) :
            if self.check ( data , b , n ) :
                cnt += self.n
        print ( cnt )
    def check ( data , b , n ) :
        for i in range ( self.n ) :
            for j in range ( i + 1 , self.n ) :
                if data [ i ] [ ( j + b ) % n ] != data [ j ] [ ( i + b ) % n ] :
                    return False
        return True
    def run ( self ) :
        with open ( "/proc/self/" , "r" ) as sc :
            Main ( sc )
