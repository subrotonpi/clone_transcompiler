def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.stdin.read ( )
        self.num_c = sys.stdin.read ( )
        self.connect = [ ]
        for i in range ( self.num + 1 ) :
            self.connect.append ( [ True ] * self.num_c )
        self.max = 1
        for i in range ( 1 , pow ( 2 , num ) + 1 ) :
            group = [ ]
            count = 0
            for j in range ( 1 , num + 1 ) :
                group.append ( ( i & ( 1 << ( j - 1 ) ) ) != 0 )
                count += 1 if group [ j ] else 0
            can_be = True
            for j in range ( 1 , num + 1 ) :
                for k in range ( 1 , num + 1 ) :
                    if j == k :
                        pass
                    elif not group [ j ] or not group [ k ] :
                        pass
                    elif connect [ j ] [ k ] or connect [ k ] [ j ] :
                        pass
                    else :
                        can_be = False
                        break
            if can_be :
                self.max = max ( self.max , count )
        print ( self.max )
