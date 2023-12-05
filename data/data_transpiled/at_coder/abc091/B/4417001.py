def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.d = { }
        self.n = self.sc.count ( )
        for po in self.d :
            self.d [ po ] = ( self.d [ po ] + 1 if po in self.d else 1 )
        self.m = self.sc.count ( )
        for po in self.d :
            self.d [ po ] = ( self.d [ po ] - 1 if po in self.d else - 1 )
    ans = 0
    for key in self.d :
        ans = max ( ans , self.d [ key ] )
    print ( ans )
