def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.str = string
        self.st_num = 0
        self.s_num = 0
        for c in string.ascii_uppercase :
            if c == 'S' :
                self.s_num += 1
            else :
                if self.s_num > 0 :
                    self.s_num -= 1
                    self.st_num += 1
        self.out.println ( len ( string.ascii_uppercase ) - self.st_num * 2 )
