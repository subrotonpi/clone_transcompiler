def import import os , sys , f
from io import StringIO
import sys
from io import StringIO
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Takahashi = "Takahashi"
        self.Aoki = "Aoki"
        self.N = 1
        self.odd = False
    def f ( self ) :
        turn = True
        num = 1
        while num <= self.N :
            if self.turn :
                if self.odd :
                    num = 2 * num + 1
                else :
                    num = 2 * num
            else :
                if self.odd :
                    num = 2 * num
                else :
                    num = 2 * num + 1
            self.turn = not self.turn
        flg = True
        if not self.turn :
            flg = False
        return flg
    def main ( ) :
        import sys
        try :
            with open ( sys.argv [ 1 ] , 'r' ) as f :
                s = f.read ( )
            f.write ( s )
        except :
            sys.stderr.write ( "Error: could not read %s" % sys.argv [ 1 ] )
    sys.stdout = sys.__stdout__
    sys.stderr = f
    N = int ( N )
    depth = 0
    for i in range ( N , 0 , i , 2 ) :
        depth += 1
    odd = depth % 2 == 1
    if f ( ) :
        sys.stdout.write ( Takahashi )
    else :
        sys.stdout.write ( Aoki )
    sys.stdout.flush ( )
