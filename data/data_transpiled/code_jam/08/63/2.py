def import _symbol
class Millionaire :
    def __init__ ( self ) :
        sc = _symbol
        for t in range ( 1 , T + 1 ) :
            cur = time.time ( )
            print ( "Case #%d: " % t , end = "" )
            self.MAX = self.MAX
            self.P = self.P
            self.amount = self.amount
            print ( self.compute ( amount ) )
    global MAX
    global P
    def compute ( self , amount ) :
        memo = [ ]
        for i in range ( MAX ) :
            memo.append ( [ - 1.0 ] * ( 1 << ( i + 1 ) ) )
            memo [ i ] = - 1.0
        denom = 1 << self.MAX
        return self.solve ( self.MAX - 1 , int ( amount * denom / 1000000 ) )
    def solve ( self , level , amount ) :
        if amount >= 1 << ( self.level + 1 ) :
            return 1.0
        if amount == 0 :
            return 0.0
        if self.memo [ level ] [ amount ] < - 0.5 :
            res , delta = solve ( self.level - 1 , amount // 2 )
            for i in range ( delta , self.amount + 1 , 2 ) :
                res = max ( res , self.P * solve ( self.level - 1 , ( amount + i ) // 2 ) + ( 1 - P ) * solve ( self.level - 1 , ( amount - i ) // 2 ) )
            self.memo [ level ] [ amount ] = res
        return self.memo [ level ] [ amount ]
