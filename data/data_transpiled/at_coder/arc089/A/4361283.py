def _import ( ) : return int ( raw_input ( ) )
import math
import time
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def __next__ ( self , n ) :
        return intbv ( 0 ) [ n : ]
    def __next__ ( self ) :
        return intbv ( 0 ) [ n : ]
    def __next__ ( self , * ar ) :
        ar.sort ( )
        return ar [ - 1 ]
    def __next__ ( self , * ar ) :
        ar.sort ( )
        return ar [ 0 ]
    def yesno ( self , b ) :
        return "Yes" if b else "No"
    def main ( self ) :
        n = int ( raw_input ( ) )
        x , y = 0 , 0
        t_sum = 0
        F = True
        for i in range ( n ) :
            t = random.random ( ) - t_sum
            t_sum += t
            tempx = random.random ( )
            tempy = random.random ( )
            if x == tempx and y == tempy :
                F = False
                break
            dist = calc_manhat_distance ( x , y , tempx , tempy )
            if dist > t or dist % 2 != t % 2 :
                F = False
                break
            x , y = tempx , tempy
        print ( yesno ( F ) )
    def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calc_euclid_distance ( x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
