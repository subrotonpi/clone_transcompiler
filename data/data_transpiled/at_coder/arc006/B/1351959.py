def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.b = [ int ( i ) for i in self.stdout.readline ( ).split ( ) ]
        self.n = self.b [ 0 ]
        self.l = self.b [ 1 ]
        self.amida = [ line.rstrip ( ) for line in self.amida ]
        lastline = sys.stdin.readline ( )
        pos = 0
        while True :
            if lastline [ pos ] == 'o' :
                break
            else :
                pos += 1
        for i in range ( self.l - 1 , - 1 , - 1 ) :
            if pos > 0 and self.amida [ i ] [ pos - 1 ] == '-' :
                pos -= 2
            elif pos < 2 * self.n - 2 and self.amida [ i ] [ pos + 1 ] == '-' :
                pos += 2
        print ( pos / 2 + 1 )
