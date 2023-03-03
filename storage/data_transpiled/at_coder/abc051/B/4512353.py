def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.K = self.K
        self.S = self.S
    def __repr__ ( self ) :
        return "%s %s" % ( self.K , self.S )
    counter = 0
    for X in range ( 0 , K ) :
        for Y in range ( 0 , K ) :
            Z = S - X - Y
            if Z >= 0 and Z <= K :
                counter += 1
    sys.stdout.write ( "%s" % counter )
