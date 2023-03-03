def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
    def __iter__ ( self ) :
        for i in range ( self.m ) :
            yield ( self.n , self.m )
    def sorted ( self , b1 , b2 ) :
        if b1.end == b2.end :
            return b1.start - b2.start
        else :
            return b1.end - b2.end
    def count ( self ) :
        count = 0
        while self.b :
            b = self.b
            while self.out :
                out = self.out
                if out.start >= b.end :
                    break
                self.out.start = out.start
            count += 1
        print ( count )
    class Bridge ( object ) :
        def __init__ ( self , start , end ) :
            self.start = start
            self.end = end
        def __hash__ ( self ) :
            return self.start + self.end * 1000
        def __eq__ ( self , other ) :
            b = self.b
            return b.start == start and b.end == end
