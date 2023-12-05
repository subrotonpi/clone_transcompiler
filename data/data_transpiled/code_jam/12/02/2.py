def import import sys , StringIO , traceback
class B ( object ) :
    def __init__ ( self , f , tb ) :
        self.f = f
        self.tb = tb
    def __init__ ( self , f , tb ) :
        self.f = f
        self.tb = tb
        self.tb = tb
    def print_result ( self ) :
        n , p , s = self.f.readline ( ).split ( )
        p = self.p
        if p > 1 :
            surprize = ( 3 * p ) - 4
            good = ( 3 * p ) - 2
        else :
            surprize = p
            good = p
        tot = 0
        for i in range ( n ) :
            cur = self.f.readline ( ).split ( ) [ 0 ]
            if cur >= good :
                tot += 1
            elif cur >= surprize and s > 0 :
                s -= 1
                tot += 1
        self.f.write ( tot )
