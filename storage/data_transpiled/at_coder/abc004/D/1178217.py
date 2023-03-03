def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.R = sys.stdin.read ( )
        self.G = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.minCost = sys.maxint
        for i in range ( - 349 , 50 ) :
            rcost = gcost = bcost = 0
            for j in range ( i , i + G ) :
                gcost += int ( abs ( j ) )
            if i <= - 99 :
                for j in range ( i - R , i ) :
                    rcost += int ( abs ( j + 100 ) )
            else :
                s = ( R - 1 ) / 2
                t = ( R - 1 ) - s
                if s <= i + 99 :
                    rcost = ( s * ( s + 1 ) ) / 2 + ( t * ( t + 1 ) ) / 2
                else :
                    for j in range ( i - R , i ) :
                        rcost += int ( abs ( j + 100 ) )
            if i + G >= 100 :
                for j in range ( i + G , i + G + B ) :
                    bcost += int ( abs ( j - 100 ) )
            else :
                u = ( B - 1 ) / 2
                v = ( B - 1 ) - u
                if u <= 100 - ( i + G ) :
                    bcost = ( u * ( u + 1 ) ) / 2 + ( v * ( v + 1 ) ) / 2
                else :
                    for j in range ( i + G , i + G + B ) :
                        bcost += int ( abs ( j - 100 ) )
            minCost = min ( minCost , rcost + gcost + bcost )
        print ( minCost )
