def _import ( ) : return sys.stdin.readline ( )
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.V = 0
    def solve_big ( self , a , c ) :
        self.curMax = 0
        res = 0
        a.sort ( )
        for i in a :
            while self.curMax < a [ i ] - 1 :
                self.curMax = self.curMax + ( self.curMax + 1 ) * c
                res += 1
            self.curMax += c * a [ i ]
        while self.curMax < V :
            self.curMax = self.curMax + ( self.curMax + 1 ) * c
            res += 1
        return res
    def solve ( self , test_number , f , out ) :
        out.write ( "Case #%d: " % self.test_number )
        c , d , V = random.randint ( 1 , 10 ) , random.randint ( 1 , 10 )
        a = [ random.randint ( 1 , 10 ) for i in range ( d ) ]
        out.write ( solve_big ( a , c ) )
    def main ( self ) :
        f = open ( "input.txt" , "r" )
        out = open ( "output.txt" , "w" )
        t = f.tell ( )
        for test in range ( 1 , t + 1 ) :
            Main ( ).solve ( test , f , out )
        f.close ( )
        out.close ( )
class FastScanner ( object ) :
    def __init__ ( self , fh ) :
        self.fh = fh
        self.fh = fh
        self.next = None
    def readline ( self ) :
        while not self.fh or not self.fh :
            try :
                line = self.fh.readline ( )
            except EOFError :
                raise
            if not line :
                return None
            self.fh = self.fh
        return self.readline ( )
    def readline ( self ) :
        try :
            line = self.fh.readline ( )
        except EOFError :
            raise EOFError
        return line
