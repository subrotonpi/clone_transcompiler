def import _solve
class b ( object ) :
    def __init__ ( self , key , msg ) :
        self.key = key
        self.msg = msg
        self.reset_k = 0
    def main ( self ) :
        stdin = _solve.stdin
        num_cases = len ( self.keys )
        for loop in range ( 1 , num_cases + 1 ) :
            self.key_len = self.keys [ loop ]
            self.msg_len = self.keys [ loop ]
            self.keys = self.keys [ loop ]
            self.msg = self.msg [ loop ]
            self.reset_k = 0
            for i in range ( 1 , len ( self.keys ) ) :
                if self.match ( self.keys [ i ] , self.msg [ i ] ) :
                    self.reset_k = self.keys [ i ]
                    break
        self.memo = [ self.key , self.msg [ i ] ]
        for i in range ( 0 , len ( self.memo ) ) :
            self.memo [ i ] = - 1.0
        self.max = self.get_max ( )
        self.res = 0
        if self.max > 0 :
            self.res = self.solve ( 0 , 0 )
        print ( "Case #%d: %.7f\n" % ( self.loop , self.max - self.res ) )
    def get_max ( self ) :
        for i in range ( 0 , msg_len ) :
            if not self.keys [ i ] in self.memo :
                return 0
        res = [ self.key ]
        for i in range ( 0 , len ( self.keys ) ) :
            if self.best [ i ] == self.msg [ i ] :
                self.cnt += 1
        return self.cnt
    def solve ( self , key , msg ) :
        if self.key == self.key :
            return self.memo [ self.key ]
        if self.key == self.key :
            return self.key
        return self.cnt
return b
