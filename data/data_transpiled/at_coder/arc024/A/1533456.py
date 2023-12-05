def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.l = [ ]
        self.r = [ ]
        self.L = [ ]
        self.R = [ ]
        self.l = [ ]
        self.r = [ ]
        for i in range ( self.L ) :
            self.l.append ( _main.get ( i ) )
        for i in range ( self.R ) :
            self.r.append ( _main.get ( i ) )
        ans = 0
        for target in self.l :
            if self.size [ target ] :
                continue
            ans += min ( self.lcount ( target ) , self.rcount ( target ) )
            self.size [ target ] = True
        print ( ans )
    def lcount ( self ) :
        count = 0
        for target in self.l :
            if self.l == target :
                count += 1
        return count
    def rcount ( self ) :
        count = 0
        for target in self.r :
            if self.r == target :
                count += 1
        return count
