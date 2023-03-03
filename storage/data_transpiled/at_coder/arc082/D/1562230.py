def _main ( ) : return
import sys
import time
class Main ( ) :
    def __init__ ( self ) :
        self.max = 0
    def __init__ ( self , left_x , right_x ) :
        self.left_x = left_x
        self.right_x = right_x
        self.left_const = left_const
        self.right_const = right_const
    def get ( self , x ) :
        if x <= left_x :
            return self.left_const
        elif x >= right_x :
            return self.right_const
        else :
            return left_const + ( x - left_x )
    def up ( self , value ) :
        if self.left_const + value >= self.max :
            return self.left_const
        elif self.right_const + value >= self.max :
            diff = self.right_const + value - self.max
            return self.left_x , self.right_x - diff , self.left_const + value , self.max
        else :
            return self.left_x , self.right_x , self.left_const + value , self.right_const + value
    def down ( self , value ) :
        if self.right_const - value <= 0 :
            return self.right_const - value
        elif self.left_const - value <= 0 :
            diff = value - self.left_const
            return self.left_x + diff , self.right_x , self.max
        else :
            return self.left_x , self.right_x , self.left_const - value , self.max
    def solve ( self ) :
        self.max = time.time ( )
        k = time.time ( )
        r = [ ]
        for i in range ( k + 1 ) :
            r.append ( time.time ( ) )
        r.append ( int ( 1e9 ) )
        q = time.time ( )
        t , a = [ ] , [ ]
        cur = Data ( 0 , max , 0 , max )
        ptr = 0
        for i in range ( len ( r ) ) :
            prev_time = i == 0
        return cur
