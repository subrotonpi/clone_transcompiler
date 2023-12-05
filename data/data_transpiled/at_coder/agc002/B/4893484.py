def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
    boxes = [ ]
    reds = [ 1 ]
    for i in range ( self.m ) :
        x = self.n - 1
        y = self.n - 1
        if boxes [ x ] == 1 and reds [ x ] :
            reds [ x ] = False
            reds [ y ] = True
        elif reds [ x ] :
            reds [ y ] = True
        boxes [ x ] -= 1
        boxes [ y ] += 1
    count = 0
    for b in reds :
        if b :
            count += 1
    print ( count )
