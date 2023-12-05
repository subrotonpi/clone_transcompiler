def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        r_line = self.line
        r = r_line.split ( )
    d = { 'A' : 4 , 'B' : 3 , 'C' : 2 , 'D' : 1 , 'F' : 0 }
    sum = 0
    for c in r :
        sum += d [ c ]
    print ( sum / n )
