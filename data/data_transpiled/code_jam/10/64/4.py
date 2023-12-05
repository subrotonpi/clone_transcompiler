def _import ( ) :
    import os
    import math
    import os
    import os
    import os
    import sys
    class Solution ( object ) :
        def __init__ ( self ) :
            Scanner ( ).__init__ ( self )
            self.caseCnt = 0
            self.caseNum = 0
            self.F = math.factorial
            self.N = 0
            self.X = [ ]
        def inputData ( self ) :
            self.N = self.sc.randint ( 0 , self.N )
            self.X = [ ]
            for i in range ( self.caseCnt ) :
                self.X.append ( self.sc.randint ( 0 , self.N ) )
            self.F = self.sc.randint ( 0 , self.N )
            self.X.sort ( )
        def doit ( self ) :
            return self.res
        def rec ( pos , balance , have ) :
            if pos == self.border :
                self.left [ balance ].append ( have )
                return
            self.rec ( pos + 1 , balance , have )
            self.rec ( pos + 1 , balance + 1 , have - 2 * self.X [ pos ] )
            if self.balance > 1 :
                self.rec ( pos + 1 , balance - 1 , have + 2 * self.X [ pos ] )
            return
        def rec1 ( pos , ini , balance , have ) :
            if pos == self.N :
                if balance == 0 :
                    self.right [ ini ].append ( have )
                return
            if pos == self.N - 1 :
                if balance > 0 :
                    self.rec1 ( pos + 1 , ini , balance - 1 , have + 2 * self.X [ pos ] )
                return
            self.rec1 ( pos + 1 , ini , balance , have )
            self.rec1 ( pos + 1 , ini , balance , have )
            if balance > 1 :
                self.rec1 ( pos + 1 , ini , balance - 1 , have + 2 * self.X [ pos ] )
    return Solution
