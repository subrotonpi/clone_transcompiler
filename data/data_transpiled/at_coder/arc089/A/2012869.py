def import import sys , stdin , input , check
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.m = Main ( )
        self.input = input
        self.check = check
    def input ( self ) :
        for i in range ( self.token ) :
            num = [ ]
            x = [ ]
            y = [ ]
    def check ( self ) :
        last_num , last_x , last_y = 0 , 0 , 0
        for i in range ( self.token ) :
            move = abs ( x [ i ] - last_x ) + abs ( y [ i ] - last_y )
            if ( num [ i ] - last_num ) < move or ( num [ i ] - last_num ) % 2 != move % 2 :
                print ( "No" )
                return
            else :
                last_num , last_x , last_y = num [ i ] , x [ i ] , y [ i ]
        print ( "Yes" )
        return
