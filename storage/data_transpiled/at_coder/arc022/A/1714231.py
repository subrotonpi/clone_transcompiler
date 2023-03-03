def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def __str__ ( self ) :
        return "YES"
    def __repr__ ( self ) :
        S = self.s.split ( ' ' )
    def __eq__ ( self , other ) :
        if other == 'I' or other == 'i' :
            self.iflag = True
            continue
        if self.iflag and ( other == 'C' or other == 'c' ) :
            self.cflag = True
            continue
        if self.cflag and ( other == 'T' or other == 't' ) :
            self.tflag = True
            continue
    if self.iflag and self.cflag and self.tflag :
        print ( "YES" )
    else :
        print ( "NO" )
