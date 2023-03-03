def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.r , self.c , self.k , self.n = _main.args ( )
    def __init__ ( self ) :
        self.r , self.c , self.k , self.n = _main.args ( )
    def __init__ ( self ) :
        self.s = [ ]
        self.t = [ ]
        self.r_candies = [ ]
        self.c_candies = [ ]
        for i in range ( self.n ) :
            row = self.r - 1
            col = self.c - 1
            self.s.append ( row )
            self.t.append ( col )
            self.r_candies.append ( row )
            self.c_candies.append ( col )
    dict_h = { }
    dict_w = { }
    for i in range ( self.r ) :
        dict_h.merge ( self.r_candies [ i ] , 1 , sum )
    for i in range ( self.c ) :
        dict_w.merge ( self.c_candies [ i ] , 1 , sum )
    ans = 0
    for key , value in dict_h.items ( ) :
        if k - key in dict_w :
            ans += value * dict_w [ k - key ]
    for i in range ( self.n ) :
        if self.r_candies [ self.s [ i ] ] + self.c_candies [ t [ i ] ] == self.k :
            ans -= 1
        if self.r_candies [ self.s [ i ] ] + self.c_candies [ t [ i ] ] == self.k + 1 :
            ans += 1
    print ( ans )
