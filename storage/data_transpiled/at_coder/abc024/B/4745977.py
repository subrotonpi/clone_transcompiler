def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdscr = sys.stdscr
        self.n , t , tmp = self.stdscr.getmaxyx ( )
        a , i , s = 0 , 0 , 0
        for i in range ( 1 , n ) :
            a = self.stdscr.getmaxyx ( )
            if t > a - tmp :
                s += a - tmp
            else :
                s += t
            tmp = a
        s += t
        print ( s )
