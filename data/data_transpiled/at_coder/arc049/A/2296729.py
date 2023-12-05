def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.a , self.b , self.c , self.d = self.s.split ( '' )
        print ( self.s [ 0 : a ] , end = '' )
        print ( self.s [ a : b ] , end = '' )
        print ( self.s [ b : c ] , end = '' )
        print ( self.s [ c : d ] , end = '' )
        print ( self.s [ d : ] )
