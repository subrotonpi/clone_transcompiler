def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.N = len ( self.stdin )
        self.C = [ ]
        self.S = [ ]
        self.F = [ ]
        self.z , self.y , self.time = 0 , 0 , 0
        while self.z < self.N - 1 :
            self.C.append ( self.stdin.read ( ) )
            self.S.append ( self.stdin.read ( ) )
            self.F.append ( self.stdin.read ( ) )
            self.z += 1
        self.z = 0
        while self.z < self.N - 1 :
            self.y = self.z
            while self.y < self.N - 1 :
                if self.y == 0 :
                    self.time += self.C [ self.y ] + self.S [ self.y ]
                else :
                    if self.time > self.S [ self.y ] :
                        if ( self.time - self.S [ self.y ] ) % self.F [ self.y ] == 0 :
                            self.time += self.C [ self.y ]
                        else :
                            self.time += ( ( self.time - self.S [ self.y ] ) // self.F [ self.y ] + 1 ) * self.F [ self.y ] - ( self.time - self.S [ self.y ] ) + self.C [ self.y ]
                    else :
                        self.time += ( self.S [ self.y ] - self.time ) + self.C [ self.y ]
                self.z += 1
            self.time += 1
        self.time += 1
return Main
