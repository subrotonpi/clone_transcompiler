def import import math
import numpy
import numpy
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.size
        self.values = [ ]
        self.distincts = sorted ( [ v for v in sc.values ( ) if v not in self.distincts ] )
        rank = { }
        self.index = 0
        for v in self.distincts :
            rank [ v ] = self.index
            self.index += 1
        for v in self.values :
            print ( rank [ v ] )
