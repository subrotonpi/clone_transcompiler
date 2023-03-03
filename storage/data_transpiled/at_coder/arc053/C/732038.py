def import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def __init__ ( self , x , y ) :
        self.x , self.y = x , y
    def __lt__ ( self , p ) :
        return self.x - p.x
    def main ( self ) :
        sc = sys.stdin
        self.n = sc.n
        self.ab = [ ]
        sp1 , sp2 = 0 , 0
        for i in range ( self.n ) :
            a , b = sc.read ( ).split ( ' ' )
            if a - b < 0 :
                self.ab [ 0 ].append ( ( a , b ) )
            else :
                self.ab [ 1 ].append ( ( - b , a ) )
        self.ab [ 0 ].sort ( )
        self.ab [ 1 ].sort ( )
        self.max_tmp , tmp = 0 , 0
        for i in range ( sp1 ) :
            tmp += self.ab [ 0 ] [ i ] [ 0 ]
            self.max_tmp = max ( self.max_tmp , tmp )
            tmp -= self.ab [ 0 ] [ i ] [ 1 ]
        for i in range ( sp2 ) :
            tmp += self.ab [ 1 ] [ i ] [ 1 ]
            self.max_tmp = max ( self.max_tmp , tmp )
            tmp += self.ab [ 1 ] [ i ] [ 0 ]
        print ( self.max_tmp )
