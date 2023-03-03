def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if self.a == self.b and self.b == self.c and self.a % 2 == 0 :
            print ( - 1 )
        else :
            count = 0
            while self.a % 2 == 0 and self.b % 2 == 0 and self.c % 2 == 0 :
                ta = self.a
                tb = self.b
                tc = self.c
                self.a , b , c = ( self.tb + tc ) // 2 , ( self.a + tc ) // 2 , ( self.a + tb ) // 2 , ( self.b + tb ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , ( self.b + c ) // 2 , ( self.a + c ) // 2 , )
                