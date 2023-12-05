def package ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import shlex
    class MainB ( subprocess ) :
        def __init__ ( self ) :
            self.s = ''
            self.cs = [ ]
            self.v = 1
            for k in range ( 4 ) :
                if ( 1 << k ) & self.d [ k ] :
                    self.v *= self.d [ k ]
            self.memo = [ ]
            self.vst = [ ]
            self.pre = [ ]
            self.prevst = [ ]
            if self.v % 2 :
                self.res += dp ( 0 , 0 )
            else :
                self.res -= dp ( 0 , 0 )
        self.out.write ( 'Case #%d: %d\n' % ( self.tst , self.res ) )
    def dp ( self , ci , fac ) :
        if self.ci == 0 :
            x = mod ( self , ci , i )
            t1 = 0
            if self.i == len ( self.s ) - 1 :
                if x == fac :
                    self.res += 1
            else :
                t1 = dp ( self.i + 1 , ( fac - x + v + v ) % v )
                self.res += t1
        else :
            x1 = mod ( self , ci , i )
            x2 = ( v + v - x1 ) % v
            t1 = 0
            if self.i == len ( self.s ) - 1 :
                if x1 == fac :
                    self.res += 1
                if x2 == fac :
                    self.res += 1
            else :
                t1 = dp ( self.i + 1 , ( fac - x1 + v + v ) % v )
                self.res += t1
                t1 = dp ( self.i + 1 , ( fac - x2 + v + v ) % v )
                self.res += t1
        self.memo [ self.i ] = self.res
        return self.res
    def main ( self ) :
        cin = subprocess.Popen ( [ 'D:\\topcoder\\.eclipse-workspace.in' , '-' , '-' ] , stdout = subprocess.