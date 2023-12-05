def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.day = sys.argv [ 1 ]
        if self.day == 'Monday' :
            self.sleep ( 5 )
        elif self.day == 'Tuesday' :
            self.sleep ( 4 )
        elif self.day == 'Wednesday' :
            self.sleep ( 3 )
        elif self.day == 'Thursday' :
            self.sleep ( 2 )
        elif self.day == 'Friday' :
            self.sleep ( 1 )
        else :
            self.sleep ( 0 )
