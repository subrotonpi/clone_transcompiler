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
        def lis ( self , y , left , right ) :
            if right - left <= 1 :
                return right
            index = left + ( right - left + 1 ) / 2
            if self.dp [ index ] >= y :
                return self.dp [ index ]
        def lis ( self , y , left , right ) :
            return self.dp [ index ]
    def lis ( self , y , left , right ) :
        if right - left <= 1 :
            return right
        index = left + ( right - left + 1 ) / 2
        if self.dp [ index ] >= y :
            return self.dp [ index ]
        else :
            return self.lowerBound ( y , left , right )
    def lis ( self , y , left , right ) :
        if self.dp [ index ] == y :
            exist = False
            for i in range ( self.N ) :
                x , y = self.dp [ index ]
                if x == x1 and y1 < y < y2 :
                    exist = True
            print ( 100L * ( y2 - y1 ) + ( ( not exist ) and 0 ) or 10 * math.pi - 20 )
    elif self.dp [ index ] == y :
        exist = False
        if self.dp [ index ] > x2 :
            sp = x2
            x2 = x1
            x1 = sp
        for i in range ( self.N ) :
            x , y = self.dp [ index ]
            if y == y1 and x < x2 :
                exist = True
        print ( 100L * ( x2 - x1 ) + ( ( not exist ) and 0 ) or 10 * math.pi - 20 )
    else :
        queue = [ ]
        for