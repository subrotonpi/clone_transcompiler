def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.H , self.W = self.sc.split ( ' ' )
        self.dic = [ self.sc.split ( ' ' ) [ 0 ] for self in self.dic ]
        end = - 1
        for i in self.dic :
            left = 0
            while left < self.H and self.dic [ left ] == '.' :
                left += 1
            if end > left :
                print ( 'Impossible' )
                sys.exit ( )
            end = self.W - 1
            while end >= 0 and self.dic [ end ] == '.' :
                end -= 1
        print ( 'Possible' )
