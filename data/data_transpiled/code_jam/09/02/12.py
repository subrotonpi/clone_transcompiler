def import _sys , _time
class Watersheds ( object ) :
    def __init__ ( self , t , h , w ) :
        self.t = t
        self.h = h
        self.w = w
        self.nums = [ ]
        self.current = 'a'
        self._time = _time
    def flow ( self , i , j ) :
        if self.result [ i ] [ j ] == ' ' :
            self.nn , self.ww , self.ee , self.ss = self.nums [ i ] [ j ]
            self.num = self.nums [ i - 1 ] [ j ]
            self.nn = ( self.nums [ i ] [ j ] ) if self.nums [ i ] [ j ] == 'a' else 50000
            self.ee = ( self.nums [ i ] [ j + 1 ] ) if self.nums [ i ] [ j ] != 'a' else 50000
            self.ss = ( self.nums [ i + 1 ] [ j ] ) if self.nums [ i ] [ j ] == 'b' else 50000
        self.current += 1
        self.current += 1
        self.current += 1
    def solve ( self ) :
        self.current = 'a'
        self.result = [ ]
        self.current = 'a'
        for i , line in enumerate ( self.input ) :
            self.current += 1
        for j , k in enumerate ( self.nums ) :
            self.current += 1
