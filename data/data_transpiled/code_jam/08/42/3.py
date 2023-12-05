def _import ( out ) : return out
import sys
import string
import struct
import time
class Main ( object ) :
    taskname = "B-large"
    x1 , y1 , x2 , y2 = struct.unpack ( ">lll" , sys.stdin.read ( 4 ) )
    def check ( self ) :
        out.write ( "Case #%d: 0 0 %d %d %d %d\n" % ( t , x1 , y1 , x2 , y2 ) )
    def solve ( self ) :
        tests = self.iread ( )
        self.main :
            for t in range ( 1 , tests + 1 ) :
                N , M , A = self.iread ( )
                if A > N * M :
                    out.write ( "Case #%d: IMPOSSIBLE\n" % t )
                    continue
                a :
                    for x1 in range ( N , - 1 , - 1 ) :
                        for y2 in range ( M , - 1 , - 1 ) :
                            if x1 * y2 < A :
                                continue
                            A1 = x1 * y2 - int ( A )
                            if A1 == 0 :
                                x2 = y1 = 0
                                self.check ( )
                                continue
                            for u in range ( 1 , 2 ** A1 ) :
                                if A1 % u > 0 :
                                    continue
                                v = int ( A1 / u )
                                if u <= N and v <= M :
                                    x2 = u
                                    y1 = v
                                    self.check ( )
                                    continue
                                if v <= N and u <= M :
                                    x2 = v
                                    y1 = u
                                    self.check ( )
                                    continue
                    out.write ( "Case #%d: IMPOSSIBLE\n" % t )
    def run ( self ) :
        with open ( self.taskname + ".in" , "r" ) as f :
            out = f.write ( "" )
            self.solve ( )
            out.flush ( )
    def iread ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def solve ( self ) :
        return solve