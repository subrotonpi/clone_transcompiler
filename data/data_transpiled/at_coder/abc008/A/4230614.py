def import import os , myopen
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = myopen
        a = myopen ( )
        b = myopen ( )
        print ( b - a + 1 )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    def write ( self , data ) :
        self.out = data
    def readline ( self ) :
        while not self.out or not self.out :
            try :
                self.out = os.popen ( "readline %s " % self.readline ).read ( )
            except IOError :
                pass
        return self.out
    def readline ( self ) :
        while not self.out or not self.out :
            try :
                self.out = os.popen ( "readline %s " % self.readline ).read ( )
            except IOError :
                pass
        return self.out
