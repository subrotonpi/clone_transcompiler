def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.set = set ( )
        self.arr = [ ]
        self.max = 0
        self.start = 0
        for a in _main ( ) :
            self.arr.append ( a )
            if a in self.set :
                while self.arr [ start ] != a :
                    self.set.remove ( self.arr [ start ] )
                    self.start += 1
                self.start += 1
            else :
                self.set.add ( a )
                v = len ( self.set )
                if self.max < v :
                    self.max = v
    print ( self.max )
