def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.str1 = sys.stdin.readline ( )
        self.str2 = sys.stdin.readline ( )
        flag1 = ( str1 == 'H' )
        flag2 = ( str2 == 'H' )
        flag2 = ( flag1 if flag1 else not flag2 )
        print ( 'H' if flag2 else 'D' )
