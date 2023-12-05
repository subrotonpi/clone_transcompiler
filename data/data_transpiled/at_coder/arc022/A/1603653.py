def import input
class Main ( object ) :
    def __init__ ( self ) :
        self.s = input ( )
    def __init__ ( self ) :
        self.s = input ( )
    def __init__ ( self , * args ) :
        self.i_flag = 0
        self.c_flag = 0
        self.t_flag = 0
        for i in range ( len ( self.s ) ) :
            if s [ i ] == 'i' or s [ i ] == 'I' :
                self.i_flag = 1
            if self.i_flag and ( s [ i ] == 'c' or s [ i ] == 'C' ) :
                self.c_flag = 1
            if self.c_flag and ( s [ i ] == 't' or s [ i ] == 'T' ) :
                self.t_flag = 1
        if self.t_flag :
            print ( "YES" )
        else :
            print ( "NO" )
