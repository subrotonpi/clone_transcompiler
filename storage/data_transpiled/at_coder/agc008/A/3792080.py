def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = object.getcontext ( )
        x = sc.get ( 'x' )
        y = sc.get ( 'y' )
        ans1 = 0
        ans2 = 0
        ans3 = 0
        ans4 = 0
        x1 = x
        x2 = - 1 * x
        y1 = y
        y2 = - 1 * y
        if x1 <= y1 :
            ans1 = abs ( y1 - x1 )
        else :
            ans1 = int ( y1 )
        if x2 <= y1 :
            ans2 = abs ( y1 - x2 ) + 1
        else :
            ans2 = int ( y1 )
        if x1 <= y2 :
            ans3 = abs ( y2 - x1 ) + 1
        else :
            ans3 = int ( y1 )
        if x2 <= y2 :
            ans4 = abs ( y2 - x2 ) + 2
        else :
            ans4 = int ( y1 )
        ans = min ( min ( ans1 , ans2 ) , min ( ans3 , ans4 ) )
        print ( ans )
