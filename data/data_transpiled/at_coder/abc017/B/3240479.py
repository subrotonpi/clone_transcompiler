def import _readline
import re
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.prelen = len ( self.stdout )
        flg = True
        while 0 < len ( self.stdout ) :
            self.stdout = re.sub ( r'ch$' , '' , self.stdout )
            self.stdout = re.sub ( r'o$' , '' , self.stdout )
            self.stdout = re.sub ( r'k$' , '' , self.stdout )
            self.stdout = re.sub ( r'u$' , '' , self.stdout )
            if self.prelen == len ( self.stdout ) :
                flg = False
                break
            self.prelen = len ( self.stdout )
        print ( 'YES' if flg else 'NO' )
