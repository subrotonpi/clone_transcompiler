def _solve ( ) :
    import math
    import random
    import random
    import sys
    class Main ( object ) :
        def solve ( self ) :
            with open ( '/dev/null' , 'r' ) as f :
                x1 = f.read ( )
                y1 = f.read ( )
                x2 = f.read ( )
                y2 = f.read ( )
                if y2 < y1 :
                    sp = y2
                    y2 = y1
                    y1 = sp
                    sp = x2
                    x2 = x1
                    x1 = sp
        def lis ( self , left , right ) :
            if right == left :
                return right
            index = ( left + right ) // 2
            if self.dp [ index ] >= y :
                return self.lowerBound ( y , left , index )
            else :
                return self.lowerBound ( y , index + 1 , right )
    def lower_bound ( self , left , right ) :
        if right == left :
            return right
        else :
            return self.lowerBound ( left , right , left )
    def lower_bound ( self , left , right ) :
        if right == left :
            return right
        index = ( left + right ) // 2
        if self.dp [ index ] >= y :
            return self.lowerBound ( y , left , index )
        else :
            return self.lowerBound ( y , left , right )
    def lower_bound ( self , left , right ) :
        if left == right :
            exist = False
            for i in range ( N ) :
                x , y = self.dp [ i ]
                if x == x1 and y1 < y < x2 :
                    exist = True
            print ( 100L * ( y2 - y1 ) + ( ( not exist ) and 0 ) * 10 * math.pi - 20 )
    elif y1 == y2 :
        exist = False
        if x1 > x2 :
            sp = x2
            x2 = x1
            x1 = sp
        for i in range ( N ) :
            x , y = self.dp [ i ]
            if y == y1 and x < x2 :
                exist = True
        print ( 100L * ( x2 - x1 ) + ( ( not exist ) and 0 ) * 10 * math.pi - 20 )
    else :