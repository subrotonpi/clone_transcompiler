def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.s_ = self.s.split ( '' )
        num = ''
        num_list = [ ]
        mindif = sys.maxint
        for i in range ( len ( self.s_ ) - 2 ) :
            num = self.s_ [ i ] + self.s_ [ i + 1 ] + self.s_ [ i + 2 ]
            num_list.append ( int ( num ) )
            dif = 0
            if num_list [ i ] <= 753 :
                dif = 753 - num_list [ i ]
            else :
                dif = num_list [ i ] - 753
            if dif <= mindif :
                mindif = dif
        print ( mindif )
