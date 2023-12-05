def import root
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.n = sc.n
        self.m = sc.m
        self.p = [ ]
        self.data = [ ]
        for i in range ( self.n ) :
            self.p.append ( sc.p [ i ] )
            self.data.append ( i + 1 )
        for i in range ( self.m ) :
            x = root ( self.p , self.data )
            y = root ( self.data , self.data )
            if x != y :
                self.data [ x - 1 ] = y
        cnt = 0
        for i in range ( self.n ) :
            if is_same ( self.p [ i ] , i + 1 , self.data ) :
                cnt += 1
        print ( cnt )
    def is_same ( self , x , y , data ) :
        return root ( x , self.data ) == root ( y , self.data )
    def root ( self , p , data ) :
        if data [ p - 1 ] == p :
            return p
        return data [ p - 1 ] , root ( self.data [ p - 1 ] , self.data )
