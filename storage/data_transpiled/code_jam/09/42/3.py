def _import ( ) : return _import ( )
import text
import math
import os
class Main ( object ) :
    taskname = "B-large"
    def solve ( self ) :
        ntests = self.iread ( )
        for ntest in range ( 1 , ntests + 1 ) :
            u = self.iread ( )
            for v in range ( self.left , self.right + 1 ) :
                if u == self.left : continue
                if u > self.right : continue
                self.dyn [ self.y + 1 ] [ u ] = self.dread ( ) + abs ( v ) + 1
    def read ( self ) :
        try :
            f = open ( self.taskname + ".in" , "r" )
            out = open ( self.taskname + ".out" , "w" )
            self.solve ( )
            out.flush ( )
        except :
            sys.exit ( 1 )
    def read ( self ) :
        return int ( self.readword ( ) )
    def dread ( self ) :
        return float ( self.readword ( ) )
    def read ( self ) :
        return int ( self.dread ( ) )
    def lread ( self ) :
        return long ( self.readword ( ) )
    def write ( self , out ) :
        b = [ ]
        for u in range ( self.left ) :
            if u == self.left : continue
            if u > self.right : continue
            b.append ( chr ( u ) )
        return b
    def main ( self ) :
        self.run ( )
