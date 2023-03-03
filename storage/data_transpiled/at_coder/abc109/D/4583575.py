def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = sys.stdin.read ( )
        self.w = sys.stdin.read ( )
    def __init__ ( self , * args ) :
        self.d = [ ]
        self.list = [ ]
        self.jud = False
        for i in range ( self.h ) :
            for j in range ( self.w ) :
                self.dict [ i ] [ j ] = self.d [ j ]
    def jud ( self ) :
        for i in range ( self.h ) :
            if i % 2 == 0 :
                for j in range ( self.w ) :
                    if self.jud :
                        if j == 0 :
                            self.list.append ( "%d %d %d %d" % ( i , self.j + 1 , self.i + 1 , self.j + 1 ) )
                            self.sum += 1
                        else :
                            self.list.append ( "%d %d %d %d" % ( i + 1 , self.j + 1 , self.i + 1 , self.j + 1 ) )
                            self.sum += 1
                    if self.dict [ i ] [ j ] % 2 == 1 :
                        jud = not self.jud
            else :
                for j in range ( self.w - 1 , - 1 , - 1 ) :
                    if self.jud :
                        if j == self.w - 1 :
                            self.list.append ( "%d %d %d %d" % ( i , self.j + 1 , self.i + 1 , self.j + 1 ) )
                            self.sum += 1
                        else :
                            self.list.append ( "%d %d %d %d" % ( i + 1 , self.j + 2 , self.i + 1 , self.j + 1 ) )
                            self.sum += 1
                    if self.dict [ i ] [ j ] % 2 == 1 :
                        jud = not self.jud
    print ( sum ( self ) )
    