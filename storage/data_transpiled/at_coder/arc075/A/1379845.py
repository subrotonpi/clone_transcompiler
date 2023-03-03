def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdout = string
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.stdout.readline ( )
        self.a = [ 0 ] * 101
        s1 , s2 = 0 , 0
        for i in range ( self.n ) :
            self.stdout.readline ( )
            self.a [ i ] = int ( self.stdout.readline ( ) )
            k = int ( self.stdout.readline ( ) )
            self.a [ k ] += 1
            if k % 10 == 0 :
                s2 += k
            else :
                s1 += k
        if s1 == 0 :
            print ( 0 )
            return
        if self.stdout.readline ( ) % 10 != 0 :
            print ( s1 , s2 )
            return
        for i in range ( 1 , 100 ) :
            if a [ i ] == 0 or i % 10 == 0 :
                continue
            s1 -= i
            break
        print ( s1 , s2 )
