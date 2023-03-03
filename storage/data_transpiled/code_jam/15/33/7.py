def import import _symbol
class Money ( object ) :
    def __init__ ( self , tci ) :
        self.c = _symbol ( tci )
        self.nd = _symbol ( tci )
        self.v = _symbol ( tci )
        self.denoms = [ ]
        best = self.bad = 0
        for i in range ( nd ) :
            d = _symbol ( tci )
            while best < d - 1 :
                best = best + c * ( best + 1 )
                bad += 1
            best = best + c * d
        while best < v :
            best = ( c + 1 ) * ( best + 1 ) - 1
            bad += 1
        print ( "Case #%d: %d\n" % ( tci , bad ) )
    def __init__ ( self ) :
        self.tcn = _symbol ( tci )
        for tci in range ( 1 , tcn + 1 ) :
            self._symbol ( tci )
