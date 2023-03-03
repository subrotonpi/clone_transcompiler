def import _solve_case
class Rotate ( _solve_case ) :
    def __init__ ( self ) :
        sc = _solve_case
        self.T = sc.__next__ ( )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % i , end = "" )
            self.solve_case ( )
    def solve_case ( self ) :
        N , K = self.T
        ch = [ ]
        for i , str in enumerate ( sc ) :
            for j in range ( N ) :
                ch [ j ] [ N - i - 1 ] = str
        for j in range ( N ) :
            for i , empty in enumerate ( range ( N - 1 , - 1 , - 1 ) ) :
                if ch [ i ] [ j ] == '.' : empty += 1
                elif empty > 0 :
                    ch [ i + empty ] [ j ] = ch [ i ] [ j ]
                    ch [ i ] [ j ] = '.'
    blue , red = False , False
    for i in range ( N ) :
        for j in range ( N ) :
            if not blue :
                blue , red = self.check ( ch , i , j , K , 'B' )
            if not red :
                red , red = self.check ( ch , i , j , K , 'R' )
        if blue and red :
            res = "Both"
        elif blue :
            res = "Blue"
        elif red :
            res = "Red"
        else :
            res = "Neither"
        print ( res )
    def check ( self , r , c , len , x ) :
        n = len ( self )
        row , col , prim , sec = self.r + len ( r ) , self.c + len ( c ) , self.prim , self.col , self.sec
        return row , col , prim , sec
