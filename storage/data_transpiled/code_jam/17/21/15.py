def import _csv
import os
import csv
import os
import sys
import sys
class CruiseControl :
    def __init__ ( self ) :
        self.N , self.D = 0 , 0
    def __init__ ( self , * args ) :
        self.N = self.N
        self.S = [ ]
        self.K = [ ]
        self.L = [ ]
        for T in range ( self.T ) :
            self._case += 1
            D , N = self.D , self.N
            self.S = [ ]
            self.K = [ ]
            self.L = [ ]
            for i in range ( self.N ) :
                self.K.append ( self.N [ i ] )
                self.S.append ( self.N [ i ] )
                self.L.append ( ( D - self.K [ i ] ) / self.S [ i ] )
        max = [ ]
        for s in self.L :
            max = max ( max , s )
        ans = D / max
        self.cout.write ( "Case #%d: %.10f\n" % ( self._case , ans ) )
