def _import ( ) : return int ( next ( ) )
def _import ( ) : return long ( next ( ) )
def _import ( ) : return float ( next ( ) )
def _import ( ) : return _import ( )
class Main ( ) :
    def __init__ ( self ) :
        sc = _import ( )
        self.N = sc.__next__ ( )
        self.M = sc.__next__ ( )
        for f in range ( self.M ) :
            self.f = sc.__next__ ( )
            self.t = sc.__next__ ( )
            self.nakama [ f ] [ t ] = True
            self.nakama [ t ] [ f ] = True
        t = 1
        for i in range ( self.N ) :
            t *= 2
        for i in range ( 1 , t + 1 ) :
            tmp = i
            for j in range ( 1 , self.N ) :
                if tmp % 2 == 0 :
                    self.zoku [ j ] = False
                elif tmp % 2 == 1 :
                    self.zoku [ j ] = True
                tmp /= 2
            if self.nakama ( ) :
                tmmp = 0
                for ii in range ( 0 , self.N ) :
                    if self.zoku [ ii ] :
                        tmmp += 1
                p = max ( p , tmmp )
        self.pl ( p )
    def _nakama ( ) :
        for i in range ( 1 , self.N ) :
            if self.zoku [ i ] :
                for j in range ( 1 , self.N ) :
                    if i != j :
                        if self.zoku [ j ] :
                            if not self.nakama [ i ] [ j ] :
                                return False
    return Main
