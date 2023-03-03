def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.str = sys.stdin.read ( )
        self.a , self.b , self.c , self.d = sys.stdin.read ( ).split ( '' )
        self.answer = ""
        for i in range ( len ( self.str ) ) :
            if self.a == i or self.b == i or self.c == i or self.d == i :
                self.answer += " \"
            self.answer += self.str [ i ]
        if self.d == len ( self.str ) :
            self.answer += " \"
        print ( self.answer )
