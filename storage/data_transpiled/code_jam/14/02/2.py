def import import sys
class B ( object ) :
    def __init__ ( self ) :
        self.case = 1
    def run ( self ) :
        self.case = 2
    def run ( self ) :
        self.case = 2
    def run ( self ) :
        self.case = 3
        for i in range ( 1 , self.cases + 1 ) :
            rate = 2
            c = self.case.c
            f = self.case.f
            x = self.case.x
            best = x / rate
            base = next = best
            while next <= best :
                if next < best :
                    best = next
                base += c / rate
                rate += f
                next = base + x / rate
            print ( "Case #%d: %.7f\n" % ( i , best ) )
