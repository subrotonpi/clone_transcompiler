def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            sc = sys.stdin
            a , b = map ( int , sc.split ( '\n' ) )
            if a * b % 2 == 0 :
                print ( 'No' )
            else :
                print ( 'Yes' )
        except :
            print ( 'out' )
