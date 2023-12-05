def _import ( ) : return _import ( )
import math
import os
import os
import os
import math
class Solution :
    def __init__ ( self ) :
        Scanner = open ( 'input.txt' , 'w' )
        self.caseCnt = 1
        self.caseNum = 0
        self.caseNum = 1
        self.caseNum = 0
        self.caseNum = 0
        self.caseNum = 1
        self.caseNum = 0
        self.caseNum = 0
    def __call__ ( self , args ) :
        self.caseNum = args [ 0 ]
        self.caseNum = args [ 1 ]
        self.caseNum = args [ 2 ]
        self.caseNum = args [ 3 ]
    def my_atan ( dy , dx ) :
        if dx == 0 : return ( self.caseNum / 2 )
        if dx > 0 : return math.atan ( dy / float ( dx ) )
        if dy < 0 : return math.atan ( dy / float ( dx ) ) - math.pi
        return math.atan ( dy / float ( dx ) ) + math.pi
    def go ( angle , dist_left , cur_x , cur_y ) :
        min_rotate = 100.0
        min_dist = 1e100
        res_angle = - 100.0
        next_x , next_y = - 1 , - 1
        for i in range ( N ) :
            if x [ i ] == cur_x and y [ i ] == cur_y : continue
            dist = math.sqrt ( ( cur_y - y [ i ] ) ** 2 + ( cur_x - x [ i ] ) ** 2 )
            if dist > dist_left - 1e-9 : continue
            next_angle = my_atan ( y [ i ] - cur_y , x [ i ] - cur_x )
            diff = next_angle - angle
            while diff >= 2 * math.pi + 1e-9 : diff -= 2 * math.pi
            while diff < - 1e-9 : diff += 2 * math.pi
            if diff < min_rotate - 1e-9 or diff < min_rotate + 1e-9 and dist > min_dist :
                min_rotate = diff
                min_dist = dist
                res_angle = next_angle
                next_x , next_y = x , y
    return ( min_dist , dist_left , min_dist , min_rotate , min_dist , min_dist )
