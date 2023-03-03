def import _solve_case
class Bacteria ( object ) :
    def __init__ ( self ) :
        self.T = len ( self.T )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s" % ( i , self.solvecase ( ) ) )
    def solvecase ( ) :
        grid = [ False ] * 300
        temp = [ False ] * 300
        R = len ( self.T )
        for i in range ( R ) :
            x1 , y1 = self.T
            x2 , y2 = self.T
            x1 -= 1
            x2 -= 1
            y1 -= 1
            y2 -= 1
            for x in range ( x1 , x2 + 1 ) :
                for y in range ( y1 , y2 + 1 ) :
                    grid [ y ] [ x ] = True
        res = 0
        while True :
            alive = False
            for i in range ( len ( grid ) ) :
                for j in range ( len ( grid [ i ] ) ) :
                    alive |= grid [ i ] [ j ]
                if not alive :
                    break
            for arr in temp :
                arr [ arr ] = False
            for i in range ( len ( grid ) ) :
                for j in range ( len ( grid [ i ] ) ) :
                    north = i > 0 and grid [ i - 1 ] [ j ]
                    west = j > 0 and grid [ i ] [ j - 1 ]
                    temp [ i ] [ j ] = ( grid [ i ] [ j ] and ( north or west ) ) or ( north and west )
        t = temp
        temp = grid
        grid = t
        res += 1
    return res
