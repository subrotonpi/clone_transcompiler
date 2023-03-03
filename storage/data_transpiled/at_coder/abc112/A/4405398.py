def import import sys
import string
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = string
    def __call__ ( self , * args , ** kwargs ) :
        try :
            sc = sys.stdin
        except :
            print ( 'out' )
        else :
            n = int ( sc.read ( ) )
            if n == 1 :
                print ( 'Hello World' )
            if n == 2 :
                a , b = map ( int , args )
                a = int ( a )
                b = int ( b )
                print ( a + b )
