def import f
class Main ( object ) :
    def __init__ ( self ) :
        self.s = 1
        self.record = { }
        self.record [ s ] = True
        count = 1
        while True :
            self.s = self.f ( s )
            count += 1
            if self.record.has_key ( self.record [ s ] ) :
                print ( count )
                break
            self.record [ self.record [ s ] ] = True
    def f ( self , n ) :
        if n % 2 == 0 :
            return self.n / 2
        return 3 * self.n + 1
