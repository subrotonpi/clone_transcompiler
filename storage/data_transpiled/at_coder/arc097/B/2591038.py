def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        n = sc.recv_number ( )
        m = sc.recv_number ( )
        p = [ sc.recv_number ( ) for _ in range ( n ) ]
        data = [ ]
        self.init ( n , data )
        for i in range ( m ) :
            self.link ( sc.recv_number ( ) , sc.recv_number ( ) , data )
        cnt = 0
        for i in range ( n ) :
            if self.is_same ( i + 1 , p [ i ] , data ) :
                cnt += 1
        print ( cnt )
    def __init__ ( self , n , data ) :
        for i in range ( n ) :
            data [ i ] = i + 1
    def link ( self , x , y , data ) :
        data [ self.root ( x , data ) - 1 ] = self.root ( y , data )
    def isSame ( self , x , y , data ) :
        return self.root ( x , data ) == self.root ( y , data )
    def root ( self , p , data ) :
        return ( self.root ( p - 1 , data ) , p )
    def main ( self ) :
        with open ( "/tmp/" , "r" ) as sc :
            eval ( sc )
